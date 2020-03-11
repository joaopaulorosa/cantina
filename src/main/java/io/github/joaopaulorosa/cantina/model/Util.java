package io.github.joaopaulorosa.cantina.model;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jo�o Rosa on 01/09/2016.
 */
public class Util {

	private static Util instance = new Util();

	public static String criptografaSenha(String senha) {
		try {
			if (isNullOrBlank(senha)) {
				return "";
			}
			MessageDigest md = MessageDigest.getInstance("MD5");
			BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
			String s = hash.toString(16);
			if (s.length() % 2 != 0) {
				s = "0" + s;
			}
			return s;
		} catch (NoSuchAlgorithmException e) {
			return "";
		}
	}

	public static Boolean isNullOrBlank(String valor){
		if(valor == null || valor.equals("") || valor.trim().equals("")){
			return true;
		} else {
			return false;
		}
	}

	public static Boolean isNotNullAndBlank(String valor){
		if(valor != null && !valor.equals("") && !valor.trim().equals("")){
			return true;
		} else {
			return false;
		}
	}

	public String quebraLinha() {
		return "\015\012";
	}

	public static String removeCaracteresEspeciais(String conteudo) {
		conteudo = Normalizer.normalize(conteudo, Normalizer.Form.NFD);
		conteudo = conteudo.replaceAll("[^\\p{ASCII}]", "").replaceAll("\r","").replaceAll("\t","").replaceAll("\n","").replaceAll("&nbsp;","").replaceAll("[!#$%&*?+=:;<>`']", "").replaceAll("\"", "").replaceAll("`","");
		return conteudo.toUpperCase();
	}

	public static void main(String[] args){
		//        "RUA CURUENA 75 BL 02 AP 33"
		//        "VILA FORMOSA"	"S�O PAULO"	"SP"	"BR"
		//System.out.println(Util.removeCaracteresEspeciais(gabriel));
	}

	public String transformaDataEmString(Date data, String formato){
		SimpleDateFormat formatoData = new SimpleDateFormat(formato);
		if(data != null){
			return formatoData.format(data);
		}else{
			return "";
		}
	}

	public String formataDoubleEmString(Double valor, int numeroCasas){
		DecimalFormat nFormat = new DecimalFormat();
		nFormat.setMaximumFractionDigits(numeroCasas);
		nFormat.setMinimumFractionDigits(numeroCasas);
		String valorString = nFormat.format(valor == null ? 0.0 : valor);
		return valorString;
	}

	//    public String formataCpfCnpj(String cpfCnpj, EnumTipoPessoa tipoPessoa) {
	//        String retorno = "";
	//        try {
	//            cpfCnpj = cpfCnpj.replace(".", "").replace("-", "").replace("/", "");
	//            if (!cpfCnpj.isEmpty()) {
	//                long numero = Long.parseLong(cpfCnpj);
	//                if(tipoPessoa == null || tipoPessoa.equals(EnumTipoPessoa.PESSOA_FISICA)) {
	//                    retorno = String.format("%011d", numero);
	//                } else {
	//                    retorno = String.format("%014d", numero);
	//                }
	//            }
	//        }catch (Exception e) {
	//            e.printStackTrace();
	//        }
	//        return retorno;
	//    }
	public String formataCpf(String cpfCnpj) {
		String retorno = "";
		try {
			cpfCnpj = cpfCnpj.replace(".", "").replace("-", "").replace("/", "");
			if (!cpfCnpj.isEmpty()) {
				long numero = Long.parseLong(cpfCnpj);
				retorno = String.format("%011d", numero);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return retorno;
	}

	public static String primeiraMaiuscula(String s) {
		if (s == null) {
			return "";
		}
		if (s.length() == 0) {
			return s;
		}
		return s.substring(0, 1).toUpperCase() + s.substring(1);
	}

	public static String primeiraMinuscula(String s) {
		if (s == null) {
			return "";
		}
		if (s.length() == 0) {
			return s;
		}
		return s.substring(0, 1).toLowerCase() + s.substring(1);
	}

	public void addLinha(StringBuilder linha){
		linha.append(this.quebraLinha());
	}

	public void addSeparadorColuna(StringBuilder linha) {
		linha.append(";");
	}

	public void addColunaMinuscula(StringBuilder linha, String string) {
		addSeparadorColuna(linha.append((string != null ? removeCaracteresEspeciais(string).toLowerCase() : "")));
	}

	public void addColuna(StringBuilder linha, String string) {
		addSeparadorColuna(linha.append((string != null ? removeCaracteresEspeciais(string) : "")));
	}

	public void addColuna(StringBuilder linha, Integer inteiro){
		addSeparadorColuna(linha.append(inteiro != null ? inteiro.intValue() : ""));
	}

	public void addColuna(StringBuilder linha, Date data){
		addColuna(linha, data, null);
	}

	public void addColuna(StringBuilder linha, Date data, String formato) {
		if(formato == null){
			formato = "yyyy-MM-dd";
		}
		addSeparadorColuna(linha.append(data != null ? this.transformaDataEmString(data, formato) : ""));
	}

	public void addColuna(StringBuilder linha, Double valor){
		addSeparadorColuna(linha.append(valor != null ? this.formataDoubleEmString(valor, 2).replaceAll("\\.", "") : ""));
	}

	public String atualizaInformacao(String valorAnterior, String valorAtual){
		if(isNotNullAndBlank(valorAtual)){
			return valorAtual;
		}
		return valorAnterior;
	}

	public Date atualizaInformacao(Date valorAnterior, Date valorAtual){
		if(valorAtual != null){
			return valorAtual;
		}
		return valorAnterior;
	}

	public Integer atualizaInformacao(Integer valorAnterior, Integer valorAtual){
		if(valorAtual != null){
			return valorAtual;
		}
		return valorAnterior;
	}

	public Double atualizaInformacao(Double valorAnterior, Double valorAtual){
		if(valorAtual != null){
			return valorAtual;
		}
		return valorAnterior;
	}


	public static Util getInstance() {
		return instance;
	}

	public static void setInstance(Util instance) {
		Util.instance = instance;
	}


}

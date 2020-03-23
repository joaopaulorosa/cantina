<%-- 
    Document   : cadastroConta
    Created on : 19/01/2018, 23:11:06
    Author     : joao
--%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <%@ include file="../head.jsp" %>
    <head>
    	<style type="text/css">
    	.tamanhoPagina {
			width: 80%;
		}
		.fonteTitulo {
			font-size: large;
			font-family: sans-serif;
			font-style: inherit;
		}
		.fonteSecao {
			font-size: medium;
			font-family: sans-serif;
		}
		.fonteSubsecao {
			font-size: small;
			font-family: sans-serif;		
		}
    	</style>
    	<script src="<c:url value='/js/cadastro/cadastroConta.js'/>"/></script>
    </head>
    <body ng-app="CantinaApp" ng-controller="CadastroContaController">
        <div class="logoCantina centroPagina">
            <img src="<c:url value='/img/logo_cantina.jpg'/>" class="logoCantina centroPagina"/>
        </div>
        <div class="jumbotron tamanhoPagina centroPagina">
	        <div class="centroPagina fonteTitulo" align="center">
	            <b>
	            CRIE SUA CONTA
	            </b>
	        </div>
	        <br>
	        <br>
	        <div class="centroPagina" style="width: 95%;">
	            <div class="fonteSecao"><b>Informações do Responsável:</b></div>
	            <div><input type="text" class="form-control" style="width:50%; " ng-model="responsavel.cpf" placeholder="CPF" 
	            ng-keyup="buscaevalidaCPF(responsavel, $event);" ng-blur="buscaevalidaCPF(responsavel);" required/></div>
           		<div><input type="text" class="form-control" ng-model="responsavel.nome" placeholder="Nome" required/></div>
           		<div><input type="email" class="form-control" ng-model="responsavel.email" placeholder="E-mail" required/></div>
           		<div><input type="text" class="form-control" ng-model="responsavel.emailAlternativo" placeholder="E-mail Alternativo"/></div>
           		<div><input type="text" class="form-control" style="width:50%;" ng-model="responsavel.cepEndereco" placeholder="CEP" required/></div>
           		<div><input type="text" class="form-control" ng-model="responsavel.logradouroEndereco" placeholder="Endereço"/></div>
           		<div>
           			<table style="width: 100%;">
                    	<tr>
	                     	<td style="width: 50%"><input type="text" class="form-control" ng-model="responsavel.complementoEndereco" placeholder="Complemento"/></td>
							<td style="width: 50%"><input type="text" class="form-control" ng-model="responsavel.bairroEndereco" placeholder="Bairro"/></td>
                     	</tr>
                   	</table>
               	</div>
               	<div>
                   	<table style="width: 100%;">
                		<tr>
	                    	<td style="width: 50%"><input type="text" class="form-control" ng-model="responsavel.cidadeEndereco" placeholder="Cidade"/></td>
	                    	<td style="width: 15%"><input type="text" class="form-control" ng-model="responsavel.ufEndereco" placeholder="UF"/></td>
	                    	<td style="width: 35%"><input type="text" class="form-control" ng-model="responsavel.paisEndereco" placeholder="País"/></td>
                    	</tr>
                   	</table>
               	</div>
               	<div>
               		<table style="width: 100%;">
                       	<tr>
                       		<td style="width: 10%"><input type="text" class="form-control" ng-model="responsavel.dddTelefone" placeholder="DDD Tel"/></td>
                       		<td style="width: 30%"><input type="text" class="form-control" ng-model="responsavel.telefone" placeholder="Telefone"/></td>
                       		<td style="width: 10%"><input type="text" class="form-control" ng-model="responsavel.dddCelular" placeholder="DDD Cel"/></td>
                       		<td style="width: 30%"><input type="text" class="form-control" ng-model="responsavel.celular" placeholder="Celular"/></td>
                       		<td style="width: 20%" class="fonteSubsecao centroPagina">&nbsp;<input type="checkbox" ng-model="responsavel.possuiWhatsAppCelular"/>&nbsp;Possui WhatsApp</td>
                        </tr>
           			</table>
       			</div>
       			<div><input type="text" class="form-control" ng-model="responsavel.profissao" placeholder="Profissão"/></div>
       			<div><input type="text" class="form-control" ng-model="responsavel.nomeEmpresa" placeholder="Nome da Empresa"/></div>
       			<div><input type="text" class="form-control" ng-model="responsavel.enderecoEmpresa" placeholder="Endereço Comercial"/></div>
       			<div>
       				<table style="width: 100%;">
       					<tr>
       						<td style="width: 10%"><input type="text" class="form-control" ng-model="responsavel.dddTelefoneEmpresa" placeholder="DDD Tel Comercial"/></td>
       						<td style="width: 30%"><input type="text" class="form-control" ng-model="responsavel.telefoneEmpresa" placeholder="Telefone Comercial"/></td>
       						<td style="width: 10%"><input type="text" class="form-control" ng-model="responsavel.ramalTelefoneEmpresa" placeholder="Ramal Comercial"/></td>
       						<td style="width: 50%"><input type="text" class="form-control" ng-model="responsavel.emailEmpresa" placeholder="E-mail Comercial"/></td>
   						</tr>
                    </table>
              	</div>
              	<br>
              	<div style="width: 50%;" class="centroPagina">
              		<button class="btn btn-primary btn-block centroPagina" ng-click="salvarResponsavel(responsavel);">Salvar</button>
	            </div>
	        </div>
        </div>
    </body>
    <%@ include file="../footer.jsp" %>
</html>
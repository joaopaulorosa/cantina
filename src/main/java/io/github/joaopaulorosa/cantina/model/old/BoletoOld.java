/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.model.old;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import io.github.joaopaulorosa.cantina.model.old.enumerado.Pago;

/**
 *
 * @author joao
 */
@Entity
@Table(name = "boleto")
public class BoletoOld implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(nullable = false)
    private Double valor;
    
    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date vencimento;
    
    @Column(nullable = false)
    private Integer mes;
    
    @Enumerated(EnumType.STRING)
    @Column(length = 16, nullable = false, columnDefinition="varchar(50) default 'nao'")
    private Pago pago;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "data_pagamento")
    private Date dataPagamento;
    
    @Column(name = "valor_pago")
    private Double valorPago;
    
    @Column(name = "nosso_numero", nullable = false, length = 50)
    private String nossoNumero;
    
    @Column(name = "num_documento", nullable = false)
    private Integer numDocumento;
    
    @Column(name = "codigo_barra", nullable = false)
    private String codigoBarra;
    
    @Column(name = "linha_digitavel", nullable = false)
    private String linhaDigitavel;
    
    @Column(nullable = false)
    private Integer lote;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "responsavel_id", nullable = false)
    private ResponsavelOld responsavel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public String getNossoNumero() {
        return nossoNumero;
    }

    public void setNossoNumero(String nossoNumero) {
        this.nossoNumero = nossoNumero;
    }

    public Integer getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(Integer numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getLinhaDigitavel() {
        return linhaDigitavel;
    }

    public void setLinhaDigitavel(String linhaDigitavel) {
        this.linhaDigitavel = linhaDigitavel;
    }

    public Integer getLote() {
        return lote;
    }

    public void setLote(Integer lote) {
        this.lote = lote;
    }

    public ResponsavelOld getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(ResponsavelOld responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BoletoOld other = (BoletoOld) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Boleto{" + "id=" + id + ", valor=" + valor + ", vencimento=" + vencimento + ", mes=" + mes + ", pago=" + pago + ", dataPagamento=" + dataPagamento + ", valorPago=" + valorPago + ", nossoNumero=" + nossoNumero + ", numDocumento=" + numDocumento + ", codigoBarra=" + codigoBarra + ", linhaDigitavel=" + linhaDigitavel + ", lote=" + lote + ", responsavel=" + responsavel + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio73;

/**
 *
 * @author PC
 */
public class CamaroteInferior extends VIP {
    private String localizacaoIngresso;
    private double valorReais;
    private double valorAdicional;
    public CamaroteInferior(String localizacaoIngresso, double valorReais, double valorAdicional) {
        super(valorReais, valorAdicional);
        this.localizacaoIngresso=localizacaoIngresso;
        this.valorReais=valorReais;
        this.valorAdicional=valorAdicional;
    }

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public double getValorReais() {
        return valorReais;
    }

    public void setValorReais(double valorReais) {
        this.valorReais = valorReais;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
}

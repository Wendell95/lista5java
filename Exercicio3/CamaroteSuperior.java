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
public class CamaroteSuperior extends VIP{
    private double valorReais;
    private double valorAdicional;
    public CamaroteSuperior(double valorReais, double valorAdicional) {
        super(valorReais, valorAdicional);
        this.valorReais=valorReais;
        this.valorAdicional=valorAdicional;
    }
    public double valorIngresso(){
        return getValorReais();
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

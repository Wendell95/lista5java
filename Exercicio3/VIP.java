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
public class VIP extends Ingresso {
   private double valorAdicional;
   private double valorReais;
  
   
    public VIP(double valorReais, double valorAdicional) {
        super(valorReais);
        this.valorAdicional=valorAdicional;
        this.valorReais=valorReais;
    }
   public double valorIngresso(){
       return getValorAdicional();
   }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getValorReais() {
        return valorReais;
    }

    public void setValorReais(double valorReais) {
        this.valorReais = valorReais;
    }
}

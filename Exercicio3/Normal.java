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
public class Normal extends Ingresso {
    private double valorReais;
    public Normal(double valorReais) {
        super(valorReais);
        this.valorReais=valorReais;
    }
    public void IngressoNormal(){
        
    }

    public double getValorReais() {
        return valorReais;
    }

    public void setValorReais(double valorReais) {
        this.valorReais = valorReais;
    }
}  

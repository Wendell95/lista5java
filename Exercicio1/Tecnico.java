/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioslista71;

/**
 *
 * @author PC
 */
public class Tecnico extends Assistente{
    private double bonussalarial;
    private String numeromatricula;
    
    public Tecnico(double bonussalarial, String numeromatricula){
        super(numeromatricula);
        this.bonussalarial=bonussalarial;
        this.numeromatricula=numeromatricula;
    }
    public double getBonussalarial() {
        return bonussalarial;
    }

    public void setBonussalarial(double bonussalarial) {
        this.bonussalarial = bonussalarial;
    }

    public String getNumeromatricula() {
        return numeromatricula;
    }

    public void setNumeromatricula(String numeromatricula) {
        this.numeromatricula = numeromatricula;
    }
    
}

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
public abstract class Assistente extends Funcionario{
    private String numeromatricula;
    
    public Assistente(String numeromatricula){
        this.numeromatricula=numeromatricula;
    }

    public String getNumeromatricula() {
        return numeromatricula;
    }

    public void setNumeromatricula(String numeromatricula) {
        this.numeromatricula = numeromatricula;
    }
    public void exibeDados(){
        
    }
}

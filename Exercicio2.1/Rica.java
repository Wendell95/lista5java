/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioslista722;

/**
 *
 * @author PC
 */
public class Rica extends Pessoa{
    private double dinheiro;
    

    public Rica(double dinheiro, String nome, int idade){
        super(nome, idade);
        this.dinheiro=dinheiro;
    }
        
  
    
    
    
    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
         public void fazCompras(){
               System.out.println("Esta com a vida boa!!");
}}

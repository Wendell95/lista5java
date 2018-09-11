/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioslista72;

/**
 *
 * @author PC
 */
public class Gato extends Animal {
    
    public Gato(String nome, String raca) {
        super(nome, raca);
        this.nome=nome;
        this.raca=raca;
    }
        public void Caminha(){
        System.out.println("Caminhando!");
    
    }
    
      
    public void Som(){
    
    
        System.out.println("Miau!!");
    }
   

}
    
    
    


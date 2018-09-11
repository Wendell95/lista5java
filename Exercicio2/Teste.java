/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioslista72;

import java.util.Random;

/**
 *
 * @author PC
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[]a=new Animal[2];
        a[0]= new Cachorro("Rex", "Pitbull");
        a[1]= new Gato("miau", "miau");
       
        
       Random seleciona = new Random();
        Animal animalEscolhido;
        
        for(int i=0; i < 2; i++)
            
        {
    animalEscolhido=a[seleciona.nextInt(2)];
    
    animalEscolhido.Caminha();
    animalEscolhido.Som();
   
    
}}}

    


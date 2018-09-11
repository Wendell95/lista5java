/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicioslista722;

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
       Pessoa[]p=new Pessoa[3];
        p[0]= new Miseravel("Chiquinho", 90);
        p[1]= new Pobre("Francisco", 50);
        p[2]= new Rica(10000000.0, "Paulão", 25);
        
       Random seleciona = new Random();
        Pessoa pessoaEscolhida;
        
        for(int i=0; i < 2; i++)
            
        {
     pessoaEscolhida=p[seleciona.nextInt(3)];
    pessoaEscolhida.fazCompras();
    pessoaEscolhida.trabalha();
    pessoaEscolhida.mendiga();
   
    
}}}
    

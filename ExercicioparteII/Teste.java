/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtoparteII;

import java.util.ArrayList;
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
        ArrayList<Produto>c=new ArrayList<Produto>();
        Produto[]carrinho=new Produto[2];
        carrinho[0]= new Mouse("Loja a", 15.0, "E pratico", "Para PC");
        carrinho[1]= new Livro("João", "Loja l", 60.0, "Tem 300 paginas");
       
        
       Random s = new Random();
        Produto p;
        
        for(int i=0; i < 4; i++)
            
        {
    p=carrinho[s.nextInt(2)];
    
    p.GetDescricao();
    p.GeetDescricao();
   
   
    
}}}
    
    


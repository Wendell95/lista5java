/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio74;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       int op;
        
        
        
       System.out.println("Digite a opcao");
       op=s.nextInt();
       
       
        
       switch(op){
           case 1:
              
              Novo n = new Novo(13.0,"Rua 12", 300.0);
               System.out.println("Dados do novo");
               System.out.println("Endereço:"+n.getEndereco());
               System.out.println("Valor adicional:"+n.getValorAdicional());
               System.out.println("Preço:"+n.getPreco());
               System.out.println("Valor final:"+n.Novo());
               break;
           case 2:
               
               Velho v = new Velho(150.0, "Rua 10", 20.0);
               System.out.println("Dados do velho");
               System.out.println("Endereço:"+v.getEndereco());
               System.out.println("Desconto:"+v.getDesconto());
               System.out.println("Preço:"+v.getPreco());
               System.out.println("Valor final:"+v.Velho());
               break;
           default:
               System.out.println("Opção invalida");
       }
        
       
       
       
        
    }
    
}

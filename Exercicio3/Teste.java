/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio73;

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
        
        
        System.out.println("Digite a opção");
        op=s.nextInt();
      
        
    switch (op){
        
            case 1:
               System.out.println("Dados do Normal");
                Normal n = new Normal(50.0);
               System.out.println("Valor do ingresso:"+n.getValorReais());
               
               break;
           case 2:
             
             System.out.println("Dados VIP");
             VIP v = new VIP(50.0, 80.0); 
             System.out.println("Valor Do ingresso:"+v.getValorReais());
             System.out.println("Valor Adicional:"+v.getValorAdicional());
             
             
             System.out.println("Dados camarote superior");
             CamaroteSuperior cs = new CamaroteSuperior(30.0,15.0);
             
               
               System.out.println("Valor Do ingresso:"+cs.getValorReais());
               System.out.println("Valor Adicional:"+cs.getValorAdicional());
               
               System.out.println("Dados do camarorte inferior");
               CamaroteInferior ci = new CamaroteInferior("Entrada", 80.0, 15.0);
                                 
               System.out.println("Localizacao ingresso:"+ci.getValorAdicional());
               System.out.println("Valor Do ingresso:"+ci.getValorReais());
               System.out.println("Valor Adicional:"+ci.getValorAdicional());
               break;
            
           
            default:
                System.out.println("Opção Invalida");
        }
    }}
    


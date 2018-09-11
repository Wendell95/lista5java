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
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administrativo a = new Administrativo("33", "Matutuino", 333.0);
                
               Tecnico t = new Tecnico(140.0, "23") ;
               
               
               System.out.println("Dados do Administrativo");
               
               System.out.println("Numero matricula:"+a.getNumeromatricula());
               System.out.println("Turno:"+a.getTurno());
            System.out.println("Adicional noturno:"+a.getAdicionalnoturno());
            
            
            
            System.out.println("Dados do tecnico");
            
            
                    
                    System.out.println("Bonus Salarial:"+t.getBonussalarial());
         System.out.println("Bonus Salarial:"+t.getNumeromatricula());
            
    }
    
}

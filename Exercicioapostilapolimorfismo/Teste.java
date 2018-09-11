/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Teste {

    /**
     * @param args the command line arguments
     */ 
     
    public static void main(String[] args) {
        
       
      DisciplinaTrimestral dt = new DisciplinaTrimestral("Matematica", "2", 3.0, 2.0);
        
        DisciplinaAnual da = new DisciplinaAnual(3.0, 4.0, 5.0, 6.0,"Portugues", "4", 2.0, 3.0);
        
        DisciplinaSemestral ds = new DisciplinaSemestral(3.0, "História", "3",7.0,9.0);
      
        
        
       System.out.println("Dados da disciplina trimestral");
       
       System.out.println("Nome:"+dt.getNome());
        System.out.println("Periodo:"+dt.getPeriodo());
         System.out.println("Nota 1:"+dt.getNota1());
          System.out.println("Nota 2:"+dt.getNota2());
           System.out.println("Resultado:"+dt.avaliarDisciplinaaaa());
           
        System.out.println("Dados da disciplina anual");
        
                 System.out.println("Nota 1:"+da.getNota1());
          System.out.println("Nota 2:"+da.getNota2());
                 
       System.out.println("Nome:"+da.getNome());
        System.out.println("Periodo:"+da.getPeriodo());
        
          System.out.println("Nota 1:"+da.getNota3());
          System.out.println("Nota 2:"+da.getNota4());
            System.out.println("Nota 1:"+da.getNota5());
          System.out.println("Nota 2:"+da.getNota6());
          System.out.println("Resultado:"+da.avaliarDisciplinaa());
          
         System.out.println("Dados da disciplina semestral");
 
               
               
         System.out.println("Nota 1:"+ds.getNota3());
       System.out.println("Nome:"+ds.getNome());
        System.out.println("Periodo:"+ds.getPeriodo());
         System.out.println("Nota 1:"+ds.getNota1());
          System.out.println("Nota 2:"+ds.getNota2());
          System.out.println("Resultado:"+ds.avaliarDisciplinaaa());
    }}
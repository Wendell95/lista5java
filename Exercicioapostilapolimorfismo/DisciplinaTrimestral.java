/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author aluno
 */
public class DisciplinaTrimestral extends Disciplina {
        private String nome;
        private String periodo;
        private double nota1;
        private double nota2;
    
    
      
     public DisciplinaTrimestral(String nome, String periodo, double nota1, double nota2){
         super (nome, periodo, nota1, nota2);
         this.nome=nome;
         this.periodo=periodo;
         this.nota1=nota1;
         this.nota2=nota2;
     }
     
        public double avaliarDisciplinaaaa(){
          return (nota1 * 0.4)+(nota2*0.6);
            

       
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
}

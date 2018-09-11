/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author aluno
 */
public class DisciplinaSemestral extends Disciplina{
    private double nota3;
    private double nota1;
    private double nota2;
    private String nome;
    private String periodo;
    
      public DisciplinaSemestral(double nota3, String nome, String periodo, double nota1, double nota2){
           super(nome, periodo, nota1, nota2);
           this.nota3=nota3;
           this.nome=nome;
           this.periodo=periodo;
           this.nota1=nota1;
           this.nota2=nota2;
      }
    public double avaliarDisciplinaaa(){
        return((nota1 + nota2+ nota3)/3.0);
       
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
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

    

   
   
}

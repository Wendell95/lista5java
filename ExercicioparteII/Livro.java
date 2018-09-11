/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtoparteII;

/**
 *
 * @author PC
 */
public class Livro extends Produto {

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }
    private String autor;
    private String descricao;
    private double preco;
    private String nomeloja;
    
    public Livro(String autor, String nomeloja, double preco, String descricao) {
        super(nomeloja, preco, descricao);
        this.autor=autor;
        this.descricao=descricao;
        this.preco=preco;
        this.nomeloja=nomeloja;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
     public String toString(){
        return descricao;
    }
     public void GetDescricao(){
         System.out.println("Descricao livro:"+descricao);
     }
}

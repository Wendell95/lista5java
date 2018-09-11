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
public class Mouse extends Produto{
    private String tipo;
    private String descricao;
    private double preco;
    private String nomeloja;
    
    public Mouse(String nomeloja, double preco, String descricao, String tipo) {
        super(nomeloja, preco, descricao);
        this.tipo=tipo;
        this.preco=preco;
        this.descricao=descricao;
        this.tipo=tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
     public String toString(){
        return descricao;
    }
     
         public void GeetDescricao(){
             System.out.println("Descricao mouse:"+descricao);
         }
     }


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
public class Produto {
    private String nomeloja;
    private double preco;
    private String descricao;
    
    public Produto(String nomeloja, double preco, String descricao){
        this.nomeloja=nomeloja;
        this.preco=preco;
        this.descricao=descricao;
    }
    

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
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
        
    }
    public void GeetDescricao(){
        
    }
            
}

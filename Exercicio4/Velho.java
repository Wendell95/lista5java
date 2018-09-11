/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio74;

/**
 *
 * @author PC
 */
public class Velho extends Imovel {
     private double desconto; 
     private double preco;
     private String endereco;
     
    public Velho(double desconto, String endereco, double preco) {
        super(endereco, preco);
        this.desconto=desconto;
        this.endereco=endereco;
        this.preco=preco;
    }
    
    public double Velho(){
            return getPreco()/getDesconto();
}
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

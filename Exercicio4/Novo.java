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
public class Novo extends Imovel {
        private double valorAdicional;
        double preco;
        String endereco;
    

    public Novo(double valorAdicional,String endereco, double preco){
        super(endereco, preco);
        this.valorAdicional=valorAdicional;
        this.endereco=endereco;
        this.preco=preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double Novo(){
        return preco*getValorAdicional();
        
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}

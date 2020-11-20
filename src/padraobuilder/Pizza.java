/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraobuilder;

/**
 *
 * @author Jake Freitas
 */
public class Pizza {
    
    private String sabor;
    private String tamanho;
    private double preco;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Pizza{" + "sabor=" + sabor + ", tamanho=" + tamanho + ", preco=" + preco + '}';
    }

    
    
    
}

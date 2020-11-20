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
public class Main {
    public static void main(String[] args) {
        Pizzaria pizzaria = new Pizzaria(new PizzaFrangoCatupiry());
        
        pizzaria.criarPizza();
        Pizza p = pizzaria.getPizza();
        
        System.out.println(p.toString());
        
        pizzaria = new Pizzaria(new PizzaSertaneja());
        pizzaria.criarPizza();
        
        p = pizzaria.getPizza();
        System.out.println(p.toString());
    }
}

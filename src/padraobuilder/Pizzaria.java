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
public class Pizzaria {
    protected PizzaBiulder pizzaria;

    public Pizzaria(PizzaBiulder pizzaria) {
        this.pizzaria = pizzaria;
    }
    
    public void criarPizza(){
        pizzaria.saborBiulder();
        pizzaria.tamanhoBiulder();
        pizzaria.precoBiulder();
    }
    public Pizza getPizza(){
        return pizzaria.getPizza();
    }
}

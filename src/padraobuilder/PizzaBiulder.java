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
public abstract class PizzaBiulder {
    protected Pizza pizza;
    
    public PizzaBiulder(){
        pizza = new Pizza();
    }
    
    public abstract void saborBiulder();
    
    public abstract void precoBiulder();
    
    public abstract void tamanhoBiulder();
    
    public Pizza getPizza(){
        return pizza;
    }
}

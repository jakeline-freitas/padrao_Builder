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
public class PizzaFrangoCatupiry extends PizzaBiulder{

    @Override
    public void saborBiulder() {
        pizza.setSabor("Frango com catupiry");
    }

    @Override
    public void precoBiulder() {
        pizza.setPreco(32.00);
    }

    @Override
    public void tamanhoBiulder() {
        pizza.setTamanho("Grande");
    }
    
}

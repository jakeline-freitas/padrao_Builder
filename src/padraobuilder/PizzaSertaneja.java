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
public class PizzaSertaneja extends PizzaBiulder{

    @Override
    public void saborBiulder() {
       pizza.setSabor("Carne de Sol");
    }

    @Override
    public void precoBiulder() {
       pizza.setPreco(22.00);
    }

    @Override
    public void tamanhoBiulder() {
        pizza.setTamanho("Pequena");
    }
    
}

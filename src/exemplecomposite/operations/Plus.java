/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite.operations;

import exemplecomposite.Component;
import exemplecomposite.Composite;

/**
 *
 * @author me
 */
public class Plus extends Composite {

    public Plus(Component gauche, Component droite) {
        super(gauche, droite);
    }

    @Override
    public int operation() {
        return this.gauche.operation() + this.droite.operation();
    }

    @Override
    public String toString() {
        return " (" + this.gauche + " + " + this.droite + ") ";
    }
    
}

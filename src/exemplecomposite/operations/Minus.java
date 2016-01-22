/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite.operations;

import exemplecomposite.Component;
import exemplecomposite.Tree;
import exemplecomposite.visiteur.Visitor;

/**
 *
 * @author me
 */
public class Minus extends Tree {

    public Minus(Component gauche, Component droite) {
        super(gauche, droite);
    }

    @Override
    public int operation() {
        return this.gauche.operation() - this.droite.operation();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return " (" + this.gauche + " - " + this.droite + ") ";
    }
    
}

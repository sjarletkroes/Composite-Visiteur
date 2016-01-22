/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite.visiteur;

import exemplecomposite.Tree;
import exemplecomposite.Leaf;
import exemplecomposite.operations.*;

/**
 *
 * @author me
 */
public class ViewExpressionVisitor implements Visitor {

    @Override
    public void visit(Minus aThis) {
        affiche(aThis, "-");
    }

    @Override
    public void visit(Plus aThis) {
        affiche(aThis, "+");
    }

    @Override
    public void visit(Multiply aThis) {
        affiche(aThis, "*");
    }

    @Override
    public void visit(Divide aThis) {
        affiche(aThis, "/");
    }

    @Override
    public void visit(Leaf aThis) {
        System.out.print(" " + aThis.value + " ");
    }
    
    private void affiche(Tree aThis, String op) {
        ViewExpressionVisitor affichage = new ViewExpressionVisitor();
        System.out.print(" (");
        aThis.gauche.accept(affichage);
        System.out.print(op);
        aThis.droite.accept(affichage);
        System.out.print(") ");
    }
    
}

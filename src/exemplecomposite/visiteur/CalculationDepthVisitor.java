/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite.visiteur;

import exemplecomposite.Tree;
import exemplecomposite.UseComponent;
import exemplecomposite.Leaf;
import exemplecomposite.operations.Divide;
import exemplecomposite.operations.Minus;
import exemplecomposite.operations.Multiply;
import exemplecomposite.operations.Plus;

/**
 *
 * @author me
 */
public class CalculationDepthVisitor implements Visitor{

    @Override
    public void visit(Minus aThis) {
        calculation(aThis);
    }

    @Override
    public void visit(Plus aThis) {
        calculation(aThis);
    }

    @Override
    public void visit(Multiply aThis) {
        calculation(aThis);
    }

    @Override
    public void visit(Divide aThis) {
        calculation(aThis);
    }

    @Override
    public void visit(Leaf aThis) {
        if(UseComponent.currentDepth > UseComponent.totalDepth) UseComponent.totalDepth = UseComponent.currentDepth;
    }
    
    private void calculation(Tree aThis) {
        CalculationDepthVisitor profondeur = new CalculationDepthVisitor();
        UseComponent.currentDepth ++;
        aThis.gauche.accept(profondeur);
        aThis.droite.accept(profondeur);
        UseComponent.currentDepth --;
    }
    
}

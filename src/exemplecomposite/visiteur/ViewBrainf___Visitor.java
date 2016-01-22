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
public class ViewBrainf___Visitor implements Visitor{

    @Override
    public void visit(Minus aThis) {
        System.out.print("|-");
        afficheReste(aThis);
    }

    @Override
    public void visit(Plus aThis) {
        System.out.print("|+");
        afficheReste(aThis);
    }

    @Override
    public void visit(Multiply aThis) {
        System.out.print("|*");
        afficheReste(aThis);
    }

    @Override
    public void visit(Divide aThis) {
        System.out.print("|/");
        afficheReste(aThis);
    }

    @Override
    public void visit(Leaf aThis) {
        System.out.print("|" + aThis.value);
    }
    
    private void afficheReste(Tree aThis) {
        ViewBrainf___Visitor affichage2 = new ViewBrainf___Visitor();
        System.out.print("\n| ");
        for(int i=0 ; i<UseComponent.currentDepth ; i++) System.out.print("| ");
        UseComponent.currentDepth ++;
        aThis.gauche.accept(affichage2);
        UseComponent.currentDepth --;
        System.out.print("\n| ");
        for(int i=0 ; i<UseComponent.currentDepth ; i++) System.out.print("| ");
        UseComponent.currentDepth ++;
        aThis.droite.accept(affichage2);
        UseComponent.currentDepth --;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite.visiteur;

import exemplecomposite.Leaf;
import exemplecomposite.operations.*;

/**
 *
 * @author me
 */
public class CalculationVisitor implements Visitor {

    @Override
    public void visit(Minus aThis) {
        int total = aThis.operation();
        System.out.print(total);
    }

    @Override
    public void visit(Plus aThis) {
        int total = aThis.operation();
        System.out.print(total);
    }

    @Override
    public void visit(Multiply aThis) {
        int total = aThis.operation();
        System.out.print(total);
    }

    @Override
    public void visit(Divide aThis) {
        int total = aThis.operation();
        System.out.print(total);
    }

    @Override
    public void visit(Leaf aThis) {
        int total = aThis.operation();
        System.out.print(total);
    }
    
}

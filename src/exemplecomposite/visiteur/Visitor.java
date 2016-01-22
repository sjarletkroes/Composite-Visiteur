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
public interface Visitor {

    void visit(Minus aThis);
    void visit(Plus aThis);
    void visit(Multiply aThis);
    void visit(Divide aThis);
    void visit(Leaf aThis);
    
}

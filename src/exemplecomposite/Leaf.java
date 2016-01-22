/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite;

import exemplecomposite.visiteur.Visitor;

public class Leaf extends Component {

    public int value;
    
    Leaf(int value) {
        this.value = value;
    }
// redéfinition de Opération spécifique à objet composant de base

    @Override
    public int operation() {
        return this.value;
    }

    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return " " + value + " ";
    }
    
}
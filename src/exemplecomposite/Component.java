/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite;

import exemplecomposite.visiteur.Visitor;

public abstract class Component {

    public abstract int operation();
    public abstract void accept(Visitor v);
}

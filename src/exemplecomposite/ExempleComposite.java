/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite;

import exemplecomposite.operations.*;

/**
 *
 * @author me
 */
public class ExempleComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Leaf feuille2 = new Leaf(2);
        Leaf feuille3 = new Leaf(3);
        Leaf feuille4 = new Leaf(4);
        Composite sous_arbre = new Plus(feuille2, feuille3);
        Composite arbre = new Multiplie(sous_arbre, feuille4);
        System.out.println(arbre.toString());
        
        System.out.println("Total: " + arbre.operation());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplecomposite;

import exemplecomposite.operations.*;
import exemplecomposite.visiteur.*;

/**
 *
 * @author me
 */
public class UseComponent {

    //public static Component[] list = { new Leaf(), new Divide(), new Minus(), new Multiply(), new Plus() };
    public static int currentDepth = 0;
    public static int totalDepth = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Leaf feuille1 = new Leaf(1);
        Leaf feuille2 = new Leaf(2);
        Leaf feuille3 = new Leaf(3);
        Leaf feuille4 = new Leaf(4);
        Leaf feuille5 = new Leaf(5);
        Tree sous_arbre1 = new Divide(feuille1, feuille2);
        Tree sous_arbre2 = new Plus(sous_arbre1, feuille3);
        Tree sous_arbre3 = new Minus(feuille4, feuille5);
        Tree arbre = new Multiply(sous_arbre2, sous_arbre3);
        
        ViewExpressionVisitor affichage = new ViewExpressionVisitor();
        CalculationVisitor calcul = new CalculationVisitor();
        CalculationDepthVisitor calculProf = new CalculationDepthVisitor();
        ViewBrainf___Visitor affichage2 = new ViewBrainf___Visitor();
//        arbre.accept(calcul);
        System.out.println("______________________________________________________\n");
        System.out.print("Expression: ");
        arbre.accept(affichage);
        System.out.println("\n______________________________________________________\n");
        arbre.accept(calculProf);
        System.out.println("Profondeur: " + totalDepth);
        System.out.println("______________________________________________________\n");
        System.out.print("Résultat du calcul: ");
        arbre.accept(calcul);
        System.out.println("\n______________________________________________________\n");
        arbre.accept(affichage2);
        System.out.println("\n______________________________________________________");
    }
    
}

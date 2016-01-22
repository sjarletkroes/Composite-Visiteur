/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplecomposite;

public abstract class Tree extends Component {
// La classe composite contient les références des objets composants.

    public Component gauche;
    public Component droite;

    public Tree(Component gauche, Component droite) {
        this.gauche = gauche;
        this.droite = droite;
    }
    
}
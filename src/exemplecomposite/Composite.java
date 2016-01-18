/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplecomposite;

public class Composite extends Component {
// La classe composite contient les références des objets composants.

    public Component gauche;
    public Component droite;

    public Composite(Component gauche, Component droite) {
        this.gauche = gauche;
        this.droite = droite;
    }

    @Override
    public String toString() {
        return " (" + gauche + " op " + droite + ") ";
    }

    @Override
    public int operation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

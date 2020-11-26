package parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author Angie
 */
public class producto2 extends lacteos {

    public producto2(String tipodelacteo, String lacteodisponible1, String lacteodisponible2, String lacteodisponible3, String lacteodisponible4, int lacteounidad, int costocaja, int costocajade24) {
        super(tipodelacteo, lacteodisponible1, lacteodisponible2, lacteodisponible3, lacteodisponible4, costounidad, costocaja, costocajade32);
    }

    public void mostrardatos() {
        JOptionPane.showMessageDialog(null, "⦁Tipo de flor:\n" + getTipodelacteo() + "."
                + "\n⦁lacteos dispobibles:\n" + getlacteodisponible1() + ", " + getlacteodisponible2() + ", " + getlacteodisponible3() + " y " + getlacteodisponible4() + "."
                + "\n⦁Costo de una unidad:\n" + getCostounidad() + " pesos."
                + "\n⦁Costo de una caja de 12 " + getTipodelacteo() + ":\n" + getCostocaja() + " pesos."
                + "\n⦁costo de una caja de 32 " + getTipodelacteo() + ":\n" + getCostocajade24() + " pesos.");
    }

}
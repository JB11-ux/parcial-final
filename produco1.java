package parcial;


import javax.swing.JOptionPane;

public class producto1 extends lacteos {

    public producto1(String tipodelacteo, String lacteodisponible1, String lacteodisponible2, String lacteodisponible3, String lacteodisponible4, int costounidad, int costodecaja, int costocajade32) {
        super(tipodelacteo, lacteodisponible1, lacteodisponible2, lacteodisponible3, lacteodisponible4, costounidad, costodecaja, costocajade32);
    }

    public void mostrardatos() {
        JOptionPane.showMessageDialog(null, "⦁Tipo de lacteo:\n" + getTipodelacteo() + "."
                + "\n⦁Colores dispobibles:\n" + getlacteodisponible1() + ", " + getlacteodisponible2() + ", " + getlacteodisponible3() + " y " + getlacteodisponible4() + "."
                + "\n⦁Costo de una unidad:\n" + getCostounidad() + " pesos."
                + "\n⦁Costo de una caja de 12 " + getTipodelacteo() + ":\n" + getcostocaja() + " pesos."
                + "\n⦁costo de una caja de 32 " + getTipodelacteo() + ":\n" + getCostocajade32() + " pesos.");

    }
}

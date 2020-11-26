package parcial;

public class main {

    public static void main(String[] args) {
        producto1 ob1 = new producto1("yogurt", "blanco", "rojo", "negro", "Amarillo", 2000, 750 * 10, 2300 * 20 - 1500 * 2);
        producto2 ob2 = new producto2("queso", "amarillo", "morado", "Morado", "Blanco con rosa", 5000, 1500 * 10, 3000 * 20 - 3000 * 4);
        ob1.mostrardatos();
        ob2.mostrardatos();
    }
}

package parcial;


public class lacteos {

    private String tipodelacteo;
    private String lacteodisponible1;
    private String lacteodisponible2;
    private String lacteodisponible3;
    private String lacteodisponible4;
    private int costounidad;
    private int costocaja;
    private int costocajade32;

    public lacteos(String tipodelacteo, String lacteodisponible1, String lacteodisponible2, String lacteodisponible3, String lacteodisponible4, int costounidad, int costocaja, int costocajade32) {

        this.tipodelacteo = tipodelacteo;
        this.lacteodisponible1 = lacteodisponible1;
        this.lacteodisponible2 = lacteodisponible2;
        this.lacteodisponible3 = lacteodisponible3;
        this.lacteodisponible4 = lacteodisponible4;
        this.costounidad = costounidad;
        this.costocaja = costocaja;
        this.costocajade32 = costocajade32;
    }

    public String getTipodelacteo() {
        return tipodelacteo;
    }

    public String getlacteodisponible1() {
        return lacteodisponible1;
    }

    public String getlacteodisponible2() {
        return lacteodisponible2;
    }

    public String getlacteodisponible3() {
        return lacteodisponible3;
    }

    public String getlacteodisponible4() {
        return lacteodisponible4;
    }

    public int getCostounidad() {
        return costounidad;
    }

    public int getCostocaja() {
        return costocaja;
    }

    public int getCostocajade32() {
        return costocajade32;
    }

}


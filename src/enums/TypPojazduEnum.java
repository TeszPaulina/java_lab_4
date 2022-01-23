package enums;

/* przykład rozbudowanego enuma */
public enum TypPojazduEnum {
    /* typy enuma */
    O("Osobowy", "B"),
    C("Ciężarowy", "C"),
    MO("interfaces.Motor", "B2"),
    MR("Motorower", "A1"),
    R("Rower", "A");

    /* prywatne pola */
    private String typ;
    private String klasyfikacja;

    /* konstruktor */
    TypPojazduEnum(String typ, String klasyfikacja) {
        this.typ = typ;
        this.klasyfikacja = klasyfikacja;
    }

    /* gettery */
    public String getTypPojazdu() {
        return "Typ: " + typ + ", Klasyfikacja: " + klasyfikacja;
    }

    public String getTyp() {
        return typ;
    }

    public String getKlasyfikacja() {
        return klasyfikacja;
    }

}

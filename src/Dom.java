public class Dom implements Budynek {
    private double pow;
    private String adres;
    private int value;
    private KolorEnum kolor;
    private int cenaZaMetr;

    public Dom() {
    }

    public Dom(double pow, String adres, int value, KolorEnum kolor, int cenaZaMetr) {
        this.pow = pow;
        this.adres = adres;
        this.value = value;
        this.kolor = kolor;
        this.cenaZaMetr = cenaZaMetr;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public KolorEnum getKolor() {
        return kolor;
    }

    public void setKolor(KolorEnum kolor) {
        this.kolor = kolor;
    }

    public int getCenaZaMetr() {
        return cenaZaMetr;
    }

    public void setCenaZaMetr(int cenaZaMetr) {
        this.cenaZaMetr = cenaZaMetr;
    }

    @Override
    public double powierzchnia(double pow) {
        double komorka = 20.0;
        return getPow() + komorka;
    }

    @Override
    public String adresBudynku(String adres) {
        return "ul. " + getAdres();
    }

    @Override
    public int liczbaOkien(int value) {
        int piwnica = 1;
        return getValue() + piwnica;
    }

    @Override
    public void liczbaMieszkancow(int value) {
        System.out.println("Dom przeznaczony jest dla " + value + " osob.");
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        System.out.println("Dom jest " + getKolor() + ".");
    }

    @Override
    public double kosztDomu(double pow, int cenaZaMetr) {
        return pow * getCenaZaMetr();
    }

    @Override
    public String toString() {
        return "Dom o powierzchni " + powierzchnia(pow)+ " m2" +
                ", ktory ma " + liczbaOkien(value) + " okien, " +
                "znajduje sie przy ulicy " + adresBudynku(adres) + "." +
                "\nCena tego domu wynosi: " + kosztDomu(pow,cenaZaMetr) + " zł.";
    }
}

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

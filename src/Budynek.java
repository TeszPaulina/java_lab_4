public interface Budynek {

    /* zad.1
a) Stwożyć interfejs Budynek,
b) interfejs powinien mieć metody:
    - double powierzchnia(double pow);
    - String adresBudynku(String adres);
    - int liczbaOkien(int value);
    - void liczbaMieszkancow(int value);
    - void kolorDomu(KolorEnum kolor);
c) stworzyć enum KolorEnum z przykładowymi kolorami,
d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
*/
    double getPow();
    void setPow(double pow);
    String getAdres();
    void setAdres(String adres);
    int getValue();
    void setValue(int value);
    KolorEnum getKolor();
    void setKolor(KolorEnum kolor);
    int getCenaZaMetr();
    void setCenaZaMetr(int cenaZaMetr);

    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int value);
    void liczbaMieszkancow(int value);
    void kolorDomu(KolorEnum kolor);
    double kosztDomu(double pow, int cenaZaMetr);
    String toString();

}

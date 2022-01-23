package classes;

import enums.PracownikWydzial;
import interfaces.PracownikI;

public class Pracownik implements PracownikI {
    private double waga, wzrost, zarobki;
    private String imie, nazwisko;
    private int wiek, liczbaGrup;
    private PracownikWydzial wydzial;

    public Pracownik(double waga, double wzrost, double zarobki, int liczbaGrup) {
        this.waga = waga;
        this.wzrost = wzrost;
        this.zarobki = zarobki;
        this.liczbaGrup = liczbaGrup;
    }

    public double getWaga() {
        return waga;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public double getWzrost() {
        return wzrost;
    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public double getZarobki() {
        return zarobki;
    }

    public void setZarobki(double zarobki) {
        this.zarobki = zarobki;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getLiczbaGrup() {
        return liczbaGrup;
    }

    public void setLiczbaGrup(int liczbaGrup) {
        this.liczbaGrup = liczbaGrup;
    }

    public PracownikWydzial getWydzial() {
        return wydzial;
    }

    public void setWydzial(PracownikWydzial wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public double czlowiekBMI(double waga, double wzrost) { return waga / (wzrost * wzrost); }

    @Override
    public void czlowiekInformacje(String imie, String nazwisko, int wiek) {
        System.out.println("\nImie Pracownika: " + imie +
                "\nNazwisko Pracownika: " + nazwisko +
                "\nWiek Pracownika: " + wiek);
    }

    @Override
    public void wydzial(PracownikWydzial wydzial) {
        System.out.println("Pracuje na wydziale: " + wydzial);
    }

    @Override
    public int liczbaWszystkichGrup(int liczbaGrup) {
        return liczbaGrup;
    }

    @Override
    public double zarobkiPracownika(double zarobki) {
        return zarobki;
    }

    @Override
    public String toString() {
        return "BMI wynosi " + czlowiekBMI(waga,wzrost) +
               "\nPracownik uczy " + liczbaWszystkichGrup(liczbaGrup) + " grup" +
               "\nObecnie zarabia " + zarobkiPracownika(zarobki) + " zł.";

    }
}

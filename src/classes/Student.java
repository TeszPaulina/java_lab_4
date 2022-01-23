package classes;

import enums.StudentKierunek;
import interfaces.StudentI;

public class Student implements StudentI {

    private double waga, wzrost, ocena1, ocena2, ocena3, socjalne, rektora;
    private String imie, nazwisko;
    private int wiek;
    private StudentKierunek kierunek;

    public Student(double waga, double wzrost, double ocena1, double ocena2, double ocena3, double socjalne, double rektora) {
        this.waga = waga;
        this.wzrost = wzrost;
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
        this.ocena3 = ocena3;
        this.socjalne = socjalne;
        this.rektora = rektora;
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

    public double getOcena1() {
        return ocena1;
    }

    public void setOcena1(double ocena1) {
        this.ocena1 = ocena1;
    }

    public double getOcena2() {
        return ocena2;
    }

    public void setOcena2(double ocena2) {
        this.ocena2 = ocena2;
    }

    public double getOcena3() {
        return ocena3;
    }

    public void setOcena3(double ocena3) {
        this.ocena3 = ocena3;
    }

    public double getSocjalne() {
        return socjalne;
    }

    public void setSocjalne(double socjalne) {
        this.socjalne = socjalne;
    }

    public double getRektora() {
        return rektora;
    }

    public void setRektora(double rektora) {
        this.rektora = rektora;
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

    public StudentKierunek getKierunek() {
        return kierunek;
    }

    public void setKierunek(StudentKierunek kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public double czlowiekBMI(double waga, double wzrost) {
        return waga / (wzrost * wzrost);
    }

    @Override
    public void czlowiekInformacje(String imie, String nazwisko, int wiek) {
        System.out.println("\nImie Studenta: " + imie +
                "\nNazwisko Studenta: " + nazwisko +
                "\nWiek Studenta: " + wiek);
    }

    @Override
    public void kierunek(StudentKierunek kierunek) {
        System.out.println("Studiuje na kierunku: " + kierunek);
    }

    @Override
    public double sredniaOcen(double ocena1, double ocena2, double ocena3) {
        return (ocena1 + ocena2 + ocena3)/3;
    }

    @Override
    public double sumaStypendium(double socjalne, double rektora) {
        return socjalne + rektora;
    }

    @Override
    public String toString() {
        return "BMI wynosi " + czlowiekBMI(waga,wzrost) +
                "\nSrednia ocen wynosi " + sredniaOcen(ocena1, ocena2, ocena3) +
                "\nPrzyznane stypendium lacznie wynosi " + sumaStypendium(socjalne, rektora) + " zł.";
    }
}

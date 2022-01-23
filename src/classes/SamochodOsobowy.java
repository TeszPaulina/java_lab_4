package classes;

import enums.PaliwoEnum;
import enums.TypPojazduEnum;
import interfaces.Autor;
import interfaces.Samochod;

/* klasa implementuje interfejs Samochod */
public class SamochodOsobowy implements Samochod {

    private double waga = 0;
    private double ciezarPaliwa = 0;
    private TypPojazduEnum typ = null;
    private String marka;
    private int przebieg;
    private PaliwoEnum paliwo;

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public double getWaga(double waga) {
        return waga + ciezarPaliwa;
    }

    @Override
    public void getTypPojazdu(TypPojazduEnum typ) {
        this.typ = typ;
    }

    @Override
    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public void setPrzebieg(int oryginalny, int odHandlarza) {
        this.przebieg = oryginalny + odHandlarza;
    }

    @Override
    public void setPaliwo(PaliwoEnum paliwo) {
        this.paliwo = paliwo;
    }

    /* settery */
    public void setWaga(double waga) {
        this.waga = waga;
    }

    public void setCiezarPaliwa(double ciezarPaliwa) {
        this.ciezarPaliwa = ciezarPaliwa;
    }

    public void setTyp(TypPojazduEnum typ) {
        this.typ = typ;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    /* gettery */
    public double getWaga() {
        return waga;
    }

    public double getCiezarPaliwa() {
        return ciezarPaliwa;
    }

    public String getTyp() {
        return typ.getTypPojazdu();
    }

    public String getMarka() {
        return marka;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public PaliwoEnum getPaliwo() {
        return paliwo;
    }

    @Override
    public String toString() {
        return "SamochodOsobowy{" +
                "waga=" + waga +
                ", ciezarPaliwa=" + ciezarPaliwa +
                ", \ntyp=" + typ.getTypPojazdu() +
                ", marka='" + marka + '\'' +
                ", przebieg=" + przebieg +
                ", paliwo=" + paliwo +
                "}\nAutor: " + getAutor();
    }

}

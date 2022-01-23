package classes;

import enums.PaliwoEnum;
import enums.TypPojazduEnum;
import interfaces.Samochod;

public class SamochodCiezarowy implements Samochod {

    @Override
    public String getAutor() {
        return Samochod.super.getAutor();
    }

    @Override
    public double getWaga(double waga) {
        return 0;
    }

    @Override
    public void getTypPojazdu(TypPojazduEnum typ) {

    }

    @Override
    public void setMarka(String marka) {

    }

    @Override
    public void setPrzebieg(int oryginalny, int odHandlarza) {

    }

    @Override
    public void setPaliwo(PaliwoEnum paliwo) {

    }

}

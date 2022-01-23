package interfaces;

import enums.PracownikWydzial;

public interface PracownikI extends CzlowiekI {

    void wydzial(PracownikWydzial wydzial);

    int liczbaWszystkichGrup(int liczbaGrup);

    double zarobkiPracownika(double zarobki);

}
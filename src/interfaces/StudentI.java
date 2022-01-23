package interfaces;

import enums.StudentKierunek;

public interface StudentI extends CzlowiekI {

    void kierunek(StudentKierunek kierunek);

    double sredniaOcen(double ocena1, double ocena2, double ocena3);

    double sumaStypendium(double socjalne, double rektora);

}
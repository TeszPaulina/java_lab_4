public class Main {
    public static void main(String[] args) {
        /* objekt samochod1 deklarujemy jako typ klasy SamochodOsobowy i
         * implementujemy pustym konstruktorem z klasy SamochodOsobowy */
        SamochodOsobowy samochod1 = new SamochodOsobowy();
        samochod1.setPojazd("Mercedes");
        samochod1.czasPracy(7);
        samochod1.podsumowanie(15);

        System.out.println();
        /* Deklarujemy objekt samochod2 typem interfejsu Pojazd - bardziej elastyczne rozwiązanie */
        Pojazd samochod2 = new SamochodOsobowy();
        samochod2.setPojazd("Fiat");
        samochod2.czasPracy(9);
        samochod2.podsumowanie(28);
    }
}

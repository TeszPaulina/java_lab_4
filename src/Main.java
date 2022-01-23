/* importy używanych elementów, które są w innych paczkach */
import classes.SamochodOsobowy;
import enums.PaliwoEnum;
import enums.TypPojazduEnum;
import interfaces.Samochod;

public class Main {
    public static void main(String[] args) {

        SamochodOsobowy pojazd1 = new SamochodOsobowy();
        pojazd1.setMarka("Fiat");
        pojazd1.setPaliwo(PaliwoEnum.BENZYNA);
        pojazd1.getTypPojazdu(TypPojazduEnum.O);
        pojazd1.setWaga(2200.22);
        pojazd1.setPrzebieg(40500);
        pojazd1.setCiezarPaliwa(45);

        /* przykład dostępu do parametrów enuma */
        System.out.println(pojazd1.getTyp());
        System.out.println(TypPojazduEnum.O.name());
        System.out.println(TypPojazduEnum.O.getTyp());
        System.out.println(TypPojazduEnum.O.getKlasyfikacja());
        System.out.println(TypPojazduEnum.O.getTypPojazdu());

        /* wywołanie metody to string na objekcie klasy SamochodOsobowy */
        System.out.println("\n" + pojazd1.toString());

        System.out.println();
//        ****************************************************************************

        /* jesli zadeklarujemy objekt interfejsem / klasą, implementowaną / dziedziczoną,
         * to mamy dostęp tylko do metod z interfejsu/klasy Deklarującej,
         * chyba, że wytypujemy objekt implementowany zawierający dodatkowe metody
         * np. ((SamochodOsobowy) pojazd2).setWaga(18700.22); */
        Samochod pojazd2 = new SamochodOsobowy();
        pojazd2.setMarka("Star");
        pojazd2.setPaliwo(PaliwoEnum.DIESEL);
        pojazd2.getTypPojazdu(TypPojazduEnum.C);
        ((SamochodOsobowy) pojazd2).setWaga(18700.22);
        pojazd2.setPrzebieg(63500, 77000);
        ((SamochodOsobowy) pojazd2).setCiezarPaliwa(200);

        System.out.println(pojazd2.toString());


    }
}

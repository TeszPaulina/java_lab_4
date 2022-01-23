import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */

        System.out.println("Ćwiczenie 4");
        System.out.println("Zadanie 1");
        int tab[] = {3,5,12,6,1,8};
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz indeks tablicy: ");
        int index = -1;

        boolean isIndexCorrect = false;
        while (!isIndexCorrect) {
            try {
                index = Integer.parseInt(scan.next());
                isIndexCorrect = true;
                System.out.println("Dobrze! Wprowadzony znak jest cyfrą i podales poprawny indeks. tab[" + index + "] = " + tab[index]);
            } catch (NumberFormatException e) {
                isIndexCorrect = false;
                System.out.println("Błąd, wprowadzony znak nie jest cyfrą! Wprowadz ponownie: ");
            } catch (ArrayIndexOutOfBoundsException f) {
                System.out.println("Błąd, podales niepoprawny indeks. Powinien byc z zakresu od 0 do " +
                        (tab.length - 1) + ". Wprowadz ponownie: ");
                isIndexCorrect = false;
            }
        }

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */
        System.out.println("\nZadanie 2 a)");
        try {
            String osoba = null;
            osoba.toLowerCase();
        } catch (NullPointerException g) {
            System.out.println("Błąd, nie mozna wywowac metody toLowerCase() na null!");
        }

        System.out.println("\nZadanie 2 b)");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Dzielenie calkowite. Wprowadz dwie liczby calkowite: ");
        int a, b;

        boolean isValueCorrect = false;
        while (!isValueCorrect) {
            try {
                a = Integer.parseInt(scan.next());
                b = Integer.parseInt(scan.next());
                isValueCorrect = true;
                int dzielenie = a / b;
                System.out.println("a / b = " + a + " / " + b + " = " + dzielenie);
            } catch (ArithmeticException h) {
                isValueCorrect = false;
                System.out.println("Błąd. Nie mozemy dzielic przez 0. Wprowadz poprawne dane.");
            }
        }

        System.out.println("\nZadanie 2 c)");
        try {
            String napis = null;
            int liczba = 3;
            int liczba2 = 0;
            int dzielenie = liczba / liczba2;
            napis.toUpperCase();
            System.out.println(dzielenie);
            System.out.println("Wszystko poprawnie.");
        } catch (NullPointerException k) {
            System.out.println("Błąd, nie mozna wywowac metody toUpperCase() na null!");
        } catch (ArithmeticException l) {
            System.out.println("Błąd. Nie mozna dzielic przez 0!");
        } finally {
            System.out.println("Koniec programu.");
        }

    }
}

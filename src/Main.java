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
        int tab[] = {3,5,12,6,1,8};
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadz indeks tablicy: ");
        int index = -1;

        boolean isIndexCorrect = false;
        while (!isIndexCorrect) {
            try {
                index = Integer.parseInt(scan.next());
                isIndexCorrect = true;
                System.out.println("Dobrze, wprowadzony znak jest cyfrą!");
            } catch (NumberFormatException e) {
                isIndexCorrect = false;
                System.out.println("Błąd, wprowadzony znak nie jest cyfrą!");
            }
        }

        try {
            System.out.println("Dobrze, pdales poprawny indeks. tab[" + index + "] = " + tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Błąd, podales niepoprawny indeks. Powinien byc z zakresu od 0 do " + (tab.length - 1));
        } finally {
            System.out.println("Koniec programu.");
        }

        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

    }
}

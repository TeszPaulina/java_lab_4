import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ćwiczenie 3");
        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Kwadrat kwadrat = new Kwadrat();
        kwadrat.nazwaFigury("kwadrat");
        System.out.println("Pole wynosi: " + kwadrat.pole(3.0,3.0));
        System.out.println("Obwod wynosi: " + kwadrat.obwod(3.0,3.0));

        Prostokat prostokat = new Prostokat();
        prostokat.nazwaFigury("prostokat");
        System.out.println("Pole wynosi: " + prostokat.pole(3.5,2.0));
        System.out.println("Obwod wynosi: " + prostokat.obwod(5.0,3.0));

    }
}

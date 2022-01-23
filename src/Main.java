import enums.PracownikWydzial;
import enums.StudentKierunek;
import classes.Student;
import classes.Pracownik;

public class Main {
    public static void main(String[] args) {

        /* zad.1
         a) napisać interfejs CzlowiekI
         b) zadeklarować 2 metody
         c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
         d) zadeklarować 3 metody
         e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
         f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów


        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */

        Student student = new Student(55, 1.58, 5, 4, 5, 600, 500);
        student.czlowiekInformacje("Klaudia", "Nowicka", 22);
        student.kierunek(StudentKierunek.FIZYKA);
        System.out.println(student.toString());

        Student student2 = new Student(67, 1.78, 3, 4, 5, 500, 400);
        student2.czlowiekInformacje("Marcin", "Jacki", 21);
        student2.kierunek(StudentKierunek.PSYCHOLOGIA);
        System.out.println(student2.toString());

        Pracownik pracownik = new Pracownik(74, 1.75, 3700, 6);
        pracownik.czlowiekInformacje("Adam", "Nowak", 35);
        pracownik.wydzial(PracownikWydzial.MATEMATYKI);
        System.out.println(pracownik.toString());

        Pracownik pracownik2 = new Pracownik(87, 1.95, 4200, 9);
        pracownik2.czlowiekInformacje("Martyna", "Jakubik", 43);
        pracownik2.wydzial(PracownikWydzial.PSYCHOLOGII);
        System.out.println(pracownik2.toString());

    }
}

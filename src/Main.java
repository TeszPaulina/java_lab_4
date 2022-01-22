public class Main {
    public static void main(String[] args) {
        System.out.println("Ćwiczenie 1\n");


        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */
        Dom dom1 = new Dom();
        dom1.setPow(120);
        dom1.setAdres("Dabrowskiego");
        dom1.setValue(15);
        dom1.setKolor(KolorEnum.SZARY);
        dom1.setCenaZaMetr(10000);
        System.out.println(dom1.toString());
        dom1.liczbaMieszkancow(5);
        dom1.kolorDomu(KolorEnum.SZARY);

        System.out.println();

        Budynek dom2 = new Dom();
        dom2.setPow(130);
        dom2.setAdres("Nowakowskiego");
        dom2.setValue(10);
        dom2.setKolor(KolorEnum.BIALY);
        dom2.setCenaZaMetr(9500);
        System.out.println(dom2.toString());
        dom2.liczbaMieszkancow(6);
        dom2.kolorDomu(KolorEnum.BIALY);

    }
}

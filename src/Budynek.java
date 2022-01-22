abstract class Budynek {
    public static final int liczbaObjektow = 1; // deklaracja stałej

    abstract double getPowierzchnia(double parter, double pietro); // metoda abstrakcyjna bez ciała

    public void wiadomosc() {   //zwykła metoda
        System.out.println("To jest klasa abstrakcyjna");
    }

}

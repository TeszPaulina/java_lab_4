abstract class Figura {

    abstract double pole(double a, double b);
    abstract double obwod(double a, double b);

    public void nazwaFigury(String figura) {
        System.out.println("\nTo jest figura: " + figura);
    }
}
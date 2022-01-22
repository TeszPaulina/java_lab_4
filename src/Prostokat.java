public class Prostokat extends Figura {

    @Override
    double pole(double a, double b) {
        return a * b;
    }

    @Override
    double obwod(double a, double b) {
        return (2 * a) + (2 * b);
    }
}

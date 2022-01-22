public class Kwadrat extends Figura {

    @Override
    double pole(double a, double b) {
        return a * a;
    }

    @Override
    double obwod(double a, double b) {
        return 4 * a;
    }
}

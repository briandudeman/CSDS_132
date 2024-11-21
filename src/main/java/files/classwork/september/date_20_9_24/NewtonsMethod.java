package files.classwork.september.date_20_9_24;

public class NewtonsMethod {
    
    public static double sqrt(double a) {
        double x = a + 1;
        while (x * x - a > 1e-10) {
            x = x - (x * x - a) / (2.0 * x);
        }
        return x;
    }

}

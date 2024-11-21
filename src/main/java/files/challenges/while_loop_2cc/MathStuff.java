package files.challenges.while_loop_2cc;

public class MathStuff {
    
    public double cuberoot(double n) {
        double x = n + 1;
        while (x * x * x - n > 1e-10) {
            x = x - (x * x * x - n) / (3.0 * x * x);
        }
        return x;
    }
}

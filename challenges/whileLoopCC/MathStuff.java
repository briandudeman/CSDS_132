package challenges.whileLoopCC;

public class MathStuff {

    public static int greatestOddFactor(int n) {
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n;
    }
}
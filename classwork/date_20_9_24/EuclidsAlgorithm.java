package classwork.date_20_9_24;

public class EuclidsAlgorithm {
    
    public static int greatestCommonDivisor(int a, int b) {
        
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}

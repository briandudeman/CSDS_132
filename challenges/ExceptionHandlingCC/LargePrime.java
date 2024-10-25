package challenges.ExceptionHandlingCC;

import java.math.BigInteger;

public class LargePrime {
    
    public static void main(String[] args) {
        try {
            BigInteger bi = new BigInteger(args[0]);
            System.out.println(bi.nextProbablePrime());        
        } catch (ArithmeticException e) {
            System.out.println("2");
        } catch (Exception e) {
            System.out.println("You did not enter a valid integer value >:(");
        }
    }
}

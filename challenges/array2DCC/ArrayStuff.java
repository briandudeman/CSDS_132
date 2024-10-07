package challenges.array3DCC;

public class ArrayStuff {
    
    public double sum(double[][] input){
        double total = 0.0;
        for (int idx = 0; idx < input.length; idx++) {
            for (int jdx = 0; jdx < input[idx].length; jdx++) {
                total += input[idx][jdx][kdx];
            }
        }
        return total;
    }
}

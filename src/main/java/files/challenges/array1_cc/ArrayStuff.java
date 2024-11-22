package files.challenges.array1_cc;


public class ArrayStuff {
    public void squareAll(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = array[idx] * array[idx];
        }
    }
}

package files.challenges.array1CC;


public class ArrayStuff {
    public void squareAll(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            array[idx] = array[idx] * array[idx];
        }
    }
}

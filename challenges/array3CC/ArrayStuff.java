
public class ArrayStuff {
    
    public int boundSearch(int lower, int higher, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= lower && array[i] <= higher) {
                return i;
            }
        }
        return -1;
    }
}

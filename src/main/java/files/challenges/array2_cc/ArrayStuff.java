package files.challenges.array2_cc;

public class ArrayStuff {
    public int[] append(int[] array1, int[] array2) {

        int[] newArray = new int[array1.length + array2.length];

        for (int idx = 0; idx < array1.length; idx++) {
            newArray[idx] = array1[idx];
        }
        for (int idx = array1.length; idx < newArray.length; idx++) {
            newArray[idx] = array2[idx];
        }
        return newArray;
    }
}

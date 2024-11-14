package september.date_27_9_24;

public class Loops {
    

    public static void reversal(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int x = a[a.length - 1 - i];

            a[a.length - 1 - i] = a[i];
            a[i] = x;
        }
    }

    public static int[] addToEnd(int x, int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        newArray[newArray.length - 1] = x;

        return newArray;
    }
}

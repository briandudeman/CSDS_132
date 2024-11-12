package october.date_2_10_24;

public class ArrayStuff {
    
    // find a value in an array
    public static int search(int x, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int x, int[] array) {
        int smallI = 0;
        int largeI = array.length - 1;
        while ((largeI - smallI) % 2 != 1) {
            int mid = (largeI + smallI) / 2;
            if (x < mid) {
                largeI = mid;
            } else if (x > mid) {
                smallI = mid;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int binarySearch2(int x, int[] array) {
        int smallI = 0;
        int largeI = array.length - 1;
        while ((smallI <= largeI)) {
            int mid = (largeI + smallI) / 2;
            if (x < mid) {
                largeI = mid--;
            } else if (x > mid) {
                smallI = mid++;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

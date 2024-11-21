package files.challenges.generic_array_cc;

public class GenericArrayStuff {
    

    public static <T> void makeGenericArray(T[] array, T element1, T element2) {
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(element1)) {
                array[i] = element2;
            }
        }
    }

    
}

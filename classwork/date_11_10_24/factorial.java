package classwork.date_11_10_24;

public class factorial {
    public static int thing (int n) {
        if (n == 0) {
            return 1;
        } else {
            return thing(n - 1) * n;
        }
    }
}

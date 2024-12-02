package files.challenges.anonymous_class2_cc;

import java.util.ArrayList;
import java.util.List;

public class CCClass {
    
    public static void squareValuesKeepOdd(List<Integer> list) {
        list.removeIf(x -> ((x % 2) == 0));
        list.replaceAll(x -> (x*x));
    }
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        
        CCClass.squareValuesKeepOdd(i);
        System.out.println(i.toString());
    }
}

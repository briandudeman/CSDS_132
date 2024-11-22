package files.challenges.java_collections_cc;

import java.util.List;

public class CollectionsSum {
    

    public double sum(List<Double> list) {
        double sum = 0;
        for (Double i : list) {
            sum += i;
        }

        return sum;
    }

}

package files.challenges.integer_cc;

import java.util.Iterator;

public class IntegerRange<T> implements Iterable<T> {

    private int min;
    private int max;

    public IntegerRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator iterator() {
        return new IntegerRangeIterator(min, max);
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

}
package integer_cc;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntegerRangeIterator implements Iterator<Integer> {

    private Integer integerPointer;

    private int lastInt;

    public IntegerRangeIterator(int startInt, int endInt) {
        this.lastInt = endInt;
        this.integerPointer = startInt;
    }

    @Override
    public boolean hasNext() {
        return this.integerPointer != null;
    }

    @Override
    public Integer next() {
        if ((int)this.integerPointer > (int)this.lastInt) {
            this.integerPointer = null;
            throw new NoSuchElementException();
        }

        return this.integerPointer++;
    }
}
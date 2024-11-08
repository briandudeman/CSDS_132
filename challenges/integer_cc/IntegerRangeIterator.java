package integer_cc;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntegerRangeIterator<T> implements Iterator<T> {

    private Integer integerPointer;

    private int lastInt;

    public IntegerRangeIterator(Integer startInt, Integer endInt) {
        this.lastInt = endInt;
        this.integerPointer = startInt;
    }

    @Override
    public boolean hasNext() {
        return this.integerPointer != null;
    }

    @Override
    public T next() {
        if (this.integerPointer > this.lastInt) {
            this.integerPointer = null;
            throw new NoSuchElementException();
        }

        this.integerPointer = this.integerPointer + 1;
        return this.integerPointer;
    }
}
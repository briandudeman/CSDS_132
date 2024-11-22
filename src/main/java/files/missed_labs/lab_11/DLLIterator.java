package files.missed_labs.lab_11;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DLLIterator<T> implements Iterator<T> {
    
    private DoubleLinkedList<T> list;

    private DLNode<T> nodePointer;

    public DLLIterator(DoubleLinkedList<T> list) {
        this.list = list;
        this.nodePointer = list.getFront();
    }

    @Override
    public boolean hasNext() {
        return (this.nodePointer.getNext() != null);
    }

    @Override
    public T next() {
        if (this.nodePointer == null) {
            throw new NoSuchElementException();
        }
        T save = this.nodePointer.getElement();
        this.nodePointer = this.nodePointer.getNext();
        return save;

    }

    public void remove() {
        this.nodePointer.getNext().setPrevious(this.nodePointer.getPrevious());
        this.nodePointer.getPrevious().setNext(this.nodePointer.getNext());
        this.nodePointer.setNext(null);
        this.nodePointer.setPrevious(null);        
    }
}

package classwork.date_30_10_24;

import java.util.NoSuchElementException;

import classwork.date_28_10_24.LLNode;

public class LinkedListDemo<T> {

    private LLNode<T> firstNode;

    public LinkedListDemo() {
        this.setFirstNode(null);
    }

    public boolean isEmpty() {
        return this.getFirstNode() == null;
    }

    public void addToFront(T element) {
        this.setFirstNode(new LLNode<T> (element, this.getFirstNode()));
    }

    protected LLNode<T> getFirstNode() {
        return this.firstNode;
    }

    protected void setFirstNode(LLNode<T> firstNode) {
        this.firstNode = firstNode;
    }

    public T removeFromFront() {
        if (!this.isEmpty()) {
            T save = this.getFirstNode().getElement();
            this.setFirstNode(this.getFirstNode().getNext());
            return save;
        } else {
            throw new NoSuchElementException();
        }
    }

    public int length() {
        int count = 0;
        LLNode<T> nodeptr = this.getFirstNode();
        while (nodeptr != null) {
            count++;
            nodeptr = nodeptr.getNext();
        }
        return count;
    }

    public void addToEnd(T element) {
        if (!isEmpty()) {
            LLNode<T> nodeptr = this.getFirstNode();
            while (nodeptr.getNext() != null) {
                nodeptr = nodeptr.getNext();
            }
            nodeptr.setNext(new LLNode<T> (element, null));
        } else {
            this.addToFront(element);
        }
    }
}


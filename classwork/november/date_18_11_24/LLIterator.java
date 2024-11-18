package date_18_11_24;

import java.util.Iterator;
import java.util.NoSuchElementException;
import october.date_28_10_24.LLNode;

public class LLIterator<T> implements Iterator<T>{
    
    // the node before the one that the iterator is on
    private LLNode<T> previousNode;

    // the current node that the iterator is on
    private LLNode<T> currentNode;

    // the linked list itself
    private LinkedList<T> linkedList;

    /**
     * the constructor, sets the first node
     * @param firstNode the first node of the LinkedList
     */
    public LLIterator(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
        this.currentNode = this.linkedList.getFirstNode();
        this.previousNode = null;
    }

    /**
     * required by Iterator, returns the element of the current node (or next node depending on how you think about it) and sets the next node as well as the previous
     * @return the element of the next node, as type T
     */
    @Override
    public T next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        LLNode<T> save = this.currentNode;
        this.previousNode = this.currentNode;
        this.currentNode = this.currentNode.getNext();
        return save.getElement();
    }
    
    /**
     * returns a boolean for next node - required by Iterator interface
     * @return a boolean representing whether or not the current node has a next node
     */
    @Override
    public boolean hasNext() {
        return this.currentNode.getNext() != null;
    }
    
    /**
     * adds the element to the linked list in the position before the last call from next(). if next() has not been called or the list is empty, throws NoSuchElementException
     * @param element the element to be added, of type T
     */
    public void addBefore(T element) {
        if (this.previousNode == null) {
            throw new NoSuchElementException();
        }
        LLNode<T> newLLNode = new LLNode<>(element, this.currentNode);
        this.previousNode.setNext(newLLNode);
    }

    /**
     * adds the element to the position in the linked list after the last call from next(). if next() has not been called or the linked list is null, this method appends it to the front of the linked list
     * @param element the element to be added, of type T
     */
    public void addAfter(T element) {
        if (this.previousNode == null) {
            this.linkedList.setFirstNode(new LLNode<>(element, this.currentNode));
        } else {
            this.currentNode.setNext(new LLNode<>(element, this.currentNode.getNext()));
        }

    }
}

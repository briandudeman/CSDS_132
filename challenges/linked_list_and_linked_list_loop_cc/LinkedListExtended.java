package linked_list_and_linked_list_loop_cc;

import java.util.NoSuchElementException;
import linked_list_node_cc.LLNode;
import java.util.Iterator;

/**
* A class to represent a linked list of nodes.
*/
public class LinkedListExtended<T> {
    /** the first node of the list, or null if the list is empty */
    private LLNode<T> firstNode;
    /**
    * Creates an initially empty linked list
    */
    public LinkedListExtended() {
        firstNode = null;
    }
    /**
    * Returns the first node.
    */
    public LLNode<T> getFirstNode() {
        return firstNode;
    }
    /**
    * Changes the front node.
    * @param node the node that will be the first node of the new linked list
    */
    protected void setFirstNode(LLNode<T> node) {
        this.firstNode = node;
    }
    /**
    * Return whether the list is empty
    * @return true if the list is empty
    */
    public boolean isEmpty() {
        return (getFirstNode() == null);
    }
    /**
    * Add an element to the front of the linked list
    */
    public void addToFront(T element) {
        setFirstNode(new LLNode<T>(element, getFirstNode()));
    }
    /**
    * Removes and returns the element at the front of the linked list
    * @return the element removed from the front of the linked list
    * @throws NoSuchElementException if the list is empty
    */
    public T removeFromFront() {
        if (isEmpty())
            throw new NoSuchElementException();
            else {
            T save = getFirstNode().getElement();
            setFirstNode(getFirstNode().getNext());
            return save;
            }
    }
    /**
    * Return an iterator for the list - required by the Iterable interface
    * @return an iterator that permits a loop over the elements of the linked list
    */
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(getFirstNode());
    }
    
    /**
    * Returns the length of the linked list
    * @return the number of nodes in the list
    */
    public int length() {
        int lengthSoFar = 0;
        LLNode<T> nodeptr = getFirstNode();
        while (nodeptr != null) {
            lengthSoFar++;
            nodeptr = nodeptr.getNext();
        }
        return lengthSoFar;
    }
    /**
    * Adds an element to the end of the linked list
    * @param the element to add
    */
    public void addToEnd(T element) {
        if (isEmpty())
            addToFront(element);
        else {
            LLNode<T> nodeptr = getFirstNode();
            while (nodeptr.getNext() != null)
                nodeptr = nodeptr.getNext();
            nodeptr.setNext(new LLNode<T>(element, null));
        }
    }

    public void swapFirstTwo() {
        T originalFirstElement = this.removeFromFront();
        T originalSecondElement = this.removeFromFront();
        this.addToFront(originalFirstElement);
        this.addToFront(originalSecondElement);
    }

    public void insertSecondToEnd(T element) {
        if (isEmpty() || this.length() == 1) {
            this.addToFront(element);
        } else {
            LLNode<T> secondToLastNodePointer = this.getFirstNode();
            while (secondToLastNodePointer.getNext().getNext() != null) {
                secondToLastNodePointer = secondToLastNodePointer.getNext();
            }
            secondToLastNodePointer.setNext(new LLNode<T>(element, secondToLastNodePointer.getNext()));
        }
    }
}

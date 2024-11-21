package files.projects.project_4.main;

/**
* LinkedList is a classic LinkedList, has a first node and iterator to go over the items
* 
* @author Brian LewConklin
*/

import java.util.NoSuchElementException;
import java.lang.Iterable;
import java.util.Iterator;


public class LinkedList<T> implements Iterable<T>{

    // the first node of the linkedlist
    private LLNode<T> firstNode;

    /**
     * the constructor, sets the first node as null
     */
    public LinkedList() {
        this.setFirstNode(null);
    }

    /**
     * tells the user if the linkedlist is empty
     * @return a boolean representing whether or not the linkedlist has any nodes in it
     */
    public boolean isEmpty() {
        return this.getFirstNode() == null;
    }

    /**
     * adds the element to the front of the list
     * @param element the element to be added to the linked list
     */
    public void addToFront(T element) {
        this.setFirstNode(new LLNode<T> (element, this.getFirstNode()));
    }

    /**
     * returns the first node of the linked list
     * @return an LLNode storing an element of type T representing the first node
     */
    protected LLNode<T> getFirstNode() {
        return this.firstNode;
    }

    /**
     * sets the first node in the linked list
     * @param firstNode an LLNode representing the new first node to be added
     */
    protected void setFirstNode(LLNode<T> firstNode) {
        this.firstNode = firstNode;
    }

    /**
     * removes the first LLNode in the linkedlist and returns the element
     * @return returns the element that was removed
     */
    public T removeFromFront() {
        if (!this.isEmpty()) {
            T save = this.getFirstNode().getElement();
            this.setFirstNode(this.getFirstNode().getNext());
            return save;
        } else {
            throw new NoSuchElementException();
        }
    }

    /**
     * returns the length of the linked list
     * @return an int representing the length of the linked list
     */
    public int length() {
        int count = 0;
        LLNode<T> nodeptr = this.getFirstNode();
        while (nodeptr != null) {
            count++;
            nodeptr = nodeptr.getNext();
        }
        return count;
    }

    /**
     * adds an element to the end of the linked list
     * @param element the element of type T to be added to the end of the linked list
     */
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

    /**
     * creates and returns an iterator for this linked list
     * @return returns an LLIterator type object to iterate through
     */
    @Override
    public LLIterator<T> iterator() {
        return new LLIterator<T>(this);
    }
}
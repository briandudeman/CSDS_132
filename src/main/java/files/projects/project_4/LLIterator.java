package files.projects.project_4;

/**
* the LLIterator class implements Iterator and is the Iterator used by
* LinkedList. It has Iterator's abstract methods as well as a few custom
* ones
*
* @author Brian LewConklin
*/

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LLIterator<T> implements Iterator<T>{
    
    // the node  that the iterator is on
    private LLNode<T> currentNode;

    // the next node that the iterator is on
    private LLNode<T> nextNode;

    // the linked list itself
    private LinkedList<T> linkedList;

    /**
     * the constructor, sets the first node
     * @param firstNode the first node of the LinkedList
     */
    public LLIterator(LinkedList<T> linkedList) {
        this.linkedList = linkedList;
        this.nextNode = this.linkedList.getFirstNode();
        this.currentNode = null;
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
        LLNode<T> save = this.nextNode;
        this.currentNode = this.nextNode;
        this.nextNode = this.nextNode.getNext();
        return save.getElement();
    }
    
    /**
     * returns a boolean for next node - required by Iterator interface
     * @return a boolean representing whether or not the current node has a next node
     */
    @Override
    public boolean hasNext() {
        return this.nextNode != null;
    }
    
    /**
     * adds the element to the linked list in the position before the last call from next(). if next() has not been called or the list is empty, throws NoSuchElementException
     * @param element the element to be added, of type T
     */
    public void addBefore(T element) {
        if (this.currentNode == null) {
            throw new NoSuchElementException();
        }
        LLNode<T> newLLNode = new LLNode<>(element, this.currentNode);
        this.currentNode.setNext(newLLNode);
    }

    /**
     * adds the element to the position in the linked list after the last call from next(). if next() has not been called or the linked list is null, this method appends it to the front of the linked list
     * @param element the element to be added, of type T
     */
    public void addAfter(T element) {
        if (this.currentNode == null) {
            this.linkedList.setFirstNode(new LLNode<>(element, this.nextNode));
            this.nextNode = this.linkedList.getFirstNode();
        } else {
            this.currentNode.setNext(new LLNode<>(element, this.nextNode));
        }

    }
}
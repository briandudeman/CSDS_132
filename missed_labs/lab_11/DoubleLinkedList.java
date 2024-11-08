
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A doubly linked linked list.
 */
public class DoubleLinkedList<T> implements Iterable<T> {
  /** a reference to the first node of the double linked list */
  private DLNode<T> front;
  
  /** a reference to the last node of a double linked list */
  private DLNode<T> back;
  
  /** Create an empty double linked list. */
  public DoubleLinkedList() {
    front = back = null;
  }
  
  /** 
   * Returns true if the list is empty.
   * @return  true if the list has no nodes
   */
  public boolean isEmpty() {
    return (getFront() == null);
  }
  
  /**
   * Returns the reference to the first node of the linked list.
   * @return the first node of the linked list
   */
  protected DLNode<T> getFront() {
    return front;
  }
  
  /**
   * Sets the first node of the linked list.
   * @param node  the node that will be the head of the linked list.
   */
  protected void setFront(DLNode<T> node) {
    front = node;
  }
  
  /**
   * Returns the reference to the last node of the linked list.
   * @return the last node of the linked list
   */
  protected DLNode<T> getBack() {
    return back;
  }
  
  /**
   * Sets the last node of the linked list.
   * @param node the node that will be the last node of the linked list
   */
  protected void setBack(DLNode<T> node) {
    back = node;
  }
  
  /*----------------------------------------*/
  /* METHODS TO BE ADDED DURING LAB SESSION */
  /*----------------------------------------*/
  
  /**
   * Add an element to the head of the linked list.
   * @param element  the element to add to the front of the linked list
   */
  public void addToFront(T element) {
    if (this.getFront() != null) {
      this.setFront(new DLNode<>(element, null, this.getFront()));
    } else {
      DLNode<T> thisNode = new DLNode<>(element, null, null);
      this.setFront(thisNode);
      this.setBack(thisNode);
    }
  }
  
  /**
   * Add an element to the tail of the linked list.
   * @param element  the element to add to the tail of the linked list
   */
  public void addToBack(T element) {
    if (this.getBack() != null) {
      this.setBack(new DLNode<>(element, this.getBack(),null));
    } else {
      DLNode<T> thisNode = new DLNode<>(element, null, null);
      this.setFront(thisNode);
      this.setBack(thisNode);
    }
    
  }

  /**
   * Remove and return the element at the front of the linked list.
   * @return the element that was at the front of the linked list
   * @throws NoSuchElementException if attempting to remove from an empty list
   */
  public T removeFromFront() {
    DLNode<T> nodeToRemove = this.getFront();
    try {
      System.out.println(nodeToRemove);
      this.setFront(nodeToRemove.getNext());
      if (!isEmpty()) {
        nodeToRemove.getNext().setPrevious(null);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return nodeToRemove.getElement();
  }
  
  /**
   * Remove and return the element at the back of the linked list.
   * @return the element that was at the back of the linked list
   * @throws NoSuchElementException if attempting to remove from an empty list
   */
  public T removeFromBack() {
    DLNode<T> nodeToRemove = this.getBack();
    try {
      System.out.println(nodeToRemove);
      this.setBack(nodeToRemove.getPrevious());
      if (!isEmpty()) {
        nodeToRemove.getPrevious().setNext(null);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
    return nodeToRemove.getElement();
  }
     
  /**
   * Returns an interator for the linked list that starts at the head of the list and runs to the tail.
   * @return  the iterator that runs through the list from the head to the tail
   */
  @Override
  public Iterator<T> iterator() {
    return new DLLIterator<T>(this);
  }
}

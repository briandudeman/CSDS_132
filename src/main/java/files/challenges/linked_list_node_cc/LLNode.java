package files.challenges.linked_list_node_cc;

public class LLNode<T> {
    private T element;

    private LLNode<T> next;

    public LLNode(T element, LLNode<T> next) {
        this.element = element;
        this.next = next;
    }

    public T getElement() {
        return this.element;
    }

    public void setElement(T element) {
        this.element = element;
    }
    
    public LLNode<T> getNext() {
        return this.next;
    }

    public void setNext(LLNode<T> next) {
        this.next = next;
    }
}

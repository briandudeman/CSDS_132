package linked_list_node_cc;


public class Main {

    public static void main(String[] args) {
        LLNode<Integer> lln3 = new LLNode<>(3, null);
        LLNode<Integer> lln1 = new LLNode<>(1, null);
        lln3.setNext(lln1);
        LLNode<Integer> lln2 = new LLNode<>(2, null);
        lln2.setNext(lln3);
        lln1.setNext(lln2);
        System.out.println(lln1.getElement());
        System.out.println(lln1.getNext().getElement());
        System.out.println(lln1.getNext().getNext().getElement());
    }
}

package bntu.fitr.povt.ableHands.task1.model;

public class Stack {

    private Node list = null;
    private int size = 0;

    public void add(Node node) {
        node.next = list;
        list = node;
        size++;
    }

    public Node pop() {
        if (size != 0) {
            size--;
            Node temp = list;
            list = list.next;
            return temp;
        } else return null;
    }

    public Node get() {
        if (size != 0) {
            return list;
        } else return null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}

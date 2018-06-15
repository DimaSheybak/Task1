package bntu.fitr.povt.ableHands.task1.model;

public class Node {

    public Node next = null;
    private final char element;

    public Node(char element){
        this.element = element;
    }

    public char getElement() {
        return element;
    }
}

package bntu.fitr.povt.ableHands.task1.model;

public enum Type {
    ROUND('(', ')'), TRIANGLE('<', '>'), SQUARE('[', ']'), FIGURE('{', '}');

    private char beg;
    private char end;

    Type(char beg, char end) {
        this.beg = beg;
        this.end = end;
    }

    char getBeg() {
        return beg;
    }

    char getEnd() {
        return end;
    }
}

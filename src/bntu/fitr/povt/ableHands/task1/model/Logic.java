package bntu.fitr.povt.ableHands.task1.model;

public class Logic {

    public static boolean check(String str, Type bracket) {  
        Stack stack = new Stack();

        char beg = bracket.getBeg();
        char end = bracket.getEnd();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == beg) {
                stack.add(new Node(beg));
            }
            if (str.charAt(i) == end) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}

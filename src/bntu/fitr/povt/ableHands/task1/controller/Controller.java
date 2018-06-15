package bntu.fitr.povt.ableHands.task1.controller;

import bntu.fitr.povt.ableHands.task1.model.Logic;
import bntu.fitr.povt.ableHands.task1.model.Type;
import bntu.fitr.povt.ableHands.task1.view.Out;

public class Controller {

    public static void main(String[] args) {
        
        String s1 = "(something{abo)";
        String s2 = "{{{something}}  abo}";
        String s3 = "[2 + 2] * 2";
        String s4 = " degree > ";     
        
        Out.out(s1 + " --> " + Logic.check(s1, Type.ROUND));
        Out.out(s2 + " --> " + Logic.check(s2, Type.FIGURE));
        Out.out(s3 + " --> " + Logic.check(s3, Type.SQUARE));
        Out.out(s4 + " --> " + Logic.check(s4, Type.TRIANGLE));

    }

}

package bntu.fitr.povt.ableHands.task1.model;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LogicTest {

    @Test
    public void check1() {

        assertTrue(Logic.check("{something  abo}", Type.FIGURE));
    }

    @Test
    public void check2() {

        assertFalse(Logic.check("{[[]][[][][{{ssd))<}", Type.FIGURE));
    }

    @Test
    public void check3() {

        assertTrue(Logic.check("{{323[]((())sdf)(}{}}", Type.FIGURE));
    }

    @Test
    public void check4() {

        assertTrue(Logic.check("()dsf()sfd((}}}}{))", Type.ROUND));
    }

    @Test
    public void check5() {

        assertFalse(Logic.check("]{{}}[[]", Type.SQUARE));
    }

    @Test
    public void check6() {

        assertTrue(Logic.check("<><<<>>><><<>>", Type.TRIANGLE));
    }

}

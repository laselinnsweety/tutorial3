package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {
    @Test
    public void testAddition() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2,3));
    }

    @Test
    public void testSubtraction(){
        Calc c = new Calc();
        assertEquals(2, c.subtract(4,2));
    }
}

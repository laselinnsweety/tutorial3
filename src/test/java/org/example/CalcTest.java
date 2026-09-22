package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalcTest {

    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2,3));
    }

    // 新增减法测试（这个会失败！）
    @Test
    public void testSubtraction(){
        Calc c = new Calc();
        assertEquals(2, c.subtract(4,2));
    }
}

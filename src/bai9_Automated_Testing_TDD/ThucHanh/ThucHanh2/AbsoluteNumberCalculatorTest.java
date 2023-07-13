package bai9_Automated_Testing_TDD.ThucHanh.ThucHanh2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
//                .findAbsolute(number);
        assertEquals(expected, result);
    }
}

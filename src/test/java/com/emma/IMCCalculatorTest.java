package com.emma;

import org.junit.jupiter.api.Test;

public class IMCCalculatorTest {
    
    @Test
    void testCalculateIMC() {
        IMCCalculator calc = new IMCCalculator(70, 1.75);
        assertEquals(22.86, calc.calculateIMC());
    }
}

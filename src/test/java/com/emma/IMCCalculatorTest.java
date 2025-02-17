package com.emma;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IMCCalculatorTest {
    
    @Test
    void testCalculateIMC() {
        IMCCalculator calc = new IMCCalculator(70, 1.75);
        assertEquals(22.86, calc.calculateIMC());
    }

    @Test
    void testGetIMCClassification() {
        IMCCalculator calc = new IMCCalculator(20, 1.75);
        assertEquals("Delgadez severa", calc.getIMCClassification());
        calc = new IMCCalculator(50, 1.75);
        assertEquals("Delgadez moderada", calc.getIMCClassification());
        calc = new IMCCalculator(55, 1.75);
        assertEquals("Delgadez leve", calc.getIMCClassification());
        calc = new IMCCalculator(70, 1.75);
        assertEquals("Peso normal", calc.getIMCClassification());
        calc = new IMCCalculator(85, 1.75);
        assertEquals("Sobrepeso", calc.getIMCClassification());
        calc = new IMCCalculator(95, 1.75);
        assertEquals("Obesidad leve", calc.getIMCClassification());
        calc = new IMCCalculator(110, 1.75);
        assertEquals("Obesidad moderada", calc.getIMCClassification());
        calc = new IMCCalculator(130, 1.75);
        assertEquals("Obesidad mórbida", calc.getIMCClassification());
    }
}

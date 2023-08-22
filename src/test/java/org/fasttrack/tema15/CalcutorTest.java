package org.fasttrack.tema15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CalcutorTest {
    private Calculator calculator;

    //de evitat - poate genera memory leaks!
    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testFahToCel() {
        double fahToCel1 = Calculator.fahrenheitToCelsius(100);
        Assertions.assertEquals(37.77777777777778, fahToCel1);

        //caz in care calculul nu este corect
//        double calculated = 1.1d - 0.003d;
//        Assertions.assertEquals(1d, calculated);
    }

    @Test
    public void testCelToFah() {
        double celToFah1 = Calculator.celsiusToFahrenheit(100);
        Assertions.assertEquals(212, celToFah1);
    }

}

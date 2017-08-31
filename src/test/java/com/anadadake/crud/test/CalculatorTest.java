package com.anadadake.crud.test;

import com.anadadake.crud.basic.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() throws Exception {

        int sum = calculator.add(1, 2);
        Assert.assertEquals(3, sum);
    }

    @Test
    public void testMultiply() throws Exception {

        int multiply = calculator.multiply(2, 4);
        Assert.assertEquals(8, multiply);
    }
}

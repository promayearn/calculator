package com.augmentis.ayp.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test_1_plus_1_equals_2(){
        Calculator calculator = new Calculator();
        calculator.pressNumber("1");
        calculator.pressOperator("+");
        calculator.pressNumber("1");
        calculator.pressEqual();

        assertEquals(2,calculator.getResult(),0);
    }

    @Test
    public void test_1_minus_1_equals_0(){
        Calculator calculator = new Calculator();
        calculator.pressNumber("1");
        calculator.pressOperator("-");
        calculator.pressNumber("1");
        calculator.pressEqual();

        assertEquals(0,calculator.getResult(),0);
    }

    @Test
    public void test_4_multi_5_equals_20(){
        Calculator calculator = new Calculator();
        calculator.pressNumber("4");
        calculator.pressOperator("*");
        calculator.pressNumber("5");
        calculator.pressEqual();

        assertEquals(20,calculator.getResult(),0);
    }

    @Test
    public void test_4_divide_2_equals_2(){
        Calculator calculator = new Calculator();
        calculator.pressNumber("4");
        calculator.pressOperator("/");
        calculator.pressNumber("2");
        calculator.pressEqual();

        assertEquals(2,calculator.getResult(),0);
    }
}
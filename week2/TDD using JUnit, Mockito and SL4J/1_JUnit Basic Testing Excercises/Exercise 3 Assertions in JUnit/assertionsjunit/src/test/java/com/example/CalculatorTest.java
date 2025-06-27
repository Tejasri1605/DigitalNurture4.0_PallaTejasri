package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        System.out.println("Running testAddition...");
        int result = calc.add(7, 3);
        assertEquals("Addition should be correct", 10, result);
        System.out.println("Addition passed!");
    }

    @Test
    public void testSubtraction() {
        System.out.println("Running testSubtraction...");
        int result = calc.subtract(10, 5);
        assertNotEquals("Subtraction should not be incorrect", 0, result);
        System.out.println("Subtraction passed!");
    }

    @Test
    public void testTrueAndFalse() {
        System.out.println("Running testTrueAndFalse...");
        assertTrue("10 is greater than 5", 10 > 5);
        assertFalse("5 is not greater than 10", 5 > 10);
        System.out.println("Boolean conditions passed!");
    }

    @Test
    public void testNullAndNotNull() {
        System.out.println("Running testNullAndNotNull...");
        assertNull("Expected null", calc.getNullValue());
        assertNotNull("Greeting should not be null", calc.getGreeting("Teju"));
        System.out.println("Null checks passed!");
    }

    @Test
    public void testArrayEquals() {
        System.out.println("Running testArrayEquals...");
        int[] expected = {1, 2, 3};
        assertArrayEquals("Arrays should be equal", expected, calc.getNumbers());
        System.out.println("Array equality passed!");
    }

    @Test
    public void testSameAndNotSame() {
        System.out.println("Running testSameAndNotSame...");
        Object a = calc.getSameReference();
        Object b = calc;
        Object c = new Calculator();

        assertSame("Both references should be same", a, b);
        assertNotSame("Objects should not be the same", a, c);
        System.out.println("Reference checks passed!");
    }

    @Test
    public void testFail() {
        System.out.println("Running testFail...");
        // fail("This is a forced failure example");
        System.out.println("Fail test skipped or passed (no failure triggered).");
    }
}

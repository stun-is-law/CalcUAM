package calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void powerTwoNumbersTest() {
        Assert.assertEquals(8.0, calculator.powerTwoNumbers(2, 3), 0.0001);
    }

    @Test
    public void sqrtTest() {
        Assert.assertEquals(2.0, calculator.sqrt(4), 0.0001);
    }

    @Test
    public void CalculateSquareAreaTest() {
        Assert.assertEquals(25.0, calculator.CalculateSquareArea(5), 0.0001);
    }

    @Test
    public void CalculateRectAreaTest() {
        Assert.assertEquals(20.0, calculator.CalculateRectArea(4, 5), 0.0001);
    }

    @Test
    public void CalculateSquareCircTest() {
        Assert.assertEquals(20, calculator.CalculateSquareCirc(5));
    }

    @Test
    public void CalculateRectCircTest() {
        Assert.assertEquals(14, calculator.CalculateRectCirc(3, 4));
    }

    @Test
    public void CalculateTriangleAreaTest() {
        Assert.assertEquals(10.0, calculator.CalculateTriangleArea(4, 5), 0.0001);
    }

    @Test
    public void CalculateTriangleCircTest() {
        Assert.assertEquals(12.0, calculator.CalculateTriangleCirc(3, 4, 5), 0.0001);
    }

    @Test
    public void convertCelsiusToFarenheitTest() {
        Assert.assertEquals(32.0, calculator.convertCelsiusToFarenheit(0), 0.0001);
    }

    @Test
    public void convertFarenheitToCelsiusTest() {
        Assert.assertEquals(1170.0, calculator.convertFarenheitToCelsius(2138), 0.0001);
    }

    @Test
    public void convertFromMphToKphTest() {
        Assert.assertEquals(16.1, calculator.convertFromMphToKph(10), 0.0001);
    }

    @Test
    public void factorialTest() {
        Assert.assertEquals(120, calculator.factorial(5));
        Assert.assertEquals(1, calculator.factorial(0));
        Assert.assertEquals(1, calculator.factorial(1));
        Assert.assertEquals(2, calculator.factorial(2));
        Assert.assertEquals(6, calculator.factorial(3));    
    }

    @Test
    public void fibbonacciTest() {
        Assert.assertEquals(8, calculator.fibbonacci(6));
    }

    @Test
    public void findGCDTest() {
        Assert.assertEquals(6, calculator.findGCD(54, 24));
    }

    @Test
    public void findLCMTest() {
        Assert.assertEquals(12, calculator.findLCM(4, 6));
    }

    @Test
    public void isPrimeTest() {
        Assert.assertTrue(calculator.isPrime(7));
        Assert.assertFalse(calculator.isPrime(4));
        Assert.assertFalse(calculator.isPrime(1));
    }
}

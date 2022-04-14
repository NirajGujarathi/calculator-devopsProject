package Application;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test_squareRoot_AssertEquals() {  //true positive
        double num = 25.0;
        double expectedResult = 5.0;
        double result = Calculator.squareRoot_Function(num);
        Assert.assertEquals("square root of a number for True Positive" ,expectedResult, result, 0.0f);
    }

    @Test
    public void test_squareRoot_AssertNotEquals(){
        double num = 36.0;
        double expectedResult = 4.0;
        double result = Calculator.squareRoot_Function(num);
        Assert.assertNotEquals("square root of a number for False Positive", expectedResult, result, 0.0f);
    }

    @Test
    public void test_factorial_AssertEquals() {
        int num = 6;
        int expectedResult = 720;
        int result = Calculator.factorial_Function(num);
        Assert.assertEquals("factorial of a number for True Positive",expectedResult, result);
    }

    @Test
    public void test_factorial_AssertNotEquals() {   //false positive
        int num = 2;
        int expectedResult = 3;
        int result = Calculator.factorial_Function(num);
        Assert.assertNotEquals("factorial of a number for False Positive",expectedResult, result);
    }

    @Test
    public void test_naturalLog_AssertEquals() {
        double num = 2.718;
        double expectedResult = 1.0;
        double result = Calculator.naturalLog_Function(num);
        Assert.assertEquals("natural log function True Positive case",expectedResult, result, 0.2f);
    }

    @Test
    public void test_naturalLog_AssertNotEquals() {
        double num = 6;
        double expectedResult = 2.79175;    //actual output = 1.79175
        double result = Calculator.naturalLog_Function(num);
        Assert.assertNotEquals("natural log function False Positive case",expectedResult, result, 0.2f);
    }

    @Test
    public void test_power_AssertEquals() {
        double num = 3.0;
        double b = 3.0;
        double expectedResult = 27.0;
        double result = Calculator.power_Function(num,b);
        Assert.assertEquals("power function True Positive case", expectedResult, result, 0.0f);
    }

    @Test
    public void test_power_AssertNotEquals() {
        double num = 2.0;
        double b = 4.0;
        double expectedResult = 32.0;
        double result = Calculator.power_Function(num,b);
        Assert.assertNotEquals("power function False Positive case", expectedResult, result, 0.0f);
    }
}

package Application;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void test_squareRoot_True_Positive() {
        double num = 25.0;
        double expectedResult = 5.0;
        double result = Calculator.squareRoot_Function(num);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_squareRoot_False_Positive(){
        double num = 36.0;
        double expectedResult = 4.0;
        double result = Calculator.squareRoot_Function(num);
        Assert.assertNotEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_factorial_True_Positive() {
        int num = 6;
        int expectedResult = 720;
        int result = Calculator.factorial_Function(num);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_factorial_False_Positive() {
        int num = 2;
        int expectedResult = 3;
        int result = Calculator.factorial_Function(num);
        Assert.assertNotEquals(expectedResult, result);
    }

    @Test
    public void test_naturalLog_True_Positive() {
        double num = 2.718;
        double expectedResult = 1.0;
        double result = Calculator.naturalLog_Function(num);
        Assert.assertEquals(expectedResult, result, 0.2f);
    }

    @Test
    public void test_naturalLog_False_Positive() {
        double num = 6;
        double expectedResult = 2.79175;
        double result = Calculator.naturalLog_Function(num);
        Assert.assertNotEquals(expectedResult, result, 0.2f);
    }

    @Test
    public void test_power_True_Positive() {
        double num = 3.0;
        double b = 3.0;
        double expectedResult = 27.0;
        double result = Calculator.power_Function(num,b);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_power_False_Positive() {
        double num = 2.0;
        double b = 4.0;
        double expectedResult = 32.0;
        double result = Calculator.power_Function(num,b);
        Assert.assertNotEquals(expectedResult, result, 0.0f);
    }
}

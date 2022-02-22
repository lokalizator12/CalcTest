import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator cal1 = new Calculator();
        int expected = 15;
        double result = cal1.add(10,5);
        assertEquals(expected,result, 0.01);

        int expected1 = 30;
        double result1 = cal1.add(15,15);
        assertEquals(expected1,result1, 0.01);
    }

    @Test
    public void square() {
        Calculator cal2 = new Calculator();
        int expected1 = 9;
        double result1 = cal2.square(3);
        assertEquals(expected1,result1, 0.01);

        int expected = 100;
        double result = cal2.square(10);
        assertEquals(expected,result, 0.01);
    }

    @Test
    public void multiply() {
        Calculator calc3 = new Calculator();
        int expected3 = 9;
        double result3 = calc3.multiply(3,3);
        assertEquals(expected3, result3, 0.01);

        int expected1 = 100;
        double result1 = calc3.multiply(10,10);
        assertEquals(expected1, result1, 0.01);
    }

    @Test
    public void divide(){
        Calculator calc4 = new Calculator();
        int expected4 = 3;
        double result4 = calc4.divide(21,7);
        assertEquals(expected4, result4, 0.01);

        int expected = 1;
        double result = calc4.divide(3,3);
        assertEquals(expected, result, 0.01);
    }
}
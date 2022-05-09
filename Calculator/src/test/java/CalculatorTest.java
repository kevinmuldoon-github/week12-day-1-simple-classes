import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator ();
    }

    @Test
    public void canAdd() {
        assertEquals(47, calculator.addNumbers(12, 35));
    }

    @Test
    public void canSubtract() {
        assertEquals(10, calculator.subtractNumbers(17,7));
    }

    @Test
    public void canMultiply(){
        assertEquals(42, calculator.multiplyNumbers(6,7));
    }

    @Test
    public void canDivide() {
        assertEquals(0.4, calculator.divideNumbers(2,5), 0.0);
    }

}

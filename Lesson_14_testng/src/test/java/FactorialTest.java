import org.example.Main;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() {
        assertEquals(6, Main.getFactorialByNum(3));
        assertEquals(1, Main.getFactorialByNum(1));
        assertEquals(40320, Main.getFactorialByNum(8));
    }
}

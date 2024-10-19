import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void testFactorial(){
        int result5 = Main.getFactorialByNum(5);
        int result10 = Main.getFactorialByNum(10);
        int result0 = Main.getFactorialByNum(0);

        Assertions.assertEquals(120, result5);
        Assertions.assertEquals(3628800, result10);
        Assertions.assertEquals(1, result0);
        Assertions.assertNotEquals(23, result0);
    }
}

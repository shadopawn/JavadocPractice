import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTests {

    @Test
    public void TestFibonacci1() {
        assertEquals(Utils.Fibonacci(1), 1);
    }

    @Test
    public void TestFibonacci2() {
        assertEquals(Utils.Fibonacci(2), 1);
    }

    @Test
    public void TestFibonacci3() {
        assertEquals(Utils.Fibonacci(3), 2);
    }

    @Test
    public void TestFibonacci10() {
        assertEquals(Utils.Fibonacci(10), 55);
    }

    @Test
    public void TestFibonacci20() {
        assertEquals(Utils.Fibonacci(20), 6765);
    }

}

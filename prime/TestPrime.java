package prime;

import org.junit.*;
import static org.junit.Assert.*;

public class TestPrime {
    @Test
    public void oneIsPrime(){
        assertTrue("1 should be a prime", Prime.isPrime(1));
    }

    @Test
    public void fourIsNotPrime(){
        assertFalse("4 should not be a prime", Prime.isPrime(4));
    }
}

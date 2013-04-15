package prime;

import org.junit.*;
import static org.junit.Assert.*;

public class TestPrime {
    @Test
    public void oneIsPrime(){
        assertTrue("1 should be a prime", Prime.isPrime(1));
    }
}

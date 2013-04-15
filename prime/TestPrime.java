package prime;

import org.junit.*;
import static org.junit.Assert.*;

public class TestPrime {
    @Test
    public void oneIsPrime(){
        assertPrime(1);
    }

    @Test
    public void fourIsNotPrime(){
        assertNotPrime(4);
    }

    @Test
    public void nineIsNotPrime() {
        assertNotPrime(9);
    }

    public void assertPrime(int number){
        String message = "" + number + " should be a prime";
        assertTrue(message, Prime.isPrime(number));
    }

    public void assertNotPrime(int number){
        String message = "" + number + " should not be a prime";
        assertFalse(message, Prime.isPrime(number));
    }
}

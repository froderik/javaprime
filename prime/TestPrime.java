package prime;

import java.util.*;

import org.junit.*;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestPrime {
    private int number;
    private boolean isPrime;

    public TestPrime(int number, boolean isPrime){
        this.number = number;
        this.isPrime = isPrime;
    }

    @Parameters
    public static Collection<Object[]> bunchOfPrimes(){
        return Arrays.asList(new Object[][]{
            {1, true},
            {4, false},
            {9, false}
        });
    }

    @Test
    public void isPrime(){
        if(this.isPrime){
            assertPrime(this.number);
        } else {
            assertNotPrime(this.number);
        }
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

package prime;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestPrimeFactors {
	
	private int number;
	private int[] factors;
	
    public TestPrimeFactors(int number, int[] factors) {
		this.number = number;
		this.factors = factors;
	}

	@Parameters
    public static Collection<Object[]> bunchOfPrimes(){
        return Arrays.asList(new Object[][]{
        		{2, new int[]{2}},
        		{4, new int[]{2,2}},
        		{5, new int[]{5}},
        		{9, new int[]{3,3}}
        });
    }
    
    @Test
    public void assertFactors(){
    	assertArrayEquals(this.factors, Prime.factorsOf(this.number));
    }
}

package prime;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPrimeFactors {

	@Test
	public void factorsOf4(){
		int[] expected = new int[]{2,2};
		int[] actual = Prime.factorsOf(4);
		assertArrayEquals(expected,actual);
	}
}

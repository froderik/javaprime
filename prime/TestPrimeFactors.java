package prime;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPrimeFactors {

	@Test
	public void factorsOf4(){
		assertArrayEquals(new int[]{2,2},Prime.factorsOf(4));
	}
}

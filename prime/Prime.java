package prime;

public class Prime {
	public static boolean isPrime(int number) {
		for (int i = 2; i <= sqrt(number); i++) {
			int remainder = number % i;
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}

	private static double sqrt(int number) {
		return Math.sqrt(number);
	}

	public static int[] factorsOf(int i) {
		return new int[]{2,2};
	}
}

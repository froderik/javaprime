package prime;

public class Prime {
	public static boolean isPrime(int number) {
		for (int i = 2; i <= sqrt(number); i++) {
			if (divisibleBy(number, i)) return false;
		}
		return true;
	}

	private static double sqrt(int number) {
		return Math.sqrt(number);
	}

	public static int[] factorsOf(int number) {
		for(int candidate = 2; candidate <= sqrt(number); candidate++){
			if(isPrimeFactor(number, candidate)){
				return prepend(candidate, factorsOf(number / candidate));
			}
		}
		return new int[]{number};
	}

	private static boolean isPrimeFactor(int number, int candidate) {
		return isPrime(candidate) && divisibleBy(number, candidate);
	}

	private static boolean divisibleBy(int number, int candidate) {
		return number % candidate == 0;
	}

	private static int[] prepend(int prependee, int[] array) {
		int newLength = array.length + 1;
		int[] newArray = new int[newLength];
		newArray[0] = prependee;
		for (int j = 0; j < array.length; j++) {
			newArray[j+1] = array[j];
		}
		return newArray;
	}
}

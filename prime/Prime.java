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

	public static int[] factorsOf(int number) {
		if(isPrime(number)){
			return new int[]{number};
		}
		for(int i = 2; i <= sqrt(number); i++){
			if(isPrime(i) && number % i == 0){
				int[] rest = factorsOf(number / i);
				int[] total = new int[rest.length + 1];
				total[0] = i;
				for (int j = 0; j < rest.length; j++) {
					total[j+1] = rest[j];
				}
				return total;
			}
		}
		return new int[]{number};
	}
}

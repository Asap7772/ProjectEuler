
public class NthPrime {

	public static long primeN(int n) {
		int count = 0;
		long i = 1;
		while(count < n) {
			i++;
			if(isPrime(i)) {
				count++;
			}
		}
		return i;
	}
	
	public static boolean isPrime(long n) {
		for(long i = 2; i<= Math.sqrt(n); i++) {
			if(n%i == 0) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(NthPrime.primeN(10001));
	}
}

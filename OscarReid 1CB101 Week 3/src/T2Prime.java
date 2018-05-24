

public class T2Prime {

	public static void main(String[] args) {
		int n = 16;
		boolean isPrime = true;

		for (int i = 2; i < n; i++) {
			if (n % i != 0) {

			} else {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is NOT Prime");
		}
	}
}

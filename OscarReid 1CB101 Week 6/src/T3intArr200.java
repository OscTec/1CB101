import java.util.Arrays;

public class T3intArr200 {

	public static void main(String[] args) {
		int[] task3 = new int[200];
		Arrays.fill(task3, 10);
		for (int counter = 0; counter < task3.length; counter++) {
			if (counter > 45 && counter < 98) {
				task3[counter] = 0;
			}
			prime(counter, task3);
		}
	}

	public static void prime(int Z, int[] Five) {
		boolean isPrime = true;
		// System.out.println(Five[1]);
		for (int i = 2; i < Z; i++) {
			if (Z % i != 0) {

			} else {
				isPrime = false;
			}
		}
		if (isPrime) {
			// Five[Z]=-1;
			System.out.println("-1");
			// System.out.println(Five[Z]);
		} else {
			if (Z > 55 && Z < 108) {
				System.out.println("0");
			} else {
				System.out.println(Z + 10);
			}
			// System.out.println(Five[Z]);
		}

	}

}

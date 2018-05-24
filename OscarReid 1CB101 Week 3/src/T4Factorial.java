
public class T4Factorial {

	public static void main(String[] args) {
		int x = 1;
		int factorial = 4; // Calculates the factorial of this number
		for (int i = 1; i <= factorial; i++) {
			x = x * i;
		}
		System.out.println("Factorial of " + factorial + " is " + x);
	}
}
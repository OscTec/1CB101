import java.util.Scanner;

public class T9Multiplication_table {

	public static void main(String[] args) {
		Float y;
		int x = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("What number would you like a multiplication table for?");
		y = input.nextFloat();
		while (x <= 10) {
			System.out.println(x * y);
			x++;
		}

	}

}

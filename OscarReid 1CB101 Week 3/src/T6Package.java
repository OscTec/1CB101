import java.util.Scanner;

public class T6Package {

	public static void main(String[] args) {
		float x = 1, y, z = 2, c = 3;
		Scanner weight = new Scanner(System.in);
		System.out.println("What is your parcels weight?");
		y = weight.nextFloat();
		if (y < x) {
			System.out.println("£1.5 per Kg");// Less than 1 kilogram: 1.5 pKg
			System.out.println("The charge is £" + y * 1.5);
		}
		if (y < z && y >= x) {
			System.out.println("£3 per Kg");// 1 - 2 kilograms: 3.0 pKg
			System.out.println("The charge is £" + y * 3);
		}
		if (y <= c && y >= z) {
			System.out.println("£4 per Kg");// 2 - 3 kilograms: 4.0 pKg
			System.out.println("The charge is £" + y * 4);
		}
		if (y > c) {
			System.out.println("£5 per Kg");// Over 3 kilograms: 5.0 pKg
			System.out.println("The charge is £" + y * 5);
		}

	}
}

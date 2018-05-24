import java.util.Random;
import java.util.Scanner;

public class Exe4P2 {

	public static void main(String[] args) {
		System.out.println("What difficulty do you want?");
		System.out.println("Press 1 for Easy");
		System.out.println("Press 2 for Medium");
		System.out.println("Press 3 for Hard");
		Float y, x;
		Scanner difficulty = new Scanner(System.in);
		y = difficulty.nextFloat();
		switch (y) {
		case 1:
			Scanner guessNumber = new Scanner(System.in);
			Random generator = new Random();
			int randomNumber = generator.nextInt(10);
			if (guessNumber == randomNumber) {
				System.out.println("True");
			} else {
				System.out.println("False");
				System.out.println(randomNumber);
				break;
			}
		case 2:
			Scanner guessNumber1 = new Scanner(System.in);
			Random generator1 = new Random();
			int randomNumber1 = generator1.nextInt(500);
			if (guessNumber1 == randomNumber1) {
				System.out.println("True");
			} else {
				System.out.println("False");
				System.out.println(randomNumber);
				break;

			}
		case 3:
			Scanner guessNumber2 = new Scanner(System.in);
			Random generator2 = new Random();
			int randomNumber2 = generator2.nextInt(1000);
			if (guessNumber2 == randomNumber2) {
				System.out.println("True");
			} else {
				System.out.println("False");
				System.out.println(randomNumber);
				break;
			}
		case -1:
			System.exit(1);
		default:
			System.out.println("Invalid difficulty");
		}
	}
}
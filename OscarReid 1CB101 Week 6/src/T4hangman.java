import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class T4hangman {

	public static void main(String[] args) {
		String[] Word = { "york", "river", "school", "ship" };
		Random num = new Random();
		int X = num.nextInt(Word.length) + 0;
		System.out.println(Word[X] + " for test purposes");
		// Counter(null);
		GuessedL(Word[X]);

	}

	public static void GuessedL(String Word) {
		System.out.println("Enter a letter");
		int x = 4;
		do {
			Scanner letter = new Scanner(System.in);
			String Input = letter.next();
			String[] New = Word.split("");
			Arrays.fill(New, "_ ");
			for (int Count = 0; Count < New.length; Count++) {
				if (Input == New[Count]) {
					// StringBuilder List = new StringBuilder(New);
					// List.setCharAt(Count, Input);
					New[Count] = Input;
					System.out.println(New[Count]);
					// System.out.println(Arrays.toString(New));
					// do {
					// for (int X = 0; X < New.length; X++) {
					// System.out.print(New[x]);
					// } int X;
					// } while (X != New.length);
				} else {
					New[Count] = "_ ";
					System.out.print(New[Count]);
					// System.out.println(Arrays.toString(New));
				}
			}
		} while (x != 5);
	}

	public static void Guess() {
		System.out.println("How many guess would you like?");
		int GuessNum = new Scanner(System.in).nextInt();
		Counter(GuessNum);
	}

	public static void Counter(int Y) {
		int X = 0;
		do {
			// GuessedL();
			X++;
			System.out.println("You have " + (Y - X) + " guesses left");
			// This was my attempt at getting it to ask for letters until
			// running out of guesses

		} while (X < Y);
		System.out.println("Game over");
		System.out.println("Out of guesses");
		System.exit(0);
	}

}

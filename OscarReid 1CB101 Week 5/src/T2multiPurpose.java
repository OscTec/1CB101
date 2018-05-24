import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class T2multiPurpose {
	public static void toStart() {
		System.out.println("These are your options");
		System.out.println("1) Print word multiple times 2) Print Initials");
		System.out.println("3) Print Middle names 4) Print in Reverse");
		System.out.println("5) Print dashes 6) Password checker");
		System.out.println("7) To end program");
	}

	public static void printSeveralTimes() {
		System.out.println("Enter word");
		Scanner input1 = new Scanner(System.in);
		String x = input1.nextLine();
		System.out.println("How many times");
		Scanner input2 = new Scanner(System.in);
		int z = input1.nextInt();
		int n = 0;
		while (n < z) {
			System.out.print(x);
			n++;
		}
	}

	public static void Initials() {
		System.out.println("Please enter a full name");
		Scanner input3 = new Scanner(System.in);
		String input4 = input3.nextLine();
		String[] m = input4.split(" ");
		char first = m[0].charAt(0);
		char second = m[1].charAt(0);
		char last = m[2].charAt(0);
		System.out.print(first + " " + second + " " + last);
	}

	public static void middleName() {
		System.out.println("Please enter full name");
		Scanner input5 = new Scanner(System.in);
		String input6 = input5.nextLine();
		String[] o = input6.split(" ");
		int happy = o.length;
		String[] mid1 = Arrays.copyOfRange(o, 1, happy - 1);
		System.out.print(mid1);
	}

	public static void reverseName() {
		System.out.println("Please enter a between 5 and 15 characters");
		Scanner input7 = new Scanner(System.in);
		String input8 = input7.nextLine();
		int between = input8.length();
		if (between > 5 && between < 15) {
			String bat = StringUtils.reverse(input8);
			System.out.println(bat);
		} else {
			System.out.print("I said between 5 and 15 characters");
		}
	}

	public static void passwordChecker() {
		int i7 = 0, i9 = 0;
		String inv = "Invalid";
		System.out.println("This checks if a password is valid");
		Scanner input11 = new Scanner(System.in);
		String input12 = input11.nextLine();
		int len12 = input12.length();
		if (len12 > 7) {
			for (int i6 = 0; i6 < len12;) {
				if (Character.isUpperCase(input12.charAt(i6))) {
					i7 = i7++;
					i6++;
				} else {
					i6++;
				}
			}
			if (i7 > 2) {
				System.out.println("Enough uppercase");
			} else {
				System.out.println("Need more uppercase");
			}
			for (int i8 = 0; i8 < len12;) {
				if (Character.isLowerCase(input12.charAt(i8))) {
					i9 = i9++;
					i8++;
				} else {
					i8++;
				}
			}
			if (i9 > 2) {
				System.out.println("Enough Lowercase");
			} else {
				System.out.println("Need more Lowercase");
			}

		}
		int spacecount = 0;
		String spaces[] = input12.split(" ");
		int spacecount1 = spaces.length;
		if (spacecount1 > 0) {
			System.out.println("No spaces allowed");
		} else {
			System.out.println("Good you don't have spaces");
		}
	}

	public static void placeDashes() {
		System.out.println("Word to have dashes");
		Scanner input9 = new Scanner(System.in);
		String input10 = input9.nextLine();
		int input10len = input10.length();
		String[] spacesplit = input10.split("");
		for (int counter = 0; counter < input10len; counter++) {
			System.out.print(spacesplit[counter] + "-");
		}
	}

	public static void main(String[] args) {
		int X;
		toStart();
		do {
			Scanner input = new Scanner(System.in);
			X = input.nextInt();
			if (X == 1) {
				printSeveralTimes();
			} else if (X == 2) {
				Initials();
			} else if (X == 3) {
				middleName();
			} else if (X == 4) {
				reverseName();
			} else if (X == 5) {
				placeDashes();
			} else if (X == 6) {
				passwordChecker();
			}
		} while (X != 7);
		System.out.println("Program ended");
	}

}

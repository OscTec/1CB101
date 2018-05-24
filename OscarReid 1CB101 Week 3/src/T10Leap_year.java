import java.util.Scanner;

public class T10Leap_year {

	public static void main(String[] args) {
		System.out.println("What year would you like to check to see if it was a leap year?");
		int y;

		boolean isLeapYear = false;
		Scanner year = new Scanner(System.in);
		y = year.nextInt();

		if (y % 1000 == 0 && y % 400 == 0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}

		if (y % 4 == 0) {
			isLeapYear = true;
		} else {
			isLeapYear = false;

		}

		if (isLeapYear) {
			System.out.println(y + " Was  a leap year");
		} else {
			System.out.println(y + " Was not a leap year");
		}

	}

}

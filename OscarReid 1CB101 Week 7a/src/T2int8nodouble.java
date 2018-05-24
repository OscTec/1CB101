import java.util.Arrays;
import java.util.Scanner;

public class T2int8nodouble {

	public static void main(String[] args) {
		String[] Numbers = {"one", "two", "three", "four", "five", "six", "seven", "eight"};
		int[] array = new int[8];
		Arrays.fill(array, 10);
		int X = 0,Y = 0;
		do {
			Scanner input = new Scanner(System.in);
			array[X] = input.nextInt();
			int Z = input.nextInt();
			X++;
			if (array[X] == 1) {
				System.out.println("Error");
			} else {
				System.out.println("Next");
			}
		} while (X != 7);
		//Arrays.sort(array);
		int search = 12;
		int retVal = Arrays.binarySearch(array,search);
		System.out.println(retVal);
		do {
			System.out.println("Element " + Numbers[Y] + ": " + array[Y]);
			Y++;
		} while (Y != 8);
		//Need to sort out duplicate values

	}

}

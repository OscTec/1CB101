import java.util.Arrays;
import java.util.Scanner;

public class T5bankLoan {

	public static void main(String[] args) {
		System.out.println("How much would you like to loan?");
		Scanner Input1 = new Scanner(System.in);
		float Amount = Input1.nextFloat();
		System.out.println("How much would you like to repay each month?");
		Scanner Input2 = new Scanner(System.in);
		double interest = 1.03;
		float Repay = Input2.nextFloat();
		double M = Amount / Repay;
		double[] List = new double[(int) M+1];
		Arrays.fill(List, Amount);
		for (int counter = 0; counter < List.length; counter++) {
			List[counter] = (List[counter] - Repay * counter) * interest;
			System.out.print("Month " + counter + ": ");// Text
			System.out.println(List[counter]);// Value

		}
		System.out.println("The interest on this loan is 0.3%");

	}

}

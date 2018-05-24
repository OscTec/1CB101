import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class T5loanAdvanced {

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
		File printLoan = new File("LoanDetails.txt");
		PrintWriter pL = null;
		pL = new PrintWriter(printLoan);
		if(!printLoan.exists()); {
			try {
				pL = new PrintWriter(printLoan);
			}
			catch (FileNotFoundException e) {
				System.out.println("Closed");
				System.exit(-1);
			}
			for (int counter = 0; counter < List.length; counter++) {
				List[counter] = (List[counter] - Repay * counter) * interest;
				System.out.print("Month " + counter + ": ");// Text
				System.out.println(List[counter]);// Value

			}
			pL.close();
		}
		
		System.out.println("The interest on this loan is 0.3%");

	}
	

}

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class T3tickets {

	public static void main(String[] args) {
		int[] Stops = { 0, 3, 8, 10, 16 };
		double[] Type = { 0.25, 0.5, 0.75, 0.4, 1 };
		int count = 0;
		System.out.println("How many tickets do you want? (Max 10)");
		Scanner iAmount = new Scanner(System.in);//i short for input
		int Y = iAmount.nextInt();
		double[] Cost = new double[Y];
		do {
			System.out.println("What stop are you traveling to?");
			Scanner iStop = new Scanner(System.in);
			int Z = iStop.nextInt();
			System.out.println("What type of ticket do you want?");
			System.out.println("1)U10, 2)U16, 3)Student, 4)Over 60, 5)Other");
			Scanner iType = new Scanner(System.in);
			int X = iType.nextInt();
			double iAdd = Stops[Z - 1] * 0.5 * Type[X - 1];
			Cost[count] = iAdd;
			count++;
		} while (count != Y);
		double Total = DoubleStream.of(Cost).sum();
		System.out.println(Total);
	}

}//Need to sort U10 price with adult
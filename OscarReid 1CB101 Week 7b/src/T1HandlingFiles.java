import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class T1HandlingFiles {

	public static void main(String[] args) {
		System.out.println("Which method would you like");
		int Y;
		do {
			Scanner iPick = new Scanner(System.in);
			Y = iPick.nextInt();
			if (Y == 1) {
				readingFiles();
			}
			if (Y == 2) {
				writingFiles();
			}
		} while (Y != 3);
	}

	public static void readingFiles() {
		System.out.println("happy");
		int X = 5;
		X++;
		System.out.println(X);
	}

	public static void writingFiles() {
		String Y;
		Scanner iPick = new Scanner(System.in);
		Y = iPick.nextLine();
		File marks = new File(Y);
		PrintWriter pw = null;
		if(!marks.exists()) {
			String X;
			System.out.println("What you want?");
			Scanner iPic = new Scanner(System.in);
			X = iPic.nextLine();
			try {
				pw = new PrintWriter(marks);
			}
			catch (FileNotFoundException e) {
				System.out.println("Closed");
				System.exit(-1);
			}
			pw.println(X);
			pw.close();
		}
	}
}

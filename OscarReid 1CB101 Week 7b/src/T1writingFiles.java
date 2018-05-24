import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class T1writingFiles {

	public static void main(String[] args) {
		File marks = new File("marks.txt");
		PrintWriter pw = null;
		if(!marks.exists()); {
			try {
				pw = new PrintWriter(marks);
			}
			catch (FileNotFoundException e) {
				System.out.println("Closed");
				System.exit(-1);
			}
			pw.println("John   10");
			pw.println("Ann     14");
			pw.append("Rachel   12");
			pw.close();
		}

	}

}

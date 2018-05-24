import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class T1readingFiles {

	public static void main(String[] args) {
		File file = new File("kat.txt");
		try (FileInputStream fis = new FileInputStream(file)) {
			System.out.println("Total file to read (in bytes);" + fis.available());
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

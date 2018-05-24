
public class T1stringManipulation {

	static String changeMe = "Java is an Object Oriented programming language";

	public T1stringManipulation(String imput) {
	}

	public static void main(String[] args) {
		upperCase(args);
		lowerCase(args);
		UtLLtU(args);
		countLetters(args);
		removeSpaces(args);

	}

	public static void upperCase(String[] args) {
		T1stringManipulation testInstance = new T1stringManipulation("Upper");
		System.out.println(testInstance.toUpperCase(changeMe));
	}

	public String toUpperCase(String str) {
		return str.toUpperCase();
	}

	public static void lowerCase(String[] args) {
		T1stringManipulation testInstance = new T1stringManipulation("Lower");
		System.out.println(testInstance.toLowerCase(changeMe));
	}

	public String toLowerCase(String str) {
		return str.toLowerCase();
	}

	public static void UtLLtU(String[] args) {
		String task = new String(changeMe);
		int length = task.length();
		for (int i = 0; i < length; i++) {
			char task1 = task.charAt(i);
			if (Character.isUpperCase(task1)) {
				System.out.print(Character.toLowerCase(task1));
			} else if (Character.isLowerCase(task1)) {
				System.out.print(Character.toUpperCase(task1));
			}

		}

	}

	public static void countLetters(String[] args) { // Prints on wrong line.
														// Why? Needs to be
														// fixed.

		T1stringManipulation testInstance = new T1stringManipulation("count");

		System.out.println(testInstance.count(changeMe));

	}

	public int count(String str) {
		return str.length();
	}

	public static void removeSpaces(String[] args) {
		T1stringManipulation testInstance = new T1stringManipulation("rmSpaces");

		System.out.println(testInstance.removespaces(changeMe));
	}

	public String removespaces(String str) {
		return str.replaceAll("\\s", "");
	}

	public static void Index(String[] args) {
		T1stringManipulation testInstance = new T1stringManipulation("Index");
		System.out.println(testInstance.index("Java is an Object Oriented programming language"));

	}

	public int index(String str) {
		return str.indexOf("Oriented");
	}

}

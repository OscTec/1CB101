
public class T2reverseIntArraynearly {

	public static void main(String[] args) {
		Reverse();// Don't know how to call my method
	}

	public void Pass() {
		int[] rev = { 3, 6, 7 };
		Reverse(rev);
	}

	private static void Reverse(int[] z) {
		int Y = z.length - 1;
		for (int X = 0; X < z.length; X++) {
			System.out.print(z[X]);
			System.out.println(z[Y - X]);
		}

	}

}

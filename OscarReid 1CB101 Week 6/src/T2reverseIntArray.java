
public class T2reverseIntArray {

	public static void main(String[] args) {
		//int[] rev = { 3, 6, 7 };
		reverse();
	}

	public static void reverse() {
		int[] rev = { 3, 6, 7 };
		int Y = rev.length - 1;
		for (int X = 0; X < rev.length; X++) {
			System.out.print(rev[X]);
			System.out.println(rev[Y - X]);
		}

	}

}

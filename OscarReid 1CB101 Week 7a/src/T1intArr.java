import java.util.Arrays;
import java.util.stream.IntStream;

public class T1intArr {

	public static void main(String[] args) {
		int[] aArray = { 3, 6, 7, 11, 22, 35, 93 };
		sum(aArray);
		max(aArray);
		min(aArray);
		ave(aArray);
		copy(aArray);
	}

	public static void sum(int[] T1) {
		int X = IntStream.of(T1).sum();
		System.out.println(X);
	}

	public static void max(int[] T2) {
		Arrays.sort(T2);
		System.out.println(T2[T2.length - 1]);
	}

	public static void min(int[] T3) {
		Arrays.sort(T3);
		System.out.println(T3[T3.length - (T3.length)]);
	}

	public static void ave(int[] T4) {
		int X = IntStream.of(T4).sum();
		double Y = X / T4.length;
		System.out.println(Y);
	}

	public static void copy(int[] T5) {
		int[] X = T5;
		// main(X);
	}
}

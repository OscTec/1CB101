
public class T3stringSum {
	String word;

	public T3stringSum(String imput) {
		this.word = imput;
	}

	public String sum12(String str) {
		String x = str.replaceAll("\\D+", "");
		String i = x.replace("", ",").trim();
		int z = Integer.parseInt(x);
		String[] aArray = { i };
		int[] anArray = { z };
		int sum = 0;
		for (int y : anArray) {
			sum = sum+y;
			//sum += y;
		}
		System.out.println(sum);
		//System.out.println(aArray);
		return x;

	}
}

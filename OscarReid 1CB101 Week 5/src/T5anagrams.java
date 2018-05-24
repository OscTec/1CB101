import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class T5anagrams {

	public static void main(String[] args) {
		System.out.println("Please enter first word");
		Scanner word1 = new Scanner(System.in);
		String Word1 = word1.nextLine();
		System.out.println("Please enter second word");
		Scanner word2 = new Scanner(System.in);
		String Word2 = word2.nextLine();
		String w1 = Word1.toLowerCase();
		String w2 = Word2.toLowerCase();
		String W1  = w1.replaceAll("\\s","");
		String W2  = w2.replaceAll("\\s","");
	
		char[] W1a = W1.toCharArray();
		Arrays.sort(W1a);
		String W1b = new String(W1a);
		//System.out.println(W1b);
		char[] W2a = W2.toCharArray();
		Arrays.sort(W2a);
		String W2b = new String(W2a);
		//System.out.println(W2b);
		if (W1b==W2b) {
			System.out.println("They are anagrams");
		}
		else {
			System.out.println("They are not anagrams");
		}
		
	}

}
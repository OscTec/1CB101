import java.util.Scanner;

public class T7Stars {

	public static void main(String[] args) {
		float y;//defines y as a float
		Scanner star = new Scanner(System.in);//Takes user input and calls it star
		System.out.println("How many stars you want to go to?");//Asks user how many stars they want can only produce odd numbers
		y = star.nextFloat();//y is now equal to star
		for (int x = 1; x <= y+1; x = x + 2) {//+1 means that is they enter a even number they will get the number after it 
			
			for (int z = 1; z <= x; z++) {//Will print a star till j greater than i
				System.out.print("*");//This is what we are printing
			}
			System.out.println("");//This starts a new line

		}

	}

}

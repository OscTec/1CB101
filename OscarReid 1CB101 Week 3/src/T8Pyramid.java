

public class T8Pyramid {

	public static void main(String[] args) {
		
		int lineNumber=5;//How far across it starts at. Also what number it goes up to.
		
		for (int x=1;x<=lineNumber;x++) {//This is what allows it to go up to the line number
			
			for (int i=x;i<=lineNumber;i++){//This prints the spaces.
			System.out.print(" ");
			}
			for (int j=1;j<=x;j++){//This prints the left side and the middle.
				 System.out.print(j);
			}
			for (int j=x-1;j>=1;j--){//This prints the right side.
				 System.out.print(j);
			}
			 System.out.println();//This starts it on a new line.
		}
		

	}

}

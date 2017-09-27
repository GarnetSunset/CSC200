import java.util.Scanner;

public class Ass4Part5{	
	public static void main(String[] args) {
		 
		System.out.println("I can tell you if it is a leap year or not.");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a year after 1582: ");
		final int INPUT_YEAR = keyboard.nextInt();
		
		if (INPUT_YEAR < 1582){
			System.out.println("I can not count that far back. I Can only evaluate years after 1582.");
		}
		else if ((INPUT_YEAR % 4 == 0 && INPUT_YEAR % 100 > 0) || (INPUT_YEAR % 400 == 0)) {
			System.out.println(INPUT_YEAR + " is a leap year.");
		}
		else{
			System.out.println(INPUT_YEAR + " is NOT a leap year.");
		}
	}
}
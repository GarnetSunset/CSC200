import java.util.Scanner;

public class Ass5Part3 {
public static void main(String[] args) {

								System.out.println("I can tell you the Nth Fibonacci number.");
								Scanner keyboard = new Scanner(System.in);
								System.out.print("Please enter an integer to test this program:");
								int userInput;
								userInput = keyboard.nextInt();
								int fold1 = 0;
								int fold2 = 1;
								int foldNew = 0;
								int inputCounter;

								for ( inputCounter = 0; inputCounter < userInput; inputCounter++) {
																foldNew = fold1 + fold2;
																fold2 = fold1;
																fold1 = foldNew;
								}

								System.out.println("The" + inputCounter + "th Fibonacci is: " + foldNew);

}
}

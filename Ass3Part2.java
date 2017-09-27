import java.util.Scanner;
public class Ass3Part2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a whole number between 1 and 99,999 : ");
		int inputNumber = keyboard.nextInt();
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
		if (inputNumber > 99999) {
			System.out.println("Too big.");	
		}
		else{
			num1 = inputNumber / 10000;
			num2 = (inputNumber % 10000) / 1000;
			num3 = (inputNumber % 1000) / 100;
			num4 = (inputNumber % 100) / 10;
			num5 = (inputNumber % 10) ;
			System.out.println(num1 + "\n" + num2  + "\n" + num3  + "\n" + num4  + "\n" + num5  + "\n");

		}
	  
  
	}
}

 
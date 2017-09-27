import java.util.Scanner;

public class Ass4Part3{	
	public static void main(String[] args) {
		 
		System.out.println("I can calculate your taxes as if you lived in 1913.");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter your income for: ");
		final double INCOME_AMOUNT = keyboard.nextDouble();
		double taxAble1 = 0;
		double taxAble2 = 0;
		double taxAble3 = 0;
		double taxAble4 = 0;
		double taxAble5 = 0;
		double taxAble6 = 0;
		double taxItMore = 0;
		double incomeTax = 0;
		if (INCOME_AMOUNT <= 50000){ 
		taxAble1 = INCOME_AMOUNT * .01;
		}
		else if (INCOME_AMOUNT > 50000 && INCOME_AMOUNT <= 75000){ 
			taxAble1 = 50000 * .01;
			taxItMore = INCOME_AMOUNT - 50000;
			taxAble2 = taxItMore * .02;
		}	
		else if (INCOME_AMOUNT > 75000 && INCOME_AMOUNT <= 100000){ 
			taxAble1 = 50000 * .01;
			taxAble2 = 25000 * .02;
			taxItMore = INCOME_AMOUNT - 75000;
			taxAble3 = taxItMore * .03;
		}
		else if (INCOME_AMOUNT > 100000 && INCOME_AMOUNT <= 250000){ 
			taxAble1 = 50000 * .01;
			taxAble2 = 25000 * .02;
			taxAble3 = 25000 * .03;
			taxItMore = INCOME_AMOUNT - 100000;
			taxAble4 = taxItMore * .04;
		}
		else if (INCOME_AMOUNT > 250000 && INCOME_AMOUNT <= 500000){ 
			taxAble1 = 50000 * .01;
			taxAble2 = 25000 * .02;
			taxAble3 = 25000 * .03;
			taxAble4 = 150000 * .04;
			taxItMore = INCOME_AMOUNT - 150000;
			taxAble5 = taxItMore * .05;
		}
		else if (INCOME_AMOUNT > 500000){ 
			taxAble1 = 50000 * .01;
			taxAble2 = 25000 * .02;
			taxAble3 = 25000 * .03;
			taxAble4 = 150000 * .04;
			taxAble5 = 250000 * .05;
			taxItMore = INCOME_AMOUNT - 250000;
			taxAble6 = taxItMore * .06;
		}
		
	incomeTax = taxAble1 + taxAble2 + taxAble3 + taxAble4 + taxAble5 + taxAble6;
  
			 
	   System.out.printf("You said your income was $%10.2f ", INCOME_AMOUNT );
	   System.out.printf("\nso your tax is $%5.2f ",  incomeTax );
  
	}
}
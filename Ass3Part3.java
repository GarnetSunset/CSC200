import java.io.File;
import java.util.Scanner;
public class Ass3Part3
{
    public static void main(String[] args)
    {
		Scanner in = new Scanner(System.in);
		
        System.out.print("Enter the cost of gas ");
        double cost = in.nextDouble();

        System.out.print("Enter the number of gallons of gas in the tank ");
        double gas = in.nextDouble();

        System.out.print("Enter the fuel efficiency ");
        double efficiency = in.nextDouble();
        
        if (efficiency > 0)
        {
        	System.out.printf("Distance: %6.1f\n", gas * efficiency);
        	System.out.printf("Cost: %10.2f\n", cost * (100.0/efficiency));
        }
        else
        	System.out.println("No can go");
    }
}
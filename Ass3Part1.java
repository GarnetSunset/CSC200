import java.io.*;
import java.util.Scanner;

class Ass3Part1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Enter your measurement in meters:");
        Scanner scanner = new Scanner(System.in);
        String strin = scanner.nextLine();
        double meters = Double.parseDouble(strin);
        double inches = meters*39.0;
        double feet = meters*3.28084;
        double miles = meters*0.000621371;
        System.out.println(strin + " meters in inches is " + inches + " inches.");
        System.out.println(strin + " meters in feet is " + feet + " feet.");
        System.out.println(strin + " miles in inches is " + miles + " miles.");
    }
}

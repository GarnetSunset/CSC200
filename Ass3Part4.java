import java.util.*;
import java.lang.*;
import java.io.*;

public class Ass3Part4
{
public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter the name of your favorite city: ");

    String city = keyboard.nextLine();

    keyboard.close();

    System.out.println("Number of characters: " + city.length());

    System.out.println(city.toUpperCase());

    System.out.println(city.toLowerCase());

    System.out.println(city.charAt(0));
}
}
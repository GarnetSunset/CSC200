import java.util.*;
import java.lang.*;
import java.io.*;

class Ass3Part5
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input a string: ");
		String london = keyboard.nextLine();
		keyboard.close();
		String firstTwo = london.length() < 2 ? london : london.substring(0, 2);
		String remainFirst = london.substring(2);
		String jeff = london.length() > 2 ? london.substring(london.length() - 2) : london;
		String myname = london.substring(0, london.length() - 2);
		System.out.println(london);
		System.out.println(remainFirst+firstTwo);
		System.out.println(jeff+myname);
	}
}
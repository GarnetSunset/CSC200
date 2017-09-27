import java.util.Scanner;


public class Ass5Part1 {
public static void main(String[] args) {

								System.out.println("I can calculate the average of a bunch of numbers and also tel you the larges and the smalles of the numbers and their range.");
								Scanner keyboard = new Scanner(System.in);
								System.out.print("Please enter a set of 5 numbers seperated by blank space. It is OK to use fractions:");
								double[] inputArray;
								inputArray = new double[5];
								int inputCounter = 0;

								while (inputCounter < 5) {
																inputArray[inputCounter] = keyboard.nextDouble();
																inputCounter++;
								}
								int averageCounter = 0;
								double sum = 0;
								while (averageCounter < 5) {
																sum = sum + inputArray[averageCounter];
																averageCounter++;
								}
								double averageOutput = sum / inputArray.length;
								System.out.printf("The average if the numbers you entered is: %10.2f", averageOutput);
								System.out.print("\n");

								double maxValue = inputArray[0];
								int maxCounter = 0;
								while (maxCounter < inputArray.length) {
																if (inputArray[maxCounter] > maxValue) {
																								maxValue = inputArray[maxCounter];
																}
																maxCounter++;
								}
								System.out.printf("The largest value you entered is: %10.2f", maxValue);
								System.out.print("\n");

								double minValue = inputArray[0];
								int minCounter = 0;
								while (minCounter < inputArray.length) {
																if (inputArray[minCounter] < minValue) {
																								minValue = inputArray[minCounter];
																}
																minCounter++;
								}
								System.out.printf("The smallest value you entered is: %10.2f", minValue);
								System.out.print("\n");

								System.out.printf("The range of values you entered is: %10.2f", (maxValue - minValue));
								System.out.print("\n");



}
}

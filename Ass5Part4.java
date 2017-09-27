import java.util.Scanner;

public class Ass5Part4 {
public static void main(String[] args) {

        System.out.println("I can print a multiplication table.");

        for (int outterCounter = 1; outterCounter <= 10; outterCounter++) {
                for (int innerCounter = 1; innerCounter <= 10; innerCounter++) {
                        System.out.print(outterCounter * innerCounter + "\t");
                }
                System.out.print("\n");
        }


}
}

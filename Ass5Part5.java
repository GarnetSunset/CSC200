import java.util.Random;
import java.lang.Math;

public class Ass5Part5 {
public static void main(String[] args) {

        System.out.println("If a drunk person at location (x,y) randomly travels i various directions in a grid city. What happens after 100 random choices.");

        Random randomGenerator = new Random();
        int x = 0;
        int y = 0;
        double distance = 0;
        for (int decisionCounter = 0; decisionCounter < 100; decisionCounter++) {
                int direction = randomGenerator.nextInt(4) + 1;

                switch (direction) {
                case 1: x = x + 1;
                        break;
                case 2: x = x + -1;
                        break;

                case 3: y = y + 1;
                        break;

                case 4: y = y - 1;
                }

        }
        distance = Math.sqrt(((x * x) + (y * y)));



        System.out.printf("If the city blockes are one mile by one mile then the drunk person has traveled %4.2f", distance);
        System.out.println(" miles away from his original location by walking 100 miles. ");


}
}

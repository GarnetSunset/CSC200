import java.util.Scanner;

public class Ass5Part2 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Word: ");
        String word = input.next();
        input.close();
        for (int i = 0; i < word.length(); i++) {
                System.out.println(word.charAt(i));
        }
}
}


import java.util.Scanner;

public class Demo040 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);

            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is an uppercase character.");
            } else if (Character.isLowerCase(ch)) {
                System.out.println(ch + " is a lowercase character.");
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit.");
            } else {
                System.out.println(ch + " is a special character.");
            }
        }
    }
}

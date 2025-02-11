
import java.util.Scanner ;

public class Demo049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        int temp = Math.abs(number);

        while (temp > 0) {
            int digit = temp % 10; 
            reversedNumber = reversedNumber * 10 + digit; 
            temp /= 10;
        }

        if (number < 0) {
            reversedNumber *= -1;
        }

        System.out.println("The reversed number is: " + reversedNumber);

        scanner.close();
    }
}

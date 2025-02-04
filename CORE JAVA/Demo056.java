import java.util.Scanner;

public class Demo056 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sumOfCubes = 0;
        while (number != 0) {
            int digit = number % 10;
            sumOfCubes += digit * digit * digit;
            number = number / 10;
        }
        System.out.println("The sum of the cubes of the digits is: " + sumOfCubes);
        scanner.close();
    }
}

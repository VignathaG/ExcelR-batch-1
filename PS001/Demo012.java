import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double h = scanner.nextDouble();
        double area = 0.5 * b * h;
        System.out.println("The area of the triangle is: " + area);
        scanner.close();
    }
}

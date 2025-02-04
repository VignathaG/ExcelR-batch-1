

import java.util.Scanner;

public class Demo046 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the year");
            int year = sc.nextInt();
            if ((year % 400 == 0)) {
                System.out.println(year + ": is leap year");
            } else if ((year % 4 == 0) && (year % 100 != 0)) {
                System.out.println(year + ": is leap year");

            } else {
                System.out.println(year + " is not leap year");
            }
        }
    }
}

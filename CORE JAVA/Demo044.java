

import java.util.Scanner;

public class Demo044 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of [a]:");
        int a = sc.nextInt();
        System.out.print("Enter value of [b]:");
        int b = sc.nextInt();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Numbers after Swapping ");
        System.out.print("[a]=" + a);
        System.out.print("[b]=" + b);
        sc.close();
    }
}

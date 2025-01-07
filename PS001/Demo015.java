import java.util.Scanner;
public class Demo015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int x =sc.nextInt();
        System.out.print("Enter second number:");
        int y = sc.nextInt();
        int  temp;
        temp = x;
        x = y;
        y = temp;
        System.out.println("first:"+x);
        System.out.println("second:"+y);
        
        
    }
    

    
}

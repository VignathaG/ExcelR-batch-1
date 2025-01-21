import java.util.Scanner;
public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius:");
        double r = sc.nextDouble();
        sc.close();
        double area = Math.PI*r*r;
        System.out.println("Area of circle is :"+area);
    }
    
}

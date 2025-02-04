import java.util.Scanner;

class Customer {
    private String custname;
    private long bankaccno;
    private Double balance;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        custname = sc.next();
        System.out.print("Enter your account number: ");
        bankaccno = sc.nextLong();
        System.out.print("Enter bank balance: ");
        balance = sc.nextDouble();
        sc.close();
    }

    void display(){
        System.out.println("Hello " + custname + "\nBank account number: " + bankaccno + "\nBalance: " + balance);
    }
}

public class Demo010 {
    public static void main(String[] args) {
        Customer obj = new Customer();
        obj.input();
        obj.display();
    }
}
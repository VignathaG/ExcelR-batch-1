import java.util.Scanner;
public class Demo009 {
   String Cust_Name = "Vignatha";
   long Account_no = 00714;
   Double Balance = 20000.00;
   void accept_details(){
       System.out.println("Enter your name: ");
       Scanner sc = new Scanner(System.in);
       Cust_Name = sc.nextLine();
       System.out.println("Enter your Account number: ");
       Account_no = sc.nextLong();
       sc.close();
   }
   void Display_details(){
       System.out.println("Hello " +Cust_Name);
       System.out.println("your balance is: " +Balance);
   }
   public static void main(String[] args){
       Demo009 obj = new Demo009();
       obj.accept_details();
       obj.Display_details();
   } 
}

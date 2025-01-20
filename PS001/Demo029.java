import java.util.Scanner;

class Friend {
    String name;
    String phoneNumber;

    Friend(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }
}

public class Demo029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Friend[] friends = new Friend[10]; 

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for friend " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Phone Number: ");
            String phoneNumber = scanner.nextLine();
            friends[i] = new Friend(name, phoneNumber);
        }

        
        System.out.println("\nFriend Details:");
        for (Friend friend : friends) {
            System.out.println(friend);
        }

        scanner.close();
    }
}

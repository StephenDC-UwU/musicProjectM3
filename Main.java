import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("-----USER MENU-----\n" +
                    "1. Create user\n" +
                    "2. Show user\n" +
                    "3. Update user\n" +
                    "4. Delete user\n" +
                    "5. Exit");
            System.out.println("Choose an option: ");
            int option = input.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Create User");
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Select a correct option");
            }
    }
}
}


package Exasample;


import java.util.Scanner;


public class LoginSystem {

    static Scanner sc = new Scanner(System.in);

    
    final String USERNAME = "admin";
    final String PASSWORD = "1234";

    public static void main(String[] args) {
        LoginSystem ls = new LoginSystem();
        ls.menu();
    }

    void menu() {

        int attempts = 3;
        boolean running = true;

        do {
            System.out.println("\n--- Login Menu ---");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    try {
                        login(attempts);
                        running = false;   
                    } 
                    catch (AccountLockedException e)
                    {
                        System.out.println("ERROR: " + e.getMessage());
                        running = false;   
                    }
                    break;

                case 2:
                    System.out.println("Exiting system...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (running);
    }

    void login(int attempts) throws AccountLockedException 
    {

        while (attempts > 0) 
        {

            System.out.print("\nEnter username: ");
            String user = sc.next();

            System.out.print("Enter password: ");
            String pass = sc.next();

        
            if (user.equals(USERNAME) && pass.equals(PASSWORD)) {
                System.out.println("Login Successful!");
                return;
            } 
            else {
                attempts--;
                System.out.println("Incorrect credentials. Attempts left: " + attempts);
            }

            if (attempts == 0) {
                throw new AccountLockedException("Account locked due to too many failed attempts.");
            }
        }
    }
}

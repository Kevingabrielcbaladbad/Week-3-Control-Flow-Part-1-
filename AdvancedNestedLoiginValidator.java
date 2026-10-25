import java.util.Scanner;

public class Main {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String username = "Kevin";
    String password = "Kevin12345";
    boolean accountLocked = false;

    System.out.println("===== Nested Login Validator =====");

    System.out.print("Enter Username: ");
    String enteredUsername = input.nextLine();

    if (enteredUsername.equals(username)) {

    System.out.println("Username is correct.");

    System.out.print("Enter password: ");
    String enteredPassword = input.nextLine();

    if (enteredPassword.equals(password)) {

    System.out.println("Password is correct.");

    System.out.print("Is your account locked? (true/false): ");
    boolean enteredLockedStatus = input.nextBoolean();

    if (!enteredLockedStatus && !accountLocked) {
    System.out.println("Login successful! Welcome!");
    } else {
    System.out.println("Login failed: Account is locked.");
    }

    } else {
    System.out.println("Login failed: Incorrect password.");
    }

    } else {
    System.out.println("Login failed: Incorrect username.");
    }

    input.close();
    }
}
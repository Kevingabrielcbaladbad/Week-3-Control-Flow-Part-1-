import java.util.Scanner;

class Main {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    
    String validUsername = "Kevin";
    int validPin = 1234;

    
    String accountTier = "Gold";
    double balance = 5000.0;

    System.out.println("===== ATM Transaction Authorizer =====");

    
    System.out.print("Enter Username: ");
    String inputUser = input.nextLine();

    System.out.print("Enter 4-digit PIN: ");
    int inputPin = input.nextInt();

    System.out.print("Enter Withdrawal amount: ");
    double WithdrawalAmount = input.nextDouble();

    System.out.println();

    
    if (inputUser.equals(validUsername)) {
    if (inputPin == validPin) {

    System.out.println(
    "Login verified: " + accountTier + " Account");

    double feePercent = 0.0;
    double tierLimit = 0.0;

    if (accountTier.equals("Bronze")) {
    tierLimit = 1000.0;
    feePercent = 2.0;
    } else if (accountTier.equals("Silver")) {
    tierLimit = 2000.0;
    feePercent = 2.0;
    } else if (accountTier.equals("Gold")) {
    tierLimit = 3000.0;
    feePercent = 2.0;
    } else if (accountTier.equals("Platinum")) {
    tierLimit = 4000.0;
    feePercent = 0.0;
    } else {
    System.out.println("DENIED: Invalid account tier.");
    input.close();
    return;
    }

    if (WithdrawalAmount > 0) {
    if (WithdrawalAmount <= balance) {
    if (WithdrawalAmount <= tierLimit) {

    double fee = 0.0;

    switch (accountTier) {
    case "Bronze":
    fee = WithdrawalAmount * 0.02;
    break;

    case "Silver":
    fee = WithdrawalAmount * 0.02;
    break;

    case "Gold":
    fee = WithdrawalAmount * 0.01;
    break;

    case "Platinum":
    fee = 0.0;
    break;
    }

    double totalDeduction =
    WithdrawalAmount + fee;

    if (totalDeduction <= balance) {

    System.out.println("TRANSACTION APPROVED!");
    System.out.println("Withdrawal: " + WithdrawalAmount);
    System.out.println("Service Fee (" + feePercent + "%): "
    + fee);
    System.out.println(
    "Total Deduction: " + totalDeduction);
    System.out.println(
    "Remaining Balance: "
    + (balance - totalDeduction));

    } else {
    System.out.println(
    "DENIED: Insufficient balance to cover Withdrawal and service fee.");
    }

    } else {
    System.out.println(
    "DENIED: Amount exceeds daily Withdrawal limit of "
    + tierLimit);
    }

    } else {
    System.out.println(
    "DENIED: Insufficient account balance.");
    }

    } else {
    System.out.println(
    "DENIED: Withdrawal amount must be greater than zero.");
    }

    } else {
    System.out.println("DENIED: PIN does not match.");
    }

    } else {
    System.out.println("DENIED: Username not recognized.");
    }

    input.close();
}

}
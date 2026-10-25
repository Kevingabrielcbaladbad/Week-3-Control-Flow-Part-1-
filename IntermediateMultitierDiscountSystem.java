public class Main {
public static void main(String[] args) {

    double purchaseAmount = 5000.00;
    double discountRate;
    String discountTier;

    if (purchaseAmount < 1500) {
    discountRate = 0.00;
    discountTier = "No Discount (0%)";
    } else if (purchaseAmount < 3000) {
    discountRate = 0.05;
    discountTier = "Third Tier (5%)";
    } else if (purchaseAmount < 4000) {
    discountRate = 0.10;
    discountTier = "Second Tier (10%)";
    } else {
    discountRate = 0.15;
    discountTier = "First Tier (15%)";
    }

    System.out.println("Purchase Amount: " + purchaseAmount);
    System.out.println("Discount Tier: " + discountTier);
    System.out.println("Discount Rate: " + discountRate);
    System.out.println("Final Price: " + (purchaseAmount - (purchaseAmount * discountRate)));
    }
}
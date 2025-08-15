package CompileTime;
import java.util.Scanner;

class PaymentProcessor {

    // Card payment
    void makePayment(String cardNumber, int cvv, double amount) {
        System.out.println("Processing card payment...");
        System.out.println("Card Number: " + maskCardNumber(cardNumber));
        System.out.println("Amount: $" + amount);
        System.out.println("Payment successful via Card.\n");
    }

    // UPI payment
    void makePayment(String upiId, double amount) {
        System.out.println("Processing UPI payment...");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: $" + amount);
        System.out.println("Payment successful via UPI.\n");
    }

    // Cash on Delivery
    void makePayment(double amount) {
        System.out.println("Selected Cash on Delivery (COD).");
        System.out.println("Amount to be paid on delivery: $" + amount + "\n");
    }

    private String maskCardNumber(String cardNumber) {
        if (cardNumber.length() > 4) {
            return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        } else {
            return cardNumber;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor payment = new PaymentProcessor();

        System.out.println("Select payment method:");
        System.out.println("1. Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash on Delivery");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter card number: ");
                String cardNumber = scanner.nextLine();
                System.out.print("Enter CVV: ");
                int cvv = scanner.nextInt();
                System.out.print("Enter amount: ");
                double cardAmount = scanner.nextDouble();
                payment.makePayment(cardNumber, cvv, cardAmount);
                break;

            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = scanner.nextLine();
                System.out.print("Enter amount: ");
                double upiAmount = scanner.nextDouble();
                payment.makePayment(upiId, upiAmount);
                break;

            case 3:
                System.out.print("Enter amount: ");
                double codAmount = scanner.nextDouble();
                payment.makePayment(codAmount);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}

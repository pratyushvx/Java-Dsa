package Abstraction;
// Abstract Class - defines what needs to be done, not how
abstract class PaymentProcessor {
    // Abstract method - must be overridden
    public abstract void processPayment(double amount);

    // Concrete method - same for all payment types
    public void startTransaction() {
        System.out.println("Transaction started...");
    }

    public void endTransaction() {
        System.out.println("Transaction completed successfully.");
    }
}

// Subclass - PayPal
class PayPalPayment extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Subclass - Credit Card
class CreditCardPayment extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

// Main Class
public class PaymentTest {
    public static void main(String[] args) {
        PaymentProcessor payment1 = new PayPalPayment();
        payment1.startTransaction();
        payment1.processPayment(150.0);
        payment1.endTransaction();

        System.out.println();

        PaymentProcessor payment2 = new CreditCardPayment();
        payment2.startTransaction();
        payment2.processPayment(250.0);
        payment2.endTransaction();
    }
}

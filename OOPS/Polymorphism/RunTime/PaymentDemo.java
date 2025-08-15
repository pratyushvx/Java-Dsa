package RunTime;
// General contract — only common behavior
abstract class PaymentProcessor {
    public abstract void processPayment(double amount);

    public void startTransaction() {
        System.out.println("Transaction started...");
    }

    public void endTransaction() {
        System.out.println("Transaction completed successfully.");
    }
}

// PayPal implementation
class PayPalPayment extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// Credit Card implementation
class CreditCardPayment extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount);
    }
}

// UPI implementation
class UPIPayment extends PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
    }
}

// Main class — shows polymorphism
public class PaymentDemo {
    public static void main(String[] args) {
        
        // ❌ No polymorphism — fixed to PayPal forever
        PayPalPayment payPal = new PayPalPayment();
        payPal.startTransaction();
        payPal.processPayment(100);
        payPal.endTransaction();

        System.out.println("\n--- Using Runtime Polymorphism ---\n");

        // ✅ Polymorphism — can store any payment type in same reference
        PaymentProcessor payment;

        payment = new PayPalPayment(); // Today
        payment.startTransaction();
        payment.processPayment(150);
        payment.endTransaction();

        System.out.println();

        payment = new CreditCardPayment(); // Tomorrow
        payment.startTransaction();
        payment.processPayment(200);
        payment.endTransaction();

        System.out.println();

        payment = new UPIPayment(); // Next week
        payment.startTransaction();
        payment.processPayment(50);
        payment.endTransaction();
    }
}

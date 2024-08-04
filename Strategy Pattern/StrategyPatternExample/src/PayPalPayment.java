public class PayPalPayment implements PaymentStrategy {
private String password;
private String email;
public PayPalPayment(String email, String password) {
        this.password = password;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
        // Here you can add actual logic for PayPal payment
    }
}

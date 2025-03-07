package Day7;

interface UPIPayment {
    void upiTransfer();
}

interface CreditCardPayment {
    void cardTransfer();
}

class PaymentGateway implements UPIPayment, CreditCardPayment {
    @Override
    public void upiTransfer() {
        System.out.println("UPI Payment Successful");
    }

    @Override
    public void cardTransfer() {
        System.out.println("Credit Card Payment Successful");
    }
}

public class upi {
    public static void main(String[] args) {
        PaymentGateway payment = new PaymentGateway();
        payment.upiTransfer();
        payment.cardTransfer();
    }
}

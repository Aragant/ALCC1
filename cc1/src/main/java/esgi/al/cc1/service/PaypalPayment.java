package esgi.al.cc1.service;

public class PaypalPayment implements PaymentMethod {
    @Override
    public Boolean paid() {
        System.out.println("Paypal Payment Done");
        return true;
    }
}

package esgi.al.cc1.service;

public class PaymentEngine {
    PaymentMethod paymentMethod;

    PaymentEngine(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    Boolean paid(){
        return this.paymentMethod.paid();
    }
}

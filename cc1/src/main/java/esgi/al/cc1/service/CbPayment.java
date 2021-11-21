package esgi.al.cc1.service;

public class CbPayment implements PaymentMethod{

    @Override
    public Boolean paid() {
        System.out.println("CB Payment Done");
        return true;
    }
}

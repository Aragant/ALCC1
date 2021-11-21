package esgi.al.cc1.service;
import java.rmi.UnexpectedException;

import esgi.al.cc1.model.Contractor;
import esgi.al.cc1.model.Subscriber;
import esgi.al.cc1.model.Tradesman;
import esgi.al.cc1.service.validator.ContractorValidator;
import esgi.al.cc1.service.validator.SubscriberValidator;
import esgi.al.cc1.service.validator.TradesmanValidator;

public class SubscriberEngine {


    private static void subscribe(Subscriber subscriber, PaymentEngine paymentEngine) throws UnexpectedException{
        SubscriberValidator validator = subscriber instanceof Tradesman ? new TradesmanValidator((Tradesman)subscriber) : new ContractorValidator((Contractor)subscriber);
        if(validator.isValid()){
            paymentEngine.paid();
        }
        else{
            throw new UnexpectedException("You are unauthorized to subscribe");
        }
    }

    public static void subscribeWithCB(Subscriber subscriber){
        PaymentEngine paymentEngine = new PaymentEngine(new CbPayment());
        try {
            SubscriberEngine.subscribe(subscriber, paymentEngine);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

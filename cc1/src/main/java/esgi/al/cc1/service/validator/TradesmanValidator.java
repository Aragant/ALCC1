package esgi.al.cc1.service.validator;

import esgi.al.cc1.model.Tradesman;

public class TradesmanValidator implements SubscriberValidator {
    Tradesman tradesman;

    public TradesmanValidator(Tradesman tradesman){
        this.tradesman = tradesman;
    }

    @Override
    public Boolean isValid() {
        return isMajor();
    }

    private Boolean isMajor(){
        return tradesman.getAge() >= 18 ? true : false;
    }

}

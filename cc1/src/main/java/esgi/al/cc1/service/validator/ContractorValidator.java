package esgi.al.cc1.service.validator;

import esgi.al.cc1.model.Contractor;

public class ContractorValidator implements SubscriberValidator {
    Contractor contractor;

    public ContractorValidator(Contractor contractor){
        this.contractor = contractor;
    }

    @Override
    public Boolean isValid() {
        return true;
    }
    
}

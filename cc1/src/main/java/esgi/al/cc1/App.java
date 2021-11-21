package esgi.al.cc1;

import esgi.al.cc1.model.Subscriber;
import esgi.al.cc1.model.Tradesman;
import esgi.al.cc1.service.SubscriberEngine;

public class App
{
    public static void main( String[] args )
    {
        Subscriber sub1 = new Tradesman("toto", "titi", 8, "totoCompagny");

        SubscriberEngine.subscribeWithCB(sub1);
    }
}

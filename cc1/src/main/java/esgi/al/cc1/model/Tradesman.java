package esgi.al.cc1.model;


public class Tradesman extends Subscriber{
    String compagnyName;

    public Tradesman(String name, String lastName, Integer age, String compagnyName){
        super(name, lastName, age);
        this.compagnyName = compagnyName;
    }
}

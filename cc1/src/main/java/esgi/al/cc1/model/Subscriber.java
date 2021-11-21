package esgi.al.cc1.model;


public class Subscriber{
    private String name;
    private String  lastName;
    private Integer age;

    public Subscriber (String name, String lastName, Integer age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }
}
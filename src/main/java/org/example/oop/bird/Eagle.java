package org.example.oop.bird;

public class Eagle extends Birds implements Birds.Flyable {
    public Eagle (String name, int age){
        super(name, age);
    }
    @Override
    public void fly(){
        System.out.println(name +"flying");
    }

    public void hunt(){
        System.out.println(name +"hunting");
    }
    @Override
    public String makeSound(){
        return "Kee-kee-kee";
    }
}

package org.example.oop.fish;

public class Piranha extends Fish {
    public Piranha (String name, int age){
        super(name, age,false);
    }
    @Override
    public String makeSound(){
        return "Ham-ham";
    }
    public void hunt(){
        System.out.println(name + "hunting");
    }
}

package org.example.oop.mammal;

public class Dog extends Mammal implements Mammal.Playable {
    public Dog(String name, int age ){
        super(name, age, true);
    }
    @Override
    public String makeSound(){
        return "Ham-Ham";
    }
    public void fetch(){
        System.out.println(name + "brings a stick");
    }
    @Override
    public void play(){
        System.out.println(name +"playing");
    }
}

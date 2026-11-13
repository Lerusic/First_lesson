package org.example.oop.reptile;

public class Cobra extends Reptiles implements Reptiles.Swimmable {
    public Cobra(String name, int age) {
        super(name, age, true);
    }

    @Override
    public String makeSound() {
        return "Ssss";
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }

    public void dance() {
        System.out.println(name + "dancing");
    }
}

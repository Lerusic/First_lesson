package org.example.oop.reptile;

import org.example.oop.behavior.Swimmable;

public class Cobra extends Reptile implements Swimmable {
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

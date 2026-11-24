package org.example.oop.bird;

import org.example.oop.behavior.Flyable;
import org.example.oop.behavior.Swimmable;

public class Duck extends Bird implements Flyable, Swimmable {
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Mac-mac";
    }

    @Override
    public void fly() {
        System.out.println(name + "flying");
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }
}




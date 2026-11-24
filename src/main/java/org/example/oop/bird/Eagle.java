package org.example.oop.bird;

import org.example.oop.behavior.Flyable;

public class Eagle extends Bird implements Flyable {
    public Eagle(String name, int age) {
        super(name, age);
    }

    public void hunt() {
        System.out.println(name + "hunting");
    }

    @Override
    public String makeSound() {
        return "Kee-kee-kee";
    }

    @Override
    public void fly() {
        System.out.println(name + "flying");
    }
}


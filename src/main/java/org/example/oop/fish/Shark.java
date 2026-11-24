package org.example.oop.fish;

import org.example.oop.behavior.Swimmable;

public class Shark extends Fish implements Swimmable {
    public Shark(String name, int age) {
        super(name, age, true);
    }

    public void hunt() {
        System.out.println(name + "hunting");
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }
}

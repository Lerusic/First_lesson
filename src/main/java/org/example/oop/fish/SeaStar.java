package org.example.oop.fish;

import org.example.oop.behavior.Swimmable;

public class SeaStar extends Fish implements Swimmable {
    public SeaStar(String name, int age) {
        super(name, age, true);
    }

    public void glued() {
        System.out.println(name + "glued on");
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }

}

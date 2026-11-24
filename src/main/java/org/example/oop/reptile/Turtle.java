package org.example.oop.reptile;

import org.example.oop.behavior.Swimmable;

public class Turtle extends Reptile implements Swimmable {
    public Turtle(String name, int age) {
        super(name, age, false);
    }

    @Override
    public String makeSound() {
        return "...";
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }

    public void hideInShell() {
        System.out.println(name + "hiding in shell");
    }
}

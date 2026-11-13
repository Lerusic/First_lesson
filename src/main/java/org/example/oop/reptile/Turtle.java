package org.example.oop.reptile;

public class Turtle extends Reptiles implements Reptiles.Swimmable {
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

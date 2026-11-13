package org.example.oop.mammal;

import org.w3c.dom.ls.LSOutput;

public class Cat extends Mammal implements Mammal.Playable {
    public Cat(String name, int age) {
        super(name, age, true);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }

    @Override
    public void play() {
        System.out.println(name + "playing");
    }

    public void licking() {
        System.out.println(name + "washing itself");
    }
}

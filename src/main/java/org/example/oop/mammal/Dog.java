package org.example.oop.mammal;

import org.example.oop.behavior.Playable;

public class Dog extends Mammal implements Playable {
    public Dog(String name, int age) {
        super(name, age, true);
    }

    @Override
    public String makeSound() {
        return "Ham-Ham";
    }

    public void fetch() {
        System.out.println(name + "brings a stick");
    }

    @Override
    public void play() {
        System.out.println(name + "playing");
    }
}

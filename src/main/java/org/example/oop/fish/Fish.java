package org.example.oop.fish;

import org.example.oop.animals.Animal;
import org.example.oop.behavior.Swimmable;


public abstract class Fish extends Animal implements Swimmable {
    protected boolean saltwater;

    public Fish(String name, int age, boolean saltwater) {
        super(name, age);
        this.saltwater = saltwater;
    }

    public void breatheWithGills() {
        System.out.println(name + "breathe with gills");
    }

    public void spawn() {
        System.out.println((name + "spawn"));
    }

    public boolean isSaltWater() {
        return saltwater;
    }

    @Override
    public String makeSound() {
        return "";
    }

    public abstract void swim();
}


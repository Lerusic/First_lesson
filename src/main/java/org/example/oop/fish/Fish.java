package org.example.oop.fish;

import org.example.oop.animals.Animals;


public abstract class Fish extends Animals implements Swimmable {
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

    public void swim() {
        System.out.println(name + "swimming");
    }
    @Override
    public String makeSound(){
        return "";
    }
}


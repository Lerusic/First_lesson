package org.example.oop.mammal;

import org.example.oop.animals.Animals;

public abstract class Mammal extends Animals {
    protected boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    public void feedMild() {
        System.out.println(name + "feeding babies with milk");
    }

    public void breatheWithLungs() {
        System.out.println(name + "breathe with lungs");
    }

    public boolean hasFur() {
        return hasFur;
    }

    public interface Swimmable {
        void swim();
    }

    public interface Playable {
        void play();
    }
}

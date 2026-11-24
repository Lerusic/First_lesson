package org.example.oop.bird;

import org.example.oop.animals.Animal;

public abstract class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    public void layEggs() {
        System.out.println(name + "laying eggs");
    }

}

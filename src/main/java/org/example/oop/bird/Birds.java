package org.example.oop.bird;

import org.example.oop.animals.Animals;

import java.sql.SQLOutput;

public abstract class Birds extends Animals {
    public Birds(String name, int age) {
        super(name, age);
    }

    public void layEggs() {
        System.out.println(name + "laying eggs");
    }

    public interface Flyable {
        void fly();
    }

    public interface Swimmable {
        void swim();
    }
}

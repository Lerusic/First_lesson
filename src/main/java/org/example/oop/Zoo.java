package org.example.oop;

import org.example.oop.animals.Animal;
import org.example.oop.behavior.Flyable;


import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> animals = new ArrayList<>();

    public void add(Animal animal) {
        animals.add(animal);
    }

    public void feedAll() {
        for (Animal animal : animals) animal.eat();
    }

    public void concert() {
        for (Animal animal : animals) {
            String sound = animal.makeSound();
            System.out.println(animal.getName() + ":" + (sound.isEmpty() ? "*silent*" : sound));
        }
    }

    public List<Animal> getFlyers() {
        List<Animal> result = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) result.add(animal);
        }
        return result;
    }
}

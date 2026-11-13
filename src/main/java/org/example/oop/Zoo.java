package org.example.oop;

import org.example.oop.animals.Animals;
import org.example.oop.bird.Birds;


import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animals> animals = new ArrayList<>();

    public void add(Animals animal){
        animals.add(animal);
    }
    public void feedAll(){
        for (Animals animal : animals) animal.eat();
    }
    public void concert(){
        for (Animals animal : animals){
           String sound = animal.makeSound();
            System.out.println(animal.getName() + ":" + (sound.isEmpty()? "*silent*": sound));
        }
    }
public List<Animals> getFlyers(){
        List<Animals> result = new ArrayList<>();
        for(Animals animal : animals){
            if (animal instanceof Birds.Flyable) result.add(animal);
        }
        return result;
}
}

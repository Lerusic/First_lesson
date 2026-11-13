package org.example.oop;

import org.example.oop.bird.Parrot;
import org.example.oop.fish.Shark;
import org.example.oop.mammal.Cat;
import org.example.oop.mammal.Dog;
import org.example.oop.reptile.Cobra;

public class Main {
    public static void main (String args[]){
        Zoo zoo = new Zoo();
        zoo.add(new Dog("Knopa",6));
        zoo.add(new Parrot("Ricky",7));
        zoo.add(new Shark("Baby", 167));
        zoo.add(new Cobra("Lera",26));

        zoo.feedAll();
        zoo.concert();
        System.out.println("Flyers: " + zoo.getFlyers().size());

        try{
            new Cat("Max",-10);
        } catch (IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

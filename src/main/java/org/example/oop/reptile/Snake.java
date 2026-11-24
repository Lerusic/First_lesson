package org.example.oop.reptile;

import org.example.oop.behavior.Swimmable;

public class Snake extends Reptile implements Swimmable {
    public Snake(String name, int age, boolean venomous) {
        super(name, age, venomous);
    }

    @Override
    public String makeSound() {
        return "Ssss";
    }

    public void crawl() {
        System.out.println(name + "crawling");
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }
}

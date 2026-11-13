package org.example.oop.mammal;

public class Dolphin extends Mammal implements Mammal.Swimmable {
    public Dolphin(String name, int age) {
        super(name, age, false);
    }

    @Override
    public String makeSound() {
        return "Blew-blew";
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }
}

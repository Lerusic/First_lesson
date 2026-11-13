package org.example.oop.bird;

public class Duck extends Birds implements Birds.Flyable, Birds.Swimmable {
    public Duck(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Mac-mac";
    }

    @Override
    public void fly() {
        System.out.println(name + "flying");
    }

    @Override
    public void swim() {
        System.out.println(name + "swimming");
    }
}




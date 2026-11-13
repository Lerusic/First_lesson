package org.example.oop.animals;

public abstract class Animals {
    protected final String name;
    protected int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String makeSound();

    public void eat() {
        System.out.println(name + " eating");
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }
}


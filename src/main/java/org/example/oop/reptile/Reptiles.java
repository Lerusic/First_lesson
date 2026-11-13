package org.example.oop.reptile;

import org.example.oop.animals.Animals;

public abstract class Reptiles extends Animals {
    protected boolean venomous;
    public Reptiles (String name, int age, boolean venomous){
        super (name, age);
        this.venomous = venomous;
    }
    public void layEggs(){
        System.out.println(name + "laying eggs");
    }
    public void baskInSun(){
        System.out.println(name + "basking in sun");
    }
    public void shedSkin(){
        System.out.println(name+ "shedding skin");
    }
    public boolean isVenomous(){
        return venomous;
    }
    public interface Swimmable{
        void swim();
    }
}

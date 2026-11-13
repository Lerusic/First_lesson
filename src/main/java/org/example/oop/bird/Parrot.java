package org.example.oop.bird;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Parrot extends Birds implements Birds.Flyable {
    private final List<String> words = new ArrayList<>();
    public final Random random = new Random();

    public Parrot(String name, int age){
        super(name, age);
    }
    public void learnWord(String word){
        words.add(word);
        System.out.println(name +"learned word: " + word);
    }

    @Override
    public void fly(){
        System.out.println(name + "flying");
    }
    @Override
    public String makeSound(){
        if (words.isEmpty()){
            return "Chick-chirick";
        }
        return words.get(random.nextInt(words.size()));
    }

}

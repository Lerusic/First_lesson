package org.example.oop.fish;

import java.sql.SQLOutput;

public class Shark extends Fish {
    public Shark(String name, int age) {
        super(name, age, true);
    }

    public void hunt() {
        System.out.println(name + "hunting");
    }

}

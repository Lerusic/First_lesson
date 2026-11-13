package org.example.oop.fish;

import org.example.oop.mammal.Mammal;
import org.w3c.dom.ls.LSOutput;

public class SeaStar extends Fish {
    public SeaStar(String name, int age) {
        super(name, age, true);
    }

    public void glued() {
        System.out.println(name + "glued on");
    }

}

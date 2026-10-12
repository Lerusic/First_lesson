package org.example.first_lesson;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Expected true.Result:" + (EvenOdd(2) == "Even"));
        System.out.println("Expected true.Result:" + (EvenOdd(7) == "Odd"));
        System.out.println("Expected true.Result:" + (EvenOdd(0) == "Even"));
        System.out.println("Expected true.Result:" + (EvenOdd(-4) == "Even"));
        System.out.println("Expected true.Result:" + (EvenOdd(-3) == "Odd"));
        System.out.println("Expected true.Result:" + (EvenOdd(-1) == "Odd"));
        System.out.println("Expected true.Result:" + (EvenOdd(2147483647) == "Odd"));
        System.out.println("Expected true.Result:" + (EvenOdd(-2147483648) == "Even"));
        System.out.println("Expected true.Result:" + (EvenOdd(4.0) == "Even"));
    }
    public static String EvenOdd(double number)
    {
        double even = number % 2;
        if (even == 0) {
            return "Even";
        }
        else {
            return "Odd";
        }
    }

}


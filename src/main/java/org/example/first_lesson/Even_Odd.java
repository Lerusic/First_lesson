package org.example.first_lesson;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Expected true.Result:" + (evenOdd(2) == "Even"));
        System.out.println("Expected true.Result:" + (evenOdd(7) == "Odd"));
        System.out.println("Expected true.Result:" + (evenOdd(0) == "Even"));
        System.out.println("Expected true.Result:" + (evenOdd(-4) == "Even"));
        System.out.println("Expected true.Result:" + (evenOdd(-3) == "Odd"));
        System.out.println("Expected true.Result:" + (evenOdd(-1) == "Odd"));
        System.out.println("Expected true.Result:" + (evenOdd(2147483647) == "Odd"));
        System.out.println("Expected true.Result:" + (evenOdd(-2147483648) == "Even"));
        System.out.println("Expected true.Result:" + (evenOdd(4.0) == "Even"));
    }
    public static String evenOdd(double number)
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


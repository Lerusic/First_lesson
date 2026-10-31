package org.example.hw1;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        System.out.println("Expected true.Result:" + (calculator(2, 3, "+") == 5.0));
        System.out.println("Expected true.Result:" + (calculator(5, 10, "-") == -5.0));
        System.out.println("Expected true.Result:" + (calculator(4, 2.5, "*") == 10.0));
        System.out.println("Expected true.Result:" + (calculator(7, 2, "/") == 3.5));
        System.out.println("Expected true.Result:" + (calculator(0, -5, "*") == 0.0));
        System.out.println("Expected true.Result:" + (calculator(0.1, 0.2, "+") == 0.3));

    }

    public static double calculator(double first, double second, String symbol) {
        if (symbol.equals("+")) {
            return first + second;
        }
        if (symbol.equals("-")) {
            return first - second;
        }
        if (symbol.equals("*")) {
            double result = first * second;
            return result;
        }
        if (symbol.equals("/")) {
            if (second == 0) {
                return 0;
            } else {
                return first / second;
            }
        }
        return 0;
    }
}

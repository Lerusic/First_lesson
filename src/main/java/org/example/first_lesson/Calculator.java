package org.example.first_lesson;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = scanner.nextInt();
        System.out.println("Enter Second Number");
        int second = scanner.nextInt();
        System.out.println("Enter symbol");
        String symbol = scanner.next();
        System.out.println(symbol);
        if (symbol.equals("+")) {
            int result = first + second;
            System.out.println(result);
        }
        if (symbol.equals("-")) {
            int result = first - second;
            System.out.println(result);
        }
        if (symbol.equals("*")) {
            int result = first * second;
            System.out.println(result);
        }
        if (symbol.equals("/")) {
            int result = first / second;
            System.out.println(result);

        }
    }
}
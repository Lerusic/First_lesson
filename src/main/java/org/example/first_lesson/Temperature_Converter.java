package org.example.first_lesson;

import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius");
        int celsius =scanner.nextInt();
        double converter = celsius* 1.8+ 32;
        System.out.println("Your temperature in Fahrenheit is " + converter);
    }
}
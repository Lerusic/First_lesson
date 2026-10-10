package org.example.first_lesson;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int even = number % 2;
        if (even == 0) {
            System.out.println("Your number is even");
        }
        else {
            System.out.println("Your number is odd");
        }
    }


}


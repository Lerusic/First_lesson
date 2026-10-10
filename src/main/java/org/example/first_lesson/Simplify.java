
package org.example.first_lesson;

import java.util.Scanner;

public class Simplify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = scanner.nextInt();
        System.out.println("Enter Second Number");
        int second = scanner.nextInt();
        System.out.println("Enter Third Number");
        int third = scanner.nextInt();
        if (first > second && first > third) {
            System.out.println(first);
        }
        if (second > third) {
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }
}




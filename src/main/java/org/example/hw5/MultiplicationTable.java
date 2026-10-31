package org.example.hw5;

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println(tableLine(7, 1));
        System.out.println(tableLine(7, 10));
        System.out.println(tableLine(1, 10));
        System.out.println(tableLine(0, 5));
        System.out.println(tableLine(7, 2));
        System.out.println(tableLine(12, 10));
        System.out.println(tableLine(214748365, 10));
        System.out.println(tableLine(-3, 2));
        printTable(7);
        printTable(-3);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            printTable(n);
        } else {
            System.out.println("This is not a number: " + scanner.next());
        }
    }
    public static String tableLine(int n, int i) {
        long r = (long) n * i;
        String result = n + " x " + i + " = " + r;
        return result;
    }
    public static void printTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(tableLine(n, i));
        }
    }
}
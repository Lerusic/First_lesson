package org.example.hw1;

import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount");
        double amount = scanner.nextInt();
        System.out.println("Enter percentage");
        double percentage = scanner.nextInt();
        System.out.println("Enter period in years");
        double period = scanner.nextInt();
        double final_summ = amount*(1+percentage/100 * period);
        System.out.println("Your final summ is "+ final_summ);

    }
}

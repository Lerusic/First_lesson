package org.example.first_lesson;

public class SimpleInterest {
    public static void main(String[] args) {
        System.out.println("Expected true.Result:" + (simpleInterest(1000, 5, 1) == 50.0));
        System.out.println("Expected true.Result:" + (simpleInterest(1050, 5, 1) == 52.5));
        System.out.println("Expected true.Result:" + (simpleInterest(1000, 3.5, 2) == 70.0));
        System.out.println("Expected true.Result:" + (simpleInterest(1000, 5, 1.5) == 75.0));
        System.out.println("Expected true.Result:" + (simpleInterest(999.99, 5, 1) == 50.00));// как округлить
        System.out.println("Expected true.Result:" + (simpleInterest(10000000, 10, 30) == 30000000.00));
        System.out.println("Expected true.Result:" + (simpleInterest(1000, 0, 5) == 0.0));
        System.out.println("Expected true.Result:" + (simpleInterest(1000, 5, 0) == 0.0));
        System.out.println("Expected true.Result:" + (simpleInterest(1000, -5, 1)));
        System.out.println("Expected true.Result:" + (simpleInterest(-1000, 5, 1)));// как выявить отрицательные цифры
        System.out.println("Expected true.Result:" + (simpleInterest(1000, 0.05, 1)));
    }

    public static double simpleInterest(double amount, double percentage, double period) {
        return Math.ceil(amount * (percentage / 100 * period));
    }
}

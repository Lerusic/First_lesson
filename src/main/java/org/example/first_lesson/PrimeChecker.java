package org.example.first_lesson;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(17));
        System.out.println(isPrime(97));
        System.out.println(isPrime(1));
        System.out.println(isPrime(0));
        System.out.println(isPrime(-7));
        System.out.println(isPrime(9));
        System.out.println(isPrime(25));
        System.out.println(isPrime(49));
        System.out.println(isPrime(91));
        System.out.println(isPrime(-2));
        System.out.println(isPrime(2147483647));
        System.out.println(isPrime(2147483646));
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
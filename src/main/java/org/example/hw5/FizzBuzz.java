package org.example.hw5;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Your number is: " + fizzBuzz(1));
        System.out.println("Your number is: " + fizzBuzz(3));
        System.out.println("Your number is: " + fizzBuzz(5));
        System.out.println("Your number is: " + fizzBuzz(15));
        System.out.println("Your number is: " + fizzBuzz(30));
        System.out.println("Your number is: " + fizzBuzz(98));
        System.out.println("Your number is: " + fizzBuzz(2));
        System.out.println("Your number is: " + fizzBuzz(9));
        System.out.println("Your number is: " + fizzBuzz(25));
        System.out.println("Your number is: " + fizzBuzz(45));
        System.out.println("Your number is: " + fizzBuzz(13));
        System.out.println("Your number is: " + fizzBuzz(100));
        System.out.println("Your number is: " + fizzBuzz(0));
        System.out.println("Your number is: " + fizzBuzz(-15));

       System.out.println("Now is results for for:");
        for (int i = 1; i < 101; i++) {
           System.out.println(fizzBuzz(i));
        }

        System.out.println("Now is results for while:");
        int i=1;
        while (i<101){
            System.out.println(fizzBuzz(i));
            i++;
        }

        System.out.println("Now is result for do while");
        int j=1;
        do {
            System.out.println(fizzBuzz(j));
            j++;
        }
        while (j<101);
    }

    public static String fizzBuzz(int n) {
        int f = n % 3;
        int b = n % 5;
        if (f == 0 && b == 0)
            return "FizzBuzz";
        if (f == 0) {
            return "Fizz";
        }
        if (b == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }
}

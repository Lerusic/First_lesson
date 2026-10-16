
package org.example.first_lesson;

import java.util.Scanner;

public class Simplify {
    public static void main(String[] args) {
        System.out.println("Expected true.Result:" + (biggerNumber(1, 2, 3) == 3));
        System.out.println("Expected true.Result:" + (biggerNumber(2, 3, 1) == 3));
        System.out.println("Expected true.Result:" + (biggerNumber(3, 1,2) == 3));
        System.out.println("Expected true.Result:" + (biggerNumber(3, 2, 1) == 3));
        System.out.println("Expected true.Result:" + (biggerNumber(5, 5, 5) == 5));
        System.out.println("Expected true.Result:" + (biggerNumber(5, 1, 5) == 5));
        System.out.println("Expected true.Result:" + (biggerNumber(5, 5, 1) == 5));
        System.out.println("Expected true.Result:" + (biggerNumber(-1, -2, -3) == -1));
        System.out.println("Expected true.Result:" + (biggerNumber(2147483647, 0, -1) == 2147483647));
    }

    public static int biggerNumber(int first, int second, int third) {
        if (first >= second && first >= third) {
            return first;
        }
        if (second >= third) {
            return second;
        } else {
            return third;
        }
    }


}




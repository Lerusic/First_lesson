package org.example.first_lesson;

public class FifthLesson {
    public static void main(String[] args) {
        System.out.println("For age " + 12 + " your are a-" + category(12));

    }

    public static String category(int age) {
        if (age < 0) {
            return "Invalid Age";
        }
        if (age < 13) {
            return "Child";
        }
        if (age < 18) {
            return "Teen";
        }

        if (age < 65) {
            return "Adult";
        } else return "Senior";
    }
}


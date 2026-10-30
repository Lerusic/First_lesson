package org.example.hw5;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println(grade(100));
        System.out.println(grade(90));
        System.out.println(grade(89));
        System.out.println(grade(60));
        System.out.println(grade(59));
        System.out.println(grade(0));
        System.out.println(grade(-1));
        System.out.println(grade(101));
        System.out.println(grade(80));
        System.out.println(grade(79));
        System.out.println(grade(70));
        System.out.println(grade(69));
        System.out.println(grade(95));
        System.out.println(grade(85));
        System.out.println(grade(75));
        System.out.println(grade(65));
        System.out.println(grade(30));
        System.out.println(grade(150));
        System.out.println(grade(Integer.MAX_VALUE));
        System.out.println(grade(Integer.MIN_VALUE));

    }

    public static String grade(int score) {
        if (score > 89 && score < 101) {
            return "A";
        }
        if (score > 79 && score < 90) {
            return "B";
        }
        if (score > 69 && score < 80) {
            return "C";
        }
        if (score > 59 && score < 70) {
            return "D";
        }
        if (score > -1 && score < 60) {
            return "F";
        } else {
            return "Invalid";
        }
    }

}

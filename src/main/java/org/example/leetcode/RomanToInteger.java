package org.example.leetcode;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("IVIX"));
    }

    public static int romanToInt(String s) {
        String[] symbols = s.split("");

        int summ = 0;

        for (int i = 0; i < s.length(); i++) {
            String element = symbols[i];

            int lastElementIndex = symbols.length - 1;
            String nextElement = i == lastElementIndex ? symbols[i] : symbols[i + 1];

            if (element.equals("I") && nextElement.equals("X")) {
                summ = summ + 9;
                i += 1;
                continue;
            }
            if (element.equals("I") && nextElement.equals("V")) {
                summ = summ + 4;
                i += 1;
                continue;
            }
            if (element.equals("I")) {
                summ = summ + 1;

            }
            if (element.equals("V")) {
                summ = summ + 5;
            }
            if (element.equals("X") && nextElement.equals("C")) {
                summ = summ + 90;
                i += 1;
                continue;
            }
            if (element.equals("X") && nextElement.equals("L")) {
                summ = summ + 40;
                i += 1;
                continue;
            }
            if (element.equals("X")) {
                summ = summ + 10;
            }
            if (element.equals("L")) {
                summ = summ + 50;

            }
            if (element.equals("C") && nextElement.equals("M")) {
                summ = summ + 900;
                i += 1;
                continue;
            }
            if (element.equals("C") && nextElement.equals("D")) {
                summ = summ + 400;
                i += 1;
                continue;
            }
            if (element.equals("C")) {
                summ = summ + 100;

            }
            if (element.equals("D")) {
                summ = summ + 500;

            }
            if (element.equals("M")) {
                summ = summ + 1000;

            }

        }
        return summ;
    }


}

package org.example.hw9;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.*;

public class BracketValidator {
    public static void main(String[] args) {
        System.out.println(isValid("([]{})"));
        System.out.println(isValid("(a+b)*[c]"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("("));
        System.out.println(isValid(")"));
    }

    public static boolean isValid(String s) {
        Deque<Character> sign = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            System.out.println(c);
            if (c == '(' || c == '[' || c == '{') {
                sign.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (sign.isEmpty()) {
                    return false;
                }
                char last = sign.pop();
                if ((c == ')' && last != '(')
                        || (c == ']' && last != '[')
                        || (c == '}' && last != '{')) {
                    return false;
                }
            }
        }
        return sign.isEmpty();
    }
}
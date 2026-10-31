package org.example.hw8;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("Anna"));
        System.out.println(isPalindrome("Natan"));
        System.out.println(isPalindrome("A man a plan a canal Panama"));
        System.out.println(isPalindrome("Java"));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome(""));
    }

        public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String[] words = s.split("");
        int j=0;
        String[] cWords = words.clone();
        for (int i = words.length - 1; i >= 0; i--) {
            words[j] = cWords[i];
            j++;;
        }
        String results = String.join("", words);
        return results.equals(s);
    }
}





package org.example.leetcode;

public class Palindrome {
    class Solution {
        public boolean isPalindrome(int x) {
            char [] s = String.valueOf(x).toCharArray();
            int i = 0;
            int j = s.length -1;
            while (i<j){
                if (s[i] != s[j]) return false;
                i++;
                j--;
            }
            return true;
        }

    }
}

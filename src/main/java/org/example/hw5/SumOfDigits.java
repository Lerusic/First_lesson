package org.example.hw5;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(8765));
        System.out.println(sumOfDigits(123));
        System.out.println(sumOfDigits(7));
        System.out.println(sumOfDigits(0));
        System.out.println(sumOfDigits(1000));
        System.out.println(sumOfDigits(999));
        System.out.println(sumOfDigits(-123));
        System.out.println(sumOfDigits(10));
        System.out.println(sumOfDigits(505));
        System.out.println(sumOfDigits(99));
        System.out.println(sumOfDigits(-5));
        System.out.println(sumOfDigits(2147483647));
        System.out.println(sumOfDigits(-2147483648));
    }

    public static int sumOfDigits(int n) {
//    for(int n=0;n>0;){
//        int digit=n%10;
//        System.out.println(digit);
//        n=n/10;
//    }
        long m= n;
        long summ = 0;
        if (m < 0){
            m=Math.abs(m);
        }
//        while (m > 0) {
//            long digit = m % 10;//digit=5/6/7/8
//            m = m / 10;//n=876,87,8,0
//            summ = summ + digit;//summ=5+6+7+8
//        }
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            summ+=Character.getNumericValue(s.charAt(i));
        }
        int summ2=(int)summ;
        return summ2;

    }
}

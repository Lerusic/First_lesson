package org.example.hw8;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        sort(new int[]{1, 2, 3, 4, 5});
        sort(new int[]{3, 3, 1});
        sort(new int[]{-2, 0, -5});
        sort(new int[]{1, 2, 3});
        sort(new int[]{7});
        sort(new int[]{});
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                System.out.println("Start j" + j);
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}

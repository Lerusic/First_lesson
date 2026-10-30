package org.example.hw8;

public class BinaryResearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9}, 1));
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9}, 9));
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9}, 4));
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9}, 0));
        System.out.println(binarySearch(new int[]{1, 3, 5, 7, 9}, 10));
        System.out.println(binarySearch(new int[]{5}, 5));
        System.out.println(binarySearch(new int[]{}, 5));
    }

    public static int binarySearch(int[] a, int target) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (a[middle] == target) {
                return a[middle];
            } else if (a[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}

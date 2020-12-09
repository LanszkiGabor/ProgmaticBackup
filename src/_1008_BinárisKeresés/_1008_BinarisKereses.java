package _1008_BinárisKeresés;

import java.util.Arrays;

public class _1008_BinarisKereses {

    public static int array[] = {8, 5, 0, 20, 1, 3, -1, 5, 2};

    public static int array2[] = {3, 3, 9, 10, 15, 20, 20, 111, 112, 115, 300, 350};

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 7, 9, 10, 11};
        int[] arr2 = {2, 3, 4, 5, 7, 9, 10, 11, 12};
        test(-1, arr1, 0);
        test(-1, arr1, 100);
        test(-1, arr1, 6);
        test(0, arr1, 2);
        test(5, arr1, 9);
        test(7, arr1, 11);

        test(-1, arr2, 0);
        test(-1, arr2, 100);
        test(-1, arr2, 6);
        test(0, arr2, 2);
        test(5, arr2, 9);
        test(7, arr2, 11);
        test(8, arr2, 12);

        System.out.println(findTheValue(arr2, 12));
    }

    public static int binarySearch(int[] arr, int value){
        return findTheValue(arr, value);
    }

    public static void test(int expected, int[] arr, int value){
        int actual = binarySearch(arr, value);
        if(actual != expected){
            System.out.println("HIBA!!! Az alábbi tömbben");
            System.out.println(Arrays.toString(arr));
            System.out.println("kerestük a " + value + " értéket");
            System.out.println("Az elvárt eredmény: " + expected + " a tényleges: " + actual);
            System.out.println();
        }
        else{
            System.out.println("OK");
        }
    }

    public static int findIndexOf(int[] nums, int value) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findTheValue(int[] nums, int value) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            if (nums[middleIndex] < value) {
                startIndex = middleIndex + 1;
            } else if (nums[middleIndex] > value) {
                endIndex = middleIndex - 1;
            } else if (nums[middleIndex] == value) {
                return middleIndex;
            }
        }
        return -1;
    }



}

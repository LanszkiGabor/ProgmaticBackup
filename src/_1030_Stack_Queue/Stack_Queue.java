package _1030_Stack_Queue;

import java.util.Arrays;
import java.util.Stack;

public class Stack_Queue {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseTheArray(new int[]{1, 2, 3, 4})));
    }

    /* Írj metódust, ami megfordít egy számokat tartalmazó tömböt egy verem segítségével!
    Nem kell, hogy a megoldásod hatékony legyen! */

    public static int[] reverseTheArray (int[] arr){
        Stack<Integer> stack = new Stack<>();
        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            stack.add(arr[i]);
        }
        int[] reversedArray = new int[size];
        for (int i = 0; i < size; i++) {
            reversedArray[i] = stack.pop();
        }
        return reversedArray;
    }

    /* Írj sor adatszerkezetet, ami úgy működik, hogy a belsejében két verem van.
    Nem kell, hogy a megoldsáod hatékony legyen. */






}

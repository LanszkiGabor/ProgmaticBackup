package _0928_1006_Metódusok_Tömbök;

import java.util.Arrays;

public class _0930_TömbökOrai {
    public static void main(String[] args) {

        /*
        int a = 2;
        int b = 5;

        int c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);
        */

        /* int[] numbers = new int [10];
        numbers [0] = 1;
        numbers [1] = 3;

        int c = numbers[0];
        numbers[0] = numbers[1];
        numbers[1] = c; */


        // int[] otherNumbers = new int [20];
        // numbers[0] = numbers [0];

        /* int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = 2 * i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sumArray(numbers)); */

        /* int[] temperature = {16, 18, 17, 14, 15, 20, 21};
        float avg = (float) sumArray(temperature) / temperature.length;
        System.out.println(avg); */


    }

    public static int sumArray(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }




}

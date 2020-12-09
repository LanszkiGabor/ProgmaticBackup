package _0928_1006_Metódusok_Tömbök;

import java.util.Arrays;

public class _1002_TombokOrai { private static final String[] CITIES =
        {"Budapest", "Békéscsaba", "Debrecen", "Eger"};
    private static final int[][] DISTANCES =
            {       //            Bp      Bcsab   Debr    Eger
                    /*Bp*/        {0,     216,    231,    158},
                    /*Békéscsaba*/{216,    0,     137,    200},
                    /*Debrecen*/  {231,    137,   0,      136},
                    /*Eger*/      {158,    200,   136,    0},
            };

    public static void main(String[] args) {
        //Töltsük fel a tömb elemait random számokkal

        int[][] matrix = new int[5][5];
        for (int index1 = 0; index1 < matrix.length; index1++) {
            for (int index2 = 0; index2 < matrix[index1].length; index2++) {
                matrix[index1][index2] = (int) (Math.random() * 100);
            }
        }
        for (int index1 = 0; index1 < matrix.length; index1++) {
            for (int index2 = 0; index2 < matrix[index1].length; index2++) {
                System.out.print(matrix[index1][index2] + " ");
            }
            System.out.println();
        }
       /* System.out.println();
        System.out.println("A legnagyobb érték");
        System.out.println(findMaxValue(matrix)); */
        findTheValueInTheDiagonal(matrix);

    }

    //Keressük meg a matrix legnagyobb elemét!
    //Írjuk ki az értéket is meg az indexet is.

    public static int findMaxValue(int[][] nums) {
        int max = nums[0][0];
        for (int index1 = 0; index1 < nums.length; index1++) {
            for (int index2 = 0; index2 < nums[index1].length; index2++) {
                if (nums[index1][index2] > max) {
                    max = nums[index1][index2];
                }
            }
        }
        return max;
    }
    public static void findTheValueInTheDiagonal (int[][] nums){
        for (int index1 = 0; index1 < nums.length; index1++) {
            for (int index2 = 0; index2 < nums.length; index2++) {
                if(index1 == index2){
                    System.out.println(nums[index1][index2]);
                }
            }
        }
    }
}



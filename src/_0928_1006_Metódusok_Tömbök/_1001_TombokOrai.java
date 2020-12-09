package _0928_1006_Metódusok_Tömbök;

import java.util.Arrays;

public class _1001_TombokOrai {
    public static void main(String[] args) {

        int[] numbers = {5, 1, 2, 8, 3, 0, 4, -3, 7, 6, 98};

       // sortElementsOfArray(numbers);

        System.out.println(minIndexOfArrayPart(numbers, 8));

    }

    /*Írj metódust ami kiÍrja egy tömb elemeit az indexeivel együtt. Pl. ha a metódus bemenete a
    {3, 5, 1, 9} tömb akkor valami ilyesmit írjon ki:

    0.: 3
    1.: 5
    2.: 1
    3.: 9 */

    // Maxikum kereses

    public static int findMaxValue(int[] nums) {
        int max = nums[0];
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] > max) {
                max = nums[index];
            }
        }
        return max;
    }

    public static void printArray(int[] nums) {
        for (int index = 0; index < nums.length; index++) {
            System.out.println(index + ".:" + nums[index]);
        }
    }

    public static int findMinValue(int[] nums) {
        int min = nums[0];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] < min) {
                min = nums[index];
            }
        }
        return min;
    }

    /**
     * Finds the minimum of nums which is
     * greater then nr
     *
     * @param nums the array in which we search for a minimum
     * @param nr   the returned value must be greater than this num
     * @return the minimum values of those values
     * that are greater than nr
     */
    public static int minOfArrayGreaterThan(int[] nums, int nr) {
        int min = Integer.MAX_VALUE;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] > nr && nums[index] < min) {
                min = nums[index];
            }
        }
        return min;
    }

    public static int[] orderArrayBySelectionSort1(int[] nums) {
        int[] orderedNumbers = new int[nums.length];
        orderedNumbers[0] = findMinValue(nums);
        for (int index = 1; index < nums.length; index++) {
            orderedNumbers[index] = minOfArrayGreaterThan(nums, orderedNumbers[index - 1]);
        }
        return orderedNumbers;
    }


    public static int minIndexOfArrayPart(int[] nums1, int from) {
        int min = nums1[from];
        int minindex = from;
        for (int index = from; index < nums1.length; index++) {
            if (nums1[index] < min) {
                min = nums1[index];
                minindex = index;
            }
        }
        return minindex;
    }

    public static void sortElementsOfArray(int[] nums2){
        int minindex = 0;
        int temporary = 0;
        for (int index = 0; index < nums2.length; index++) {
            minindex = minIndexOfArrayPart(nums2, index);
            temporary = nums2[index];
            nums2[index] = nums2[minindex];
            nums2[minindex] = temporary;
        }
        System.out.println(Arrays.toString(nums2));
    }
}





package _0928_1006_Metódusok_Tömbök;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _0930_TombokOraiFeladatok {
    public static void main(String[] args) {

        /* Hozz létre egy 100 elemű tömböt, és a következő feladatok megoldása során ezt használd!
            (A tömbök elemeit 0-1000-ig véletlen számokkal töltsd fel!) */

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 1000);
        }
        printArray2(numbers);
        System.out.println("A tömb utolsó eleme:");
        System.out.println(lastNumber(numbers));
        printArray(numbers);

        // Írj egy metódust amely meghatározza, hogy mennyi a tömbben szereplő páros számok összege!


    }

    public static int sumOfPairs(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }
        return sum;
    }

    // Írj egy metódust amely meghatározza, hogy mennyi a tömbben szereplő páros számok átlaga!

    public static int avgOfPairs(int[] nums) {
        int counter = 0;
        int sum = sumOfPairs(nums);
        for (int index = 0; index < 100; index++) {
            if (nums[index] % 2 == 0) {
                counter++;
            }

        }
        return sum / counter;
    }

    // Írj egy metódust amely meghatározza, hogy hányszor fordul elő olyan a tömbben,
    // hogy egy páratlan számot egy páros követ!

    public static int evenAfterOdd(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 0) {
                counter++;
            }
        }
        return counter;

    }

    // Írj egy metódust, amely meghatározza, hogy mennyi a tömbben szereplő legnagyobb érték!

    public static int findMaxValue(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                max = nums[i];
            }
        }
        return max;
    }

    // Prímszám

    public static boolean isPrime(int nr) {
        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Írj egy metódust, amely meghatározza, hogy melyik a tömbben szereplő első prímszám!

    public static int findTheFirstPrime(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                return nums[i];
            }
        }
        return 0;
    }

    // Írj egy metódust, amely meghatározza, hogy hány prímszám található a tömbben!

    public static int countThePrimes(int[] nums) {
        int counter = 0;
        for (int i = 10; i < nums.length; i++) {
            if (isPrime(nums[i])) {
                counter++;
            }
        }
        return counter;
    }

    // Írj egy printArray() metódust, amely kiírja a kapott tömb elemeit egymás alá a konzolra!

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // Írd át fent írt printArray() metódust úgy, hogy a számokat fordított sorrendbe írja ki!
    // (Tehát az első kiírt szám a tömb utolsó legyen, stb.) Rendezni a tömböt nem kell.

    public static void printArray2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    // Tömb utolsó száma
    public static int lastNumber (int[] nums){
       return nums[nums.length - 1];

    }



}







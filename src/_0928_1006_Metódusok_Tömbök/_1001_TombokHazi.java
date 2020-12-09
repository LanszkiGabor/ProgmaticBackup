package _0928_1006_Metódusok_Tömbök;

import java.util.Arrays;
import java.util.Random;

public class _1001_TombokHazi {
    public static void main(String[] args) {

        System.out.println(firstTenPrime());

        // Deklarálj egy 10 hosszú tömböt, majd
        // töltsd ki az első 10 természetes számmal;
        int[] numbers = new int[10];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index;
        }


       // Az előző, prímeket tartalmazó tömbön végigiterálva írd ki az elemeket!
        for (int i = 0; i < firstTenPrime().length; i++) {
         //    System.out.println(firstTenPrime()[i]);
        }


       // Az előző, prímeket tartalmazó tömbön végigiterálva írd ki az elemek tízszeresét!
        for (int i = 0; i < firstTenPrime().length; i++) {
          //  System.out.println(firstTenPrime()[i] * 10);
        }


        //Az előző, prímeket tartalmazó tömbön végigiterálva írd ki az
        // egymást követő prímszámok különbségét!
        // Pl.: Az első három prímszám: 2, 3, 5. A köztük lévő különbségek: 1, 2.
        // Mivel 3 - 2 = 1 és 5 - 3 = 2.
        for (int i = 0; i < firstTenPrime().length - 1; i++) {
           // System.out.println(firstTenPrime()[i + 1] - firstTenPrime()[i]);
        }


        // System.out.println(Arrays.toString(firstTenPrime()));

        // Írd ki az első 10 számot random a törzsbe

         int[] numbers2 = new int[10];
        for (int index = 0; index < numbers2.length; index++) {
            numbers2[index] = (int) (Math.random() * 10);
        }

        //System.out.println(Arrays.toString(numbers2));

       /* int[] tenPrime = firstnPrime(50);
        System.out.println(Arrays.toString(tenPrime)); */

      //  Deklarálj egy újabb tömböt, és töltsd fel az első 10 egymást követő prímszám
       // különbségével!

    int[] numbers3 =  new int[10];
        for (int index = 0; index < numbers3.length - 1; index++) {
            numbers3[index] = firstTenPrime()[index + 1] - firstTenPrime()[index];
        }

        // System.out.println(Arrays.toString(numbers3));

       // Írd ki az első 10 prímszámot visszafelé (a legnagyobbtól a legkisebb felé haladva)!
               // A kiiratáshoz használd a fenti tömböt!

        int[] nums = firstTenPrime();
        for (int index = nums.length - 1; index >= 0; index--) {
      //     System.out.println(firstTenPrime()[index]);
        }





// Írj metódust, ami visszafelé kiírja egy tömb elemeit!

        int[] numbers4 = {2,5,6,5,9,12,45,46,76,48,89};
        writeBack(numbers4);

    }




    public static void writeBack (int[] nums){
        for (int i = nums.length - 1 ; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }

    // Első 10 Prímszámmal töltsük fel

    public static int[] firstTenPrime(){
        int primeCounter = 0;
        int [] result = new int[10];
        int nrToCheck = 2;
        while(primeCounter < 10){
            if(isPrime(nrToCheck)){
                result[primeCounter] = nrToCheck;
                primeCounter++;
            }
            nrToCheck++;
        }
        return result;
    }



    // Első n prím

    public static int[] firstnPrime(int n){
        int primeCounter = 0;
        int [] result = new int[n];
        int nrToCheck = 2;
        while(primeCounter < n){
            if(isPrime(nrToCheck)){
                result[primeCounter] = nrToCheck;
                primeCounter++;
            }
            nrToCheck++;
        }
        return result;
    }



   //




    // isPrime metódus

    public static boolean isPrime(int nr) {
        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }



}



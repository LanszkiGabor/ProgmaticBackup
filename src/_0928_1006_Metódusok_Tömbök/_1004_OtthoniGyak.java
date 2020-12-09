package _0928_1006_Metódusok_Tömbök;

import java.util.Arrays;

public class _1004_OtthoniGyak {
    public static void main(String[] args) {

       differenceOfPrimes();

    }
    // Deklarálj egy 10 hosszú tömböt, majd töltsd fel az elemeit az első 10 prím számmal
    // (használd az előző feladatok isPrime metódusát)!


    public static int[] first10Prime(){
        int primecounter = 0;
        int nrToCheck = 2;
        int[] result = new int[10];
        while (primecounter < 10) {
            if (isPrime(nrToCheck)) {
                result[primecounter] = nrToCheck;
                primecounter++;
            }
            nrToCheck++;
        }
        return result;
    }

    // Az előző, prímeket tartalmazó tömbön végigiterálva írd ki az elemeket!

        public static void tenPrimes(){
            for (int i = 0; i < first10Prime().length; i++) {
                System.out.println(first10Prime()[i]);
            }
    }



  //  Az előző, prímeket tartalmazó tömbön végigiterálva írd ki az elemek tízszeresét!

     public static void tenPrimesMulTen(){
         for (int i = 0; i < first10Prime().length; i++) {
             System.out.println(first10Prime()[i] *10);
         }
     }

   // Az előző, prímeket tartalmazó tömbön végigiterálva írd ki az egymást követő prímszámok különbségét!
    // Pl.: Az első három prímszám: 2, 3, 5. A köztük lévő különbségek: 1, 2. Mivel 3 - 2 = 1 és 5 - 3 = 2.

    public static void differenceOfPrimes (){
        for (int i = 0; i < first10Prime().length - 1; i++) {
            System.out.println(first10Prime()[i + 1] - first10Prime()[i]);
        }
    }



    public static boolean isPrime(int num) {
        for (int i = 0; i < Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

}




package _0921_0927_Elágazás_Ciklus;

public class Metodusok {
    public static void main(String[] args) {
        //System.out.println(countMinOrMax(-10,20,true));
        // System.out.println(sumOfPairNumbers(2));
        //System.out.println(sumOfNumbers(10));
        //System.out.println(sumOfFirstNPrime(10));
    }

     /* public static int smaller(int nr1, int nr2) {
        if (nr1 < nr2) {
            return nr1;
        }
        return nr2;
    }

    public static boolean isPrime(int nr) {
        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static long sumOfFirstNPrime(int n) {
        int counter = 0;
        int actualNumber = 2;
        int sum = 0;
        while (counter < n) {
            boolean a = isPrime(actualNumber);
            if (a == true) {
                counter++;
                sum = sum + actualNumber;
            }
            actualNumber++;
        }
        return sum;

    }

    /* Összegezzük az 1. n természetes számot */
    public static int sumOfNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    /* Összegezzük az 1. n természetes páros számot */

    public static int sumOfPairNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        } return sum;
    }

    //Írj metódust, ami kiszámolja két egész szám minimumát!

    public static int countMin (int nr1, int nr2){
        if (nr1 < nr2){
            return nr1;
        }
        return nr2;
    }
    //Írj metódust, aminek három bemenete van: két szám és egy boolean változó,
    // ha a bool változó igaz,
    // akkor a metódus minimumot, ha hamis akkor maximumot számol!

    public static int countMinOrMax (int nr1, int nr2, boolean a){
        int x = 0;
        if (a == true){
            if (nr1 < nr2){
                x = x + nr1;
            } else{
                x = x + nr2;
            }
        }
        if (a == false){
            if(nr1 > nr2){
               x = x + nr1;
            } else {
                x = x + nr2;
            }
        } return x;
    }
    // Mennyi a 100.000-nél kisebb prímek összege? (454396538)

    /* public static int sumOfPrimesUnder100000 (int nr){
        for(int i = 2; i <=Math.sqrt(nr); i++){
            if(nr % i == 0){
                nr++;
            } for ()
        }
    } */


}



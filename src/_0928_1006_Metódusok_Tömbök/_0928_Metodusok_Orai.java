package _0928_1006_Metódusok_Tömbök;

import java.util.Random;

public class _0928_Metodusok_Orai {

    /*Írj metódust, amely eldönti egy bemenetként kapott int számról, hogy az osztható-e 7-tel!
    static boolean isDiv7(int n); */

    public static void main(String[] args) {
        //     System.out.println(isDIv7(21));
        //     System.out.println(canDrawTriangle(2,10,4));
        //      System.out.println(rightAngleTriangle(4.5,5.6));
        //     System.out.println(countDivisors(10));
        //     System.out.println(sumDivisors(8));
        //    System.out.println(isTwinPrime(43,42));
        System.out.println(numberOfSix());
        // System.out.println(isFibonacci(6));
        // System.out.println(StringLength("kocsi", "laptop"));
    }
    /* public static boolean isDIv7(int n){
        if (n % 7 == 0){
            return true;
        } return false; */

        /* Írj egy metódust, amely eldönti három (nem feltétlen egész) számról,
                hogy lehet-e ilyen hosszú szakaszokból háromszöget szerkeszteni!
            (Megj: akkor szerkeszthető háromszög, ha mindhárom oldal kisebb,
                mint a másik kettő összege.)
        static boolean canDrawTriangle(double a, double b, double c); */

    /* public static boolean canDrawTriangle(double a, double b, double c) {
        if (a < b + c) {
            if (b < c + a) {
                if (c < b + a) {
                    return true;
                }
            }
        }
        return false;
    } */

    /* Írj metódust, ami a két befogó hosszát paraméterül adva kiszámolja,
    hogy mennyi a derékszögű háromszög átfogója!
    static double rightAngleTriangle(double a, double b); */

    /* public static double rightAngleTriangle (double a, double b){
        return (a * a) + (b * b);
    } */

    /* Írj egy metódust, amely megszámolja, hogy egy bemenetül kapott int számnak
    hány osztója van!
    static int countDivisors(int n); */

    /* public static int countDivisors(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        return counter; */


    /* Írj metódust, amely visszaadja egy szám nála kisebb osztóinak összegét!
    (Tehát a 8-ra ez az összeg 1+2+4 = 7.)
    static int sumDivisors(int n); */

    /* static int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    } */

    // Írj egy metódust, mely egy számról eldönti, hogy eleme-e a Fibonacci-sorozatnak!


    /* public static boolean isFibonacci(int nr) {
        int szamlalo = 0;
        int n1 = 0;
        int n2 = 1;
        int n3 = n1 + n2;
        while (szamlalo <= nr) {
            if (nr == n1) {
                return true;
            } else {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
                szamlalo++;
            }
        }
        return false; */



     /* Írj metódust, amely két bemeneti számról eldönti, hogy azok ikerprímek-e.
    (Ikerprímnek két olyan prímszám együttesét nevezzük, amelyek 2-vel térnek el egymástól:
    például 5 és 7, vagy 41 és 43.) */

    /* public static boolean isPrime(int nr) {
        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isTwinPrime(int nr1, int nr2) {
        boolean a = isPrime(nr1);
        boolean b = isPrime(nr2);
        if (a && b) {
            if (nr1 - nr2 == 2) {
                return true;
            } else if (nr2 - nr1 == 2) {
                return true;
            }
        }
        return false;
    } */

    /*  Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja,
    hogy hány 6-ost sikerült eközben dobni.
     */

    public static int numberOfSix() {

        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int counter = 0;

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * range) + min;
            if (random == 6) {
                counter++;
            }
        }
        return counter;

   /* Írj egy metódust, amely szimulál 100 kockadobást, és megszámolja,
    hogy hányszor sikerült két 6-ost dobni egymás után. */

    /*public static int numberOfDoubleSix (){
        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int counter = 0;



    } */

    /* A számelméletben tökéletes számnak nevezzük azokat a természetes számokat,
    amelyek megegyeznek az önmaguknál kisebb osztóik összegével.
    Pl. tökéletes szám a 6, mert önmagánál kisebb osztói: 1, 2, 3 és 1+2+3=6.
    Írj metódust, ami egy számról eldönti, hogy tökéletes szám-e! */

    /* public static boolean isPerfectNumbber(int nr) {
        int sum = 0;
        for (int divisor = 1; divisor < nr; divisor++) {
            if (nr % divisor == 0) {
                sum = sum + divisor;
            }
        }
        if (sum == nr) {
            return true;
        } return false;
    }

    // Írj metódust, ami megszámolja, hogy 1 és 1000 között hány tökéletes szám van!

    public static int countedPerfectNumbers (){
        int counter = 0;
        int b = 1000;
        for(int x = 1; x <= b; x++){
            boolean a = isPerfectNumbber(x);
            if(a){
                counter++;
            }
        } return counter;
    }

    /* Írj metódust, ami megkeresi az egy paraméterül kapott számnál nagyobb
    első tökéletes számot! */


        // Írj metódust, ami kiszámolja,hogy két String együttesen (összefűzve) milyen hosszú lesz!

    /* public static int StringLength (String a, String b){
        int sum = 0;
        for(int y = 1; y <= a.length(); y++){
            sum++;
        }
        for (int y = 1; y <= b.length(); y++){
            sum++;
        }
        return sum;
    } */


    }
}






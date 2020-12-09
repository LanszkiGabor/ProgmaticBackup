package _0928_1006_Metódusok_Tömbök;

import java.util.Scanner;

public class _1005_TombokVarosok {

    private static final String[] CITIES = {"Budapest", "Békéscsaba", "Debrecen", "Eger"};
    private static final int[][] DISTANCES =
            {       //            Bp      Bcsab   Debr    Eger
                    /*Bp*/        {0, 216, 231, 158},
                    /*Békéscsaba*/{216, 0, 137, 200},
                    /*Debrecen*/  {231, 137, 0, 136},
                    /*Eger*/      {158, 200, 136, 0},
            };


    public static void main(String[] args) {

        System.out.println(travelToACityAndBack(DISTANCES,CITIES));
    }

    //  Írj programot, ami megmondja, hogy mekkora a legkisebb távolság két város között!

    public static int findMinValue(int[][] nums) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] < minValue && nums[i][j] > 0) {
                    minValue = nums[i][j];
                }
            }
        }
        return minValue;
    }

    // Írj programot, ami megmondja,hogy melyik két város van egymástól legmesszebb!

    public static int findMaxValue(int[][] nums) {
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] > maxvalue && nums[i][j] > 0) {
                    maxvalue = nums[i][j];
                }
            }
        }
        return maxvalue;
    }

    // Írj programot, ami megmondja,hogy melyik két város van egymástól legmesszebb!

    public static void twoFarestCities(int[][] nums, String[] cities) {

        int index1 = 0;
        int index2 = 0;
        int max = findMaxValue(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i][j] == max) {
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println(cities[index1] + " , " + cities[index2]);
    }

    /* Írj programot, ami bekér a felhasználótól két városnevet, és megmondja,
    hgy a két város egymástól milyen távolságra van! Ha a felhasználó olyan városok nevét adja meg,
    amik nem szerepelnek a tömbben, akkor írd ki, hogy "Nincs adat."! */

    public static void distancesOfCities(int[][] nums, String[] cities) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy városnevet");
        String cityname1 = scanner.next();
        System.out.println("Adj meg még egy városnevet");
        String cityname2 = scanner.next();
        int x = -1;
        int y = -1;
        for (int i = 0; i < cities.length; i++) {
            if (cityname1.equals(cities[i])) {
                x = i;
            }
            if (cityname2.equals(cities[i])) {
                y = i;
            }
        }
        if (x == -1 || y == -1) {
            System.out.println("Nincs adat");
        } else {
            System.out.println(nums[x][y]);

        }
    }

    // Írj programot, ami bekér a felahasználótól egy városnevet és megmondja,
    // hogy az adott városhoz melyik másik város van legközelebb!

    public static String closestCity(int[][] nums, String[] cities) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy városnevet");
        String cityname = scanner.next();
        int x = -1;
        for (int i = 0; i < cities.length; i++) {
            if (cityname.equals(cities[i])) {
                x = i;
            }
        }
        int min = Integer.MAX_VALUE;
        int y = -1;
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[x][i] && nums[x][i] > 0) {
                y = i;
            }
        }
        return cities[y];
    }

   /* Írj programot, ami bekér a felahasználótól négy városnevet és megmondja,
    hogy ha az első városból kindulva sorba látogatjuk az összes várost
            (abban a sorrendben, ahogy a felhasználó megadta),
    akkor összesen hány kilométert fogunk megtenni. */

    public static int theWholeDistance(int[][] nums, String[] cities) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg négy városnevet");
        String cityname1 = scanner.next();
        String cityname2 = scanner.next();
        String cityname3 = scanner.next();
        String cityname4 = scanner.next();
        int a = -1;
        int b = -1;
        int c = -1;
        int d = -1;

        for (int i = 0; i < cities.length; i++) {
            if(cityname1.equals(cities[i])){
                a = i;
            }
            if(cityname2.equals(cities[i])){
                b = i;
            }
            if(cityname3.equals(cities[i])){
                c = i;
            }
            if(cityname4.equals(cities[i])){
                d = i;
            }
        }
        int sum = nums[a][b] + nums[b][c] + nums [c][d];
            return sum;
    }

   /* Írj programot, ami bekér a felahasználótól egy városnevet és megmondja,
    ha ebből a városbók kindulva az adatbáizsban szereplő összes városba ellátogatunk csillagtúra
    szerűen (vagyis elmegyünk az első városba, majd vissza a kindulási helyre, el a következő városba,
             vissza a kindlási helyre, stb), akkor összesen hány kilométert fogunk megtenni. */

    public static int travelToACityAndBack(int[][] nums, String[] cities){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy városnevet");
        String cityname = scanner.next();
        int a = -1;
        int sum = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cityname.equals(cities[i])) {
                a = i;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[a][i] * 2;
        }
        return sum;

    }

}




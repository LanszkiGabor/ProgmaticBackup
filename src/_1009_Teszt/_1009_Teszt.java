package _1009_Teszt;

import java.util.Arrays;
import java.util.Scanner;

public class _1009_Teszt {
    public static void main(String[] args) {

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }

        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 20);
        }


        int[][] twoDimArr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                twoDimArr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int k = 0; k < 5; k++) {
            for (int l = 0; l < 5; l++) {
                System.out.print(twoDimArr[k][l] + " ");
            }
            System.out.println();
        }


        /* int[] array101 = {20,33,45,37,56,101}; */

        stairs(5);

    }

    /* Valósítsd meg az alábbi getLastNumber metódust!
    A metódus adja vissza a paraméterként kapott tömb utolsó elemét! */

    public static int getLastNumber(int[] numbers) {
        return numbers[numbers.length - 1];
    }

    /* Valósítsd meg az alábbi countEvenNumbers metódust!
    A metódus adja vissza, hogy a paraméterként kapott tömbben hány páros szám szerepel! */

    public static int countEvenNumbers(int[] numbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    /*Szerepel-e a 101-es szám a tömbben? Valósítsd meg az alábbi findNumber101 metódust!
    A metódus visszatérési értéke legyen az az index,
    ahol a tömbben először szerepel a 101-es szám!
    Ha a tömbben ez a szám nem szerepel, akkor a visszatérési érték legyen -1. */

    public static int findNumber101(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 101) {
                return i;
            }
        }
        return -1;
    }

    /* Valósítsd meg a countSameNumbers metódust! A metódus két egészeket tartalmazó tömb
    paramétert kap, és azt kell megszámolnia,
    hogy hány elem szerepel az első tömbből a második tömbben!
        (Ügyelj arra, hogy ha egy szám többször szerepel a második tömbben,
    akkor azt csak egynek számold! Feltételezheted, hogy az első tömbben minden szám csak
    egyszer fordul elő.) */

    public static int countSameNumbers(int[] numbers, int[] otherNumbers) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < otherNumbers.length; j++) {
                if (numbers[i] == otherNumbers[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

    /* Valósítsd meg a matrixTopLeftNumber metódust!
    A metódus egy kétdimenziós tömböt kap paraméterül,
    és adja vissza ennek a mátrixnak a bal felső (első) elemét! */

    public static int matrixTopLeftNumber(int[][] numbers) {
        return numbers[0][0];
    }



    /* Mennyi a különbség a mátrix két átlójában szereplő elemek összege között?
    Valósítsd meg a matrixDiagonalDifference metódust! A metódus egy kétdimenziós tömböt
    kap paraméterül, és visszatérési értéke a mátrix átlóiban szereplő számok összegei
    közötti eltérés. (Ügyelj arra, hogy a metódusod visszatérési értéke a kérdésnek
    megfelelően mindig nemnegatív szám legyen! Feltételezheted,
    hogy a bemenetül kapott kétdimenziós tömb négyzetes mátrix,
    azaz a sorainak és oszlopainak száma egyenlő.) */


    public static int matrixDiagonalDifference(int[][] numbers){
        int sum1 = 0;
        int sum2 = 0;
        int result;
        for (int i = 0; i < numbers.length; ++i) {
            sum1 = sum1 + numbers[i][i];
            sum2 = sum2 + numbers[i][numbers.length - i - 1];
        }
        result = Math.abs(sum1 - sum2);
        return result;
    }

    /* Valósítsd meg a stairs metódust! A metódus egy egész számot vár bemenetként,
    és rajzoljon ki a kimenetre az alább látható módon egy ilyen magas lépcsőt #
    és szóköz karakterekből!(A metódusnak a bemenetet nem kell ellenőriznie.)
    Példa kimenet height=5 bemenet esetén:

    #
   ##
  ###
 ####
#####

    */

    public static void stairs(int height) {

        int counter = 0;
        for (int i = 0; i < height; i++) {
            counter++;
            for (int j = height; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= counter - 1; k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

    /*Adott két kenguru, akik a számegyenesen ugrálnak. Az első kenguru az x1 helyről indul, és v1
    egységet ugrik (a pozitív irányba), a második kenguru pedig x2 helyről indul és egy ugrással
    v2 egységet ugrik. Döntsük el, hogy a két kenguru fog-e egy időben egy helyen tartózkodni
    a számegyenesen!
    Valósítsd meg a kangaroosMeet metódust, amely az x1, v1, x2 és v2 értékét bemeneti paraméterül
        kapja! (A bemeneti számok nemnegatív egészek lehetnek. A metódusnak a bemenetet nem kell
        ellenőriznie.) A metódus visszatérési értéke a döntésnek megfelelő boolean érték legyen. */

    public static boolean kangaroosMeet(int x1, int v1, int x2, int v2){
        boolean maybe = false;
        int kang = x1;
        int kangJump = v1;
        int aroo = x2;
        int arooJump = v2;
        for( short i = 0; i < Short.MAX_VALUE; i++) {
            kang += kangJump;
            aroo += arooJump;
            if(kang == aroo){
                maybe = true;
            }
        }
        return maybe;
    }

}

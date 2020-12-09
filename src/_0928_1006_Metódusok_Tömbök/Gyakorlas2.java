package _0928_1006_Metódusok_Tömbök;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Gyakorlas2 {
    public static void main(String[] args) {

        /*Írj programot, ami kiírja az elso 100 hárommal osztható és páros természetes szám átlagát!*/


        /*int szum = 0;
        for (int b = 0; b <= 600; b++) {
            if (b % 3 == 0 && b % 2 == 0) {
                szum = szum + b;
            }
        }
        System.out.println(szum / 100);*/

        /*Írd ki a 63434 összes osztóját!*/

        /*int a = 1;
        for (int b = 1; b <= 63434; b++) {
            if (63434 % b == 0) {
                System.out.println(a++ + ".:" + b);
            }
        }*/

        /*Kérj be egy számot, írd ki a páros osztóit!*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("írj be egy számot");
        int a = scanner.nextInt();
        for (int b = 1; b <= a; b++) {
            if (b % 2 == 0 && a % b == 0) {
                System.out.println(b);
            }
        }*/


        /*Írj programot, ami kiírja a 10-es szorzótáblát (1*1=1, 1*2=2,... stb)!
                o   Írd ki a szorzótáblát egy 10*10-es négyzetként valahogy így:
        1*1=1, 1*2=2, 1*3=3,...
        2*1=2, 2*2=4, 2*3=6,...*/

        /*for (int a = 1; a <= 10; a++) {
            System.out.println();
            for (int b = 1; b <= 10; b++) {
                System.out.print(a + "*" + b + "=" + a * b + " ");
            }
        }*/

        /*Írj programot ami kap egy számot, és annak megfelelően ír ki egy három szöget:

        pl:3

        *
        **
        *** */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Írjon be egy számot");
        int a = scanner.nextInt();
        for (int x = 1; x <= a; x++) {
            for (int b = 1; b <= x; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*Írj programot ami kap egy számot és annak megfelelően ír ki egy piramist:

        pl:4
               @
              @@@
             @@@@@
            @@@@@@@*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("írjon be egy számot!");
        int num = scanner.nextInt();
        int space = num - 1;
        int j,i;
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= space; j++){
                System.out.print(" ");
            }
            space--;
            for (j = 1; j <= 2 * i -1; j++){
                System.out.print("@");
            }
            System.out.println("");


        }
         */

        /*Írj egy programot, ami kirajzol egy gyémántot így bekért szám alapján:
   ?
  ???
 ?????
  ???
   ?*/



        /*Írj programot, ami kirajzolja a magyar zászlót (kb) ilyen formában:*/


        /*String ANSI_RED = "\u001B[31m" + "***" + "\u001B[31m";
        String ANSI_WHITE = "\u001B[37m" + "***" + "u001B[37m";
        String ANSI_GREEN = "\u001B[32m" + "***" + "u001B[32m";
        for (int b = 0; b <= 3; b++) {
            for (int a = 0; a <= 10; a++) {
                System.out.print(ANSI_RED);
            }
            System.out.println("");
        } */

    }
}


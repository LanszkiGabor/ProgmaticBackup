package _0928_1006_Metódusok_Tömbök;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _0928_HaziFeladat {
    public static void main(String[] args) {



    /* public static String HungarianFlag() {

        String ANSI_RED = "\u001B[31m" + "*" + "\u001B[31m";
        String ANSI_WHITE = "\u001B[37m" + "*" + "\u001B[37m";
        String ANSI_GREEN = "\u001B[32m" + "*" + "\u001B[32m";

        for (int i = 1; i <= 12; i++) {
            if (i <= 4) {
                for (int j = 1; j < 20; j++) {
                    System.out.print(ANSI_RED + "*");
                }
                System.out.println();

            } else if (i > 4 && i <= 8) {
                for (int j = 1; j < 20; j++) {
                    System.out.print(ANSI_WHITE + "*");
                }
                System.out.println();
            } else {
                for (int j = 1; j < 20; j++) {
                    System.out.print(ANSI_GREEN + "*");
                }
                System.out.println();
            }
        }
    } */


    /* Írj Frodo-reference-age programot. Frodo 33 éves a Lord of the Rings elején,
    és 50, amikor útnak indul a gyűrűvel. Írj programot, ami bekéri a felhasználó korát,
    és megadja, hogy az hogyan viszonyul Frodo e két életkorához.
        Pl., ha a felhasználó 40 éves, a program ezt írja ki:
            "Ön 7 évvel idősebb, mint  Frodo Bilbó 101-edik születésnapján, " +
            "és 10 évvel fiatalabb mint amikor útrakelt." */

   /* public static void main(String[] args) {
        System.out.println("Add meg a korod");
        Scanner scanner = new Scanner((System.in));
        int answer = scanner.nextInt();

        int pre = 33;
        int post = 50;
        if (answer - pre > 0) {
            System.out.println(answer - pre + " évvel idősebb mint Bilbó 101.edik születésnapján");
        } else {
            System.out.println(pre - answer + " évvel idősebb mint Bilbó 101.edik születésnapján");
        }
        if (answer - post > 0) {
            System.out.println(answer - post + " évvel vagy fiatalbb mikor Frodó útrakelt");
        } else {
            System.out.println(post - answer + " évvel vagy fiatalbb mikor Frodó útrakelt");
        }
    } */

        /* Magyar zászló */

    /* public static void HungarianFlag() {

        String ANSI_RED = "\u001B[31m" + "*" + "\u001B[31m";
        String ANSI_WHITE = "\u001B[37m" + "*" + "\u001B[37m";
        String ANSI_GREEN = "\u001B[32m" + "*" + "\u001B[32m";

        for (int i = 1; i <= 12; i++) {
            if (i <= 4) {
                for (int j = 1; j < 20; j++) {
                    System.out.print(ANSI_RED + "*");
                }
                System.out.println();

            } else if (i > 4 && i <= 8) {
                for (int j = 1; j < 20; j++) {
                    System.out.print(ANSI_WHITE + "*");
                }
                System.out.println();
            } else {
                for (int j = 1; j < 20; j++) {
                    System.out.print(ANSI_GREEN + "*");
                }
                System.out.println();
            }
        }
    } */




        /* String ANSI_RED = "\u001B[31m" + "*" + "\u001B[31m";
        String ANSI_WHITE = "\u001B[37m" + "*" + "\u001B[37m";
        String ANSI_BLUE = "\u001B[34m" + "*" + "\u001B[34m";

        for(int a = 0; a < 10; a++){
            if (a <= 6){
                for (int j = 1; j < 6; j++);
                System.out.print(ANSI_RED + "*");
            }
            System.out.println();
        } */


    }
}

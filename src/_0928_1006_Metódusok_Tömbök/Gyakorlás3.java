package _0928_1006_Metódusok_Tömbök;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gyakorlás3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg a korod");
        int x = sc.nextInt();
        System.out.println("Add meg a neved");
        String name =sc.next();
        if (x <= 3 && x >= 0){
            System.out.println("bruu bruu " +  name);
        } if (x > 3 && x <= 13){
            System.out.println("Szia " + name);
        } if (x > 13 && x <= 20) {
            System.out.println("Csáó " + name);
        }if (x > 20){
              System.out.println("Jó Napot kívánok " + name);
        } else {
            System.out.println("Hello Marty McFLy " + name);
        }

        //public static void HungarianFlag() {

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
        }

    }



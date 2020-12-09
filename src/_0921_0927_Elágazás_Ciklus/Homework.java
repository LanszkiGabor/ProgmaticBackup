package _0921_0927_Elágazás_Ciklus;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
            /*System.out.println("írj be egy számot");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("paros");
        } else {
            System.out.println("paratlan");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        System.out.println();
        if (color.equals("piros")) {
  Scanner scanner = new Scanner(System.in);          System.out.println("A piros tilos");
        }
        else if (color.equals("zold")){
                System.out.println("Szabad");
        }
        else{
            System.out.println("hibás");
        }*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a nemét!");
        String gender = scanner.nextLine();
        System.out.println("Adja meg a testmagasságát!");
        int height = scanner.nextInt();
        if (gender.equals("férfi")) {
            if (height > 176) {
                System.out.println("Átlagfeletti");
            } else if (height == 176) {
                System.out.println("átlagos");
            } else {
                System.out.println("alacsony");
            }
        }
        else if (gender.equals("nő")) {
            if (height > 164) {
                System.out.println("Átlagfeletti");
            } else if (height == 164) {
                System.out.println("átlagos");
            } else {
                System.out.println("alacsony");
            }
        }*/
        /*double a,b,c;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        c=scanner.nextDouble();
        if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
            System.out.println("AZ!");
        }else {
            System.out.println("nem az"); */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy színt!");
        String color = scanner.next();
        if (color.equals("piros")) {
            System.out.println("A piros tilos");
        }
        else if (color.equals("zöld")) {
            System.out.println("Szabad");
        }
        else if (color.equals("lila")) {
            System.out.println("SZILVIKE");
        }
        else {
            System.out.println("hibás");
        }
        }
    }





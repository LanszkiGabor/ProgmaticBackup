package _1012_Bicikli;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class _1012_Biciklis {

    public static int[] days;
    public static int[] deliveries;
    public static int[] km;


    public _1012_Biciklis(int[] days, int[] deliveries, int[] km) {
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFromFile();
        System.out.println(lastTripOfTheWeekInKm());
    }

    public static void readFromFile() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("Files/tavok.txt"));

        int rowCount = 0;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            rowCount++;
            System.out.println(rowCount);
        }

        days = new int[rowCount];
        deliveries = new int[rowCount];
        km = new int[rowCount];

        sc = new Scanner(new File("Files/tavok.txt"));

        for (int i = 0; i < rowCount; i++) {
            days[i] = sc.nextInt();
            deliveries[i] = sc.nextInt();
            km[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(days));
        System.out.println(Arrays.toString(deliveries));
        System.out.println(Arrays.toString(km));
    }

    /* Írja ki a képernyőre, hogy mekkora volt a hét legelső útja kilométerben! Figyeljen arra,
    hogy olyan állomány esetén is helyes értéket adjon, amiben például a hét első napján
    a futár nem dolgozott! */

    public static int firstTripOfTheWeekInKm(int[] days, int[] deliveries, int[] km) {
        for (int i = 0; i < days.length; i++) {
            if (days[i] == 1 && deliveries[i] == 1) {
                return km[i];
            }
        }
        return -1;
    }

    // Írja ki a képernyőre, hogy mekkora volt a hét utolsó útja kilométerben!

    public static int lastTripOfTheWeekInKm() {
        int max = 0;
        int index = 0;
        int maxValue = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxValue) {
                maxValue = days[i];
            }
        }

         for (int i = 0; i < days.length; i++) {
            if(days[i] == maxValue){
                if(deliveries[i] > max){
                    max = deliveries[i];
                    index = i;
                }
            }
        }
        return km[index];
    }
}


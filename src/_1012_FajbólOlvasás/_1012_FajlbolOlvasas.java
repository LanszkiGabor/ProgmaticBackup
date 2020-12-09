package _1012_FajbólOlvasás;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class _1012_FajlbolOlvasas {
    public static void main(String[] args) throws FileNotFoundException {


        /*Scanner sc = new Scanner(new File("Files/ocean.txt"));

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        } */

        // 1. módszer

        /* Scanner sc = new Scanner(new File("Files/temps.txt"));
        int[][] data = new int[10][2];

        /* for (int i = 0; sc.hasNext(); i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }
        System.out.println(Arrays.deepToString(data)); */

        //2. módszer

       /* for (int i = 0; sc.hasNext(); i++) {
            String row = sc.nextLine();
            String[] parts = row.split(" ");
            data[i][0] = Integer.parseInt(parts[0]);
            data[i][1] = Integer.parseInt(parts[1]);
        }
        System.out.println(Arrays.deepToString(data));

        //Melyik héten volt a legtöbb fok?

        int maxIndex = 0;

        for (int i = 0; i < data.length; i++) {
            if(data[i][1] > data[maxIndex][1]){
                maxIndex = i;
            }
        }
        System.out.println(data[maxIndex][0]); */

        // System.out.println(whichWeekHadTheMaximumValue());
        // fileReadingText();
        fileReadingNumbers2();
    }

    public static int[][] fileReadingNumbers() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/temps.txt"));
        int[][] data = new int[10][2];
        for (int i = 0; scanner.hasNext(); i++) {
            data[i][0] = scanner.nextInt();
            data[i][1] = scanner.nextInt();
        }
        System.out.println(Arrays.deepToString(data));
        return data;
    }

    public static void fileReadingText() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/ocean.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }

    public static int whichWeekHadTheMaximumValue() throws FileNotFoundException {

        int maxIndex = 0;
        int[][] data = fileReadingNumbers();
        for (int i = 0; i < data.length; i++) {
            if (data[i][1] > data[maxIndex][1]) {
                maxIndex = i;
            }
        }
        return data[maxIndex][0];
    }

    public static void fileReadingNumbers2() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/numbers.txt"));
        int[][] data = new int[10][6];
        for (int i = 0; scanner.hasNext(); i++) {
            for (int j = 0; j < 6; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(data));
    }
}




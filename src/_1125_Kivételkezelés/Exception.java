package _1125_Kivételkezelés;

import java.awt.*;
import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Exception {

    static HashSet<String> badLanguageSet = new HashSet<>();


    public static void main(String[] args) throws BadLanguageException {
        //Scanner scanner = new Scanner(System.in);
        //String date = scanner.nextLine();
        //System.out.println(string2Date(date));
        //guessTheNumber();
        //readTheFileAndAddANumber();
        //speakNicely("te hülye");
        System.out.println(numbersFromFile("Files/eladott.txt"));

    }

    public static LocalDate string2Date(String s) {
        LocalDate localDate = null;

        try {
            localDate = LocalDate.parse(s);
        } catch (DateTimeParseException e) {
            System.out.println("Nem jó formátum, a helyes formátum: éééé-hh-nn");
        }
        return localDate;
    }


    public static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        int random = (int) (Math.random() * 5);
        boolean game = true;
        while (game) {
            try {
                x = scanner.nextInt();
                if (x == random) {
                    game = false;
                    System.out.println("Talált, nyertél!");
                } else if (x > random) {
                    System.out.println("A tippelt szám nagyobb a gondolt számnál");
                } else if (x < random && x > -1) {
                    System.out.println("A tippelt szám kisebb a gondolt számnál");
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Számot kérek 0-100 között");
            }
        }
    }

    public static void readTheFileAndAddANumber() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2;
        Scanner scanner3 = new Scanner(System.in);
        boolean reading = true;
        while (reading) {
            String path = scanner.nextLine();
            try {
                File file = new File(path);
                scanner2 = new Scanner(file);
                int x = scanner3.nextInt();
                for (int i = 0; i < x - 1; i++) {
                    scanner2.nextLine();
                }
                System.out.println(scanner2.nextLine());
                reading = false;
            } catch (FileNotFoundException e) {
                System.out.println("Rossz elérési útvonal, adjon meg helyes elérési útvonalat.");
            } catch (NoSuchElementException e2) {
                System.out.println("Nincs ilyen sor a fájlban, adjon meg új fájl elérési útvonalat");
            } finally {
                scanner.close();
            }
        }
    }


    public static void speakNicely(String s) throws BadLanguageException {
        badLanguageSet.add("baszdmeg");
        badLanguageSet.add("franc");
        badLanguageSet.add("picsa");
        badLanguageSet.add("köcsög");

        for (String badWord : badLanguageSet) {
            if (s.contains(badWord)) {
                System.out.println("Vigyázat! Szókimondó szövegek!");
                BadLanguageException bl = new BadLanguageException();
                throw bl;
            }
        }
    }

    public static ArrayList<Integer> numbersFromFile(String filePath){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(new File(filePath));
            try {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(" ");
                    for (int i = 0; i < parts.length; i++) {
                        int a = Integer.parseInt(parts[i]);
                        list.add(a);
                    }
                }
            } catch (NumberFormatException n) {
                System.out.println("A fájl nem egész számokat tartalmaz");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }



}

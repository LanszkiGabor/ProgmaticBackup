package _1102_Comparator_Animals;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AnimalsMain {
    static ArrayList<Animals> animalsArrayList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Files/foldresz.txt"));
        HashMap<String, ArrayList<String>> animalsAndLocationsHashMap = new HashMap<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            String animalName = parts[0].toLowerCase();
            ArrayList<String> locationsNameArrayList = new ArrayList<>();
            for (int i = 1; i < parts.length; i++) {
                locationsNameArrayList.add(parts[i]);
            }
            animalsAndLocationsHashMap.put(animalName, locationsNameArrayList);
        }


        scanner = new Scanner(new File("Files/animals.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            Animals animals = new Animals(
                    parts[0].toLowerCase(),
                    parts[1],
                    Double.parseDouble(parts[2]),
                    Double.parseDouble(parts[3]),
                    Double.parseDouble(parts[4]),
                    animalsAndLocationsHashMap.get(parts[0].toLowerCase())
            );
            animalsArrayList.add(animals);
        }

         System.out.println(animalsArrayList);
        System.out.println("3 leggyorsabb állat: " + whichThreeAnimalsAreTheFastest());
        System.out.println("3 leglassabb állat: " + whichThreeAnimalsAreTheSlowest());
        System.out.println("3 leggyorsabb szárazföldi állat: " + whichThreeLandAnimalsAreTheFastest());
        System.out.println("3 leglassabb szárazföldi állat: " + whichThreeLandAnimalsAreTheSlowest());
        System.out.println("3 leggyorsabb európai állat: " + whichThreeEuropeanAnimalsAreTheFastest());
        System.out.println("50 kiló feletti legkönyebb állat: " + whichAnimalIsTheLightestAfter50Kg());
        System.out.println("50 kiló feletti leggyorsabb állat: " + whichAnimalIsTheFastestAfter50Kg());

    }

    // Melyik a három leggyorsabb állat? És a három leglassabb?


    public static ArrayList whichThreeAnimalsAreTheFastest() {
        animalsArrayList.sort(new SpeedComparatorDescending());
        ArrayList<String> threeFastestAnimals = new ArrayList<>();
        threeFastestAnimals.add(animalsArrayList.get(0).getName());
        threeFastestAnimals.add(animalsArrayList.get(1).getName());
        threeFastestAnimals.add(animalsArrayList.get(2).getName());
        return threeFastestAnimals;
    }

    public static ArrayList whichThreeAnimalsAreTheSlowest() {
        animalsArrayList.sort(new SpeedComparatorAscending());
        ArrayList<String> threeFastestAnimals = new ArrayList<>();
        threeFastestAnimals.add(animalsArrayList.get(0).getName());
        threeFastestAnimals.add(animalsArrayList.get(1).getName());
        threeFastestAnimals.add(animalsArrayList.get(2).getName());
        return threeFastestAnimals;
    }

    // Melyik a három leggyorsabb szárazföldi állat? És a három leglassabb?

    public static ArrayList<String> whichThreeLandAnimalsAreTheFastest() {
        animalsArrayList.sort(new SpeedComparatorDescending());
        ArrayList<String> threeFastestAnimals = new ArrayList<>();
        ArrayList<String> onlyLandAnimals = new ArrayList<>();
        for (Animals animals : animalsArrayList) {
            if (animals.getType().equals("szárazföldi")) {
                onlyLandAnimals.add(animals.getName());
            }
        }
        threeFastestAnimals.add(onlyLandAnimals.get(0));
        threeFastestAnimals.add(onlyLandAnimals.get(1));
        threeFastestAnimals.add(onlyLandAnimals.get(2));
        return threeFastestAnimals;
    }

    public static ArrayList<String> whichThreeLandAnimalsAreTheSlowest() {
        animalsArrayList.sort(new SpeedComparatorAscending());
        ArrayList<String> threeSlowestAnimals = new ArrayList<>();
        ArrayList<String> onlyLandAnimals = new ArrayList<>();
        for (Animals animals : animalsArrayList) {
            if (animals.getType().equals("szárazföldi")) {
                onlyLandAnimals.add(animals.getName());
            }
        }
        threeSlowestAnimals.add(onlyLandAnimals.get(0));
        threeSlowestAnimals.add(onlyLandAnimals.get(1));
        threeSlowestAnimals.add(onlyLandAnimals.get(2));
        return threeSlowestAnimals;
    }

    // Melyik a három leggyorsabb állat, ami él Európában? És a három leglassabb?

    public static ArrayList<String> whichThreeEuropeanAnimalsAreTheFastest() {
        animalsArrayList.sort(new SpeedComparatorDescending());
        ArrayList<String> threeFastestAnimals = new ArrayList<>();
        ArrayList<String> onlyEuropeanAnimals = new ArrayList<>();
        for (Animals animals : animalsArrayList) {
            if (animals.getLocations().toString().contains("Európa")) {
                onlyEuropeanAnimals.add(animals.getName());
            }
        }
        threeFastestAnimals.add(onlyEuropeanAnimals.get(0));
        threeFastestAnimals.add(onlyEuropeanAnimals.get(1));
        threeFastestAnimals.add(onlyEuropeanAnimals.get(2));
        return threeFastestAnimals;
    }

    // Az 50 kg-nál nehezebb állatok közül melyik a legkönnyebb?

    public static String whichAnimalIsTheLightestAfter50Kg() {
        animalsArrayList.sort(new WeightComparator());
        ArrayList<Animals> animalsAfter50Kg = new ArrayList<>();
        for (Animals animal : animalsArrayList) {
            if (animal.getWeight() > 50) {
                animalsAfter50Kg.add(animal);
            }
        }
        return animalsAfter50Kg.get(0).getName();
    }

    /* Az 50 kg-nál nehezebb állatok közül melyik a leggyorsabb?
    Meg tudod oldani ezt a feladatot úgy, hogy az algoritmus ugyanaz legyen mint az előzőnél,
    csak a comparator változzon? */

    public static String whichAnimalIsTheFastestAfter50Kg() {
        animalsArrayList.sort(new WeightComparator());
        ArrayList<Animals> animalsAfter50Kg = new ArrayList<>();
        for (Animals animal : animalsArrayList) {
            if (animal.getWeight() > 50) {
                animalsAfter50Kg.add(animal);
            }
        }
        animalsAfter50Kg.sort(new SpeedComparatorDescending());
        return animalsAfter50Kg.get(0).getName();
    }


}

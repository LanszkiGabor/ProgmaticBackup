package _1028_Boxolók;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.*;

public class BoxerMain {

    static ArrayList<BoxerClass> boxerClassArrayList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("Files/boxers.txt"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");

            BoxerClass boxerClass = new BoxerClass(
                    parts[0],
                    parts[1],
                    Integer.parseInt(parts[2]),
                    Integer.parseInt(parts[3]),
                    Integer.parseInt(parts[4]));
            boxerClassArrayList.add(boxerClass);
        }
        for (int i = 0; i < boxerClassArrayList.size(); i++) {
            System.out.println(boxerClassArrayList.get(i).getName() + " " + boxerClassArrayList.get(i).getNationality() + " " + boxerClassArrayList.get(i).getWeight() + " " + boxerClassArrayList.get(i).getWeightLossOneDayMax() + " " + boxerClassArrayList.get(i).getWeightLossMax());
        }


        System.out.println("Magyar boxolók átlagos testsúlya: " + hungarianBoxersAverageWeight());
        System.out.println("Legnehezebb boxoló testsúlya " + heaviestBoxerInKg());
        System.out.println("Egy adott boxoló ebben a súlycsoportban boxol " + findTheExactBoxerWeightCategory("John Little"));
        System.out.println("Ezekben a súlycsoportokban boxolnak a boxolók: " + putTheBoxersToTheirWeightCategories());
        System.out.println("Ennyien boxolnak az egyes súlycsoportokban " + howManyBoxersInOneCategory());
        System.out.println(boxersOfWeightCategories().toString());
        System.out.println(matchesInCategories());
        System.out.println(whoWinsWithoutAMatch());
    }

    // Mennyi a magyar boxolók átlagos testsúlya?

    public static float hungarianBoxersAverageWeight() {
        int counter = 0;
        int boxersWeight = 0;
        for (BoxerClass actualBoxer : boxerClassArrayList) {
            if (actualBoxer.getNationality().contains("hu")) {
                counter++;
                boxersWeight += actualBoxer.getWeight();
            }
        }
        return (float) boxersWeight / counter;
    }

    // Hány kg-s a legnehezebb boxoló?

    public static int heaviestBoxerInKg() {
        int max = 0;
        for (BoxerClass actualBoxer : boxerClassArrayList) {
            if (actualBoxer.getWeight() > max) {
                max = actualBoxer.getWeight();
            }
        }
        return max;
    }

    /* Egy adott boxoló mely súlycsoportban boxol? (Tipp: boxoló osztályod tartalmazzon egy
    public int myWeightCategory() metódust! Hol és hogyan tárolnád ez esetben a
    weightCategories tömböt?) */


    public static HashMap<Integer, ArrayList<String>> putTheBoxersToTheirWeightCategories() {
        HashMap<Integer, ArrayList<String>> boxerMap = new HashMap<>();
        for (BoxerClass actualBoxer : boxerClassArrayList) {
            boxerMap.putIfAbsent(actualBoxer.myWeightCategory(), new ArrayList<>());
            boxerMap.get(actualBoxer.myWeightCategory()).add(actualBoxer.getName());
        }
        return boxerMap;
    }
    // Feladat megoldas:

    public static int findTheExactBoxerWeightCategory(String boxerName) {
        for (BoxerClass actualBoxer : boxerClassArrayList) {
            if (boxerName.equals(actualBoxer.getName())) {
                return actualBoxer.myWeightCategory();
            }
        }
        return 0;
    }

    // Hányan boxolnak az egyes súlycsoportokban?

    public static HashMap<Integer, Integer> howManyBoxersInOneCategory() {
        HashMap<Integer, Integer> mapToReturn = new HashMap<>();
        HashMap<Integer, ArrayList<String>> boxerMap = putTheBoxersToTheirWeightCategories();
        for (Integer weightCategory : boxerMap.keySet()) {
            mapToReturn.put(weightCategory, boxerMap.get(weightCategory).size());
        }
        return mapToReturn;
    }

    /* Kik boxolnak az egyes súlycsoportokban? (Tipp: írj metódust a következő szignatúrával:
    public HashMap<Integer, ArrayList<Boxer>>;
    boxersOfWeightCategories()!) */

    public static HashMap<Integer, ArrayList<BoxerClass>> boxersOfWeightCategories() {
        HashMap<Integer, ArrayList<BoxerClass>> boxerMap = new HashMap<>();
        for (BoxerClass actualBoxer : boxerClassArrayList) {
            boxerMap.putIfAbsent(actualBoxer.myWeightCategory(), new ArrayList<>());
            boxerMap.get(actualBoxer.myWeightCategory()).add(actualBoxer);
        }
        return boxerMap;
    }

    /* Írd ki, hogy súlycsoportonként milyen mérkőzések lesznek (hogy melyik boxolók
            küzdenek egymással). */

    public static HashMap<Integer, ArrayList<String>> matchesInCategories() {
        HashMap<Integer, ArrayList<String>> mapToReturn = new HashMap<>();
        HashMap<Integer, ArrayList<String>> boxerMap = putTheBoxersToTheirWeightCategories();

        for (Integer weightCategory : boxerMap.keySet()) {
            for (int i = 0; i < boxerMap.get(weightCategory).size() - 1; i++) {
                for (int j = i + 1; j < boxerMap.get(weightCategory).size(); j++) {
                    mapToReturn.putIfAbsent(weightCategory, new ArrayList<>());
                    mapToReturn.get(weightCategory).add(boxerMap.get(weightCategory).get(i) + " - " + boxerMap.get(weightCategory).get(j));
                }
            }
        }
        return mapToReturn;
    }

    /* Van-e olyan boxoló, aki mérkőzés nélkül is nyerni fog (mert egyedül van a
            súlycsoportjában)? */

    public static HashMap<Integer, ArrayList<String>> whoWinsWithoutAMatch() {
        HashMap<Integer, ArrayList<String>> mapToReturn = new HashMap<>();
        HashMap<Integer, ArrayList<String>> boxerMap = putTheBoxersToTheirWeightCategories();
        for ( Integer weightCategory : boxerMap.keySet()) {
            ArrayList<String> actualCategory = boxerMap.get(weightCategory);
            if(actualCategory.size() == 1){
                mapToReturn.putIfAbsent(weightCategory, new ArrayList<>());
                return mapToReturn;
            }
        }
        return null;
    }


}

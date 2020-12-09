package _1027_Indián;

import _1119_Enum.Gender;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class _1027_IndianMain {
    static ArrayList<_1027_IndianClass> indianClassArrayList = new ArrayList<>();


    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("Files/indianok.txt"));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            HashSet<String> belongingsHashSet = new HashSet<>();
            String[] belongingsArray = parts[4].split("\\|");
            for (String string : belongingsArray) {
                belongingsHashSet.add(string);
            }
            Gender gender;
            if (parts[2].equals("f")){
                gender = Gender.MALE;
            } else {
                gender = Gender.FEMALE;
            }

            _1027_IndianClass indianClass = new _1027_IndianClass(
                    parts[0],
                    parts[1],
                    gender,
                    Integer.parseInt(parts[3]),
                    belongingsHashSet);
            indianClassArrayList.add(indianClass);
        }
        for (int j = 0; j < indianClassArrayList.size(); j++) {
            System.out.println(indianClassArrayList.get(j).getName() + " " + indianClassArrayList.get(j).getTribe() + " " + indianClassArrayList.get(j).getGender() + " " + indianClassArrayList.get(j).getAge() + " " + indianClassArrayList.get(j).getBelongings());
        }

        System.out.println("Ennyi különböző eszköz van a leltárban: " + howManyBelongingsInTheInventory());
        System.out.println("Ennyi indián van: " + howManyIndians());
        System.out.println("Ennyien vannak egy adott azonos törzsben: " + getIndiansInOneTribe("Apache").size());
        System.out.println("Ekkora a férfi arány az xy törzsben: " + whatIsTheManRate("Apache") + "%");
        System.out.print("Vének Tanácsa Tagja(i): ");
        ;
        whichIndiansAreInTheOldCouncilInTheApacheTribe();
        System.out.println("Ennyi tulajdona van átlagosan egy indiánnak: " + howManyBelongingsOneIndianHasInAverage());
        System.out.println("Ennyi indiánnak van íja: " + howManyIndiansHaveAnArrow());
        howManyBareFootIndianAndTheirAverageAge();
        whichTribeHasTheMostOfTheIndians();
        System.out.println();
        System.out.println(whatIsTheManRateInTheIndianTribes());
        System.out.println("A legtobb tomahawkja ennek a törzsnek van : " + whichTribesMenHasTheMostTomahawks());
        System.out.println("Ennek a törzsnek a gyerekeinek van a legtöbb tulajdona: " + whichTribeHasTheMostBelongings());
        System.out.println(howManyItemsPerTypePerTribe());
    }
    // Hány különböző fajta eszköz szerepel a leltárban?


    public static int howManyBelongingsInTheInventory() {
        HashSet<String> item = new HashSet<>();
        int counter = 0;
        for (_1027_IndianClass indianClass : indianClassArrayList) {
            item.addAll(indianClass.getBelongings());
        }
        for (String string : item) {
            counter++;
        }
        return counter;
    }

    // Hány indián szerepel a leltárban?

    public static int howManyIndians() {
        return indianClassArrayList.size();
    }

    // Hányan vannak egy adott indián törzsben? (A metódus bemeneti paraméterül kapja a törzs nevét.)

    public static HashSet<_1027_IndianClass> getIndiansInOneTribe(String tribe) {
        HashSet<_1027_IndianClass> collectedIndians = new HashSet<>();

        for (_1027_IndianClass indianClass : indianClassArrayList) {
            if (tribe.equals(indianClass.getTribe())) {
                collectedIndians.add(indianClass);
            }
        }
        return collectedIndians;
    }

    // Milyen a férfi arány a Seminole törzsben?

    public static float whatIsTheManRate(String tribeName) {
        HashSet<_1027_IndianClass> seminoleIndians = getIndiansInOneTribe(tribeName);
        int woman = 0;
        int man = 0;
        for (_1027_IndianClass actualIndian : seminoleIndians) {
            if (actualIndian.getGender() == Gender.MALE) {
                man++;
            } else {
                woman++;
            }
        }
        return (float) man / (woman + man) * 100;
    }

    // Kik alkotják a vének tanácsát az apache törzsben? (A vének arról ismerszenek meg, hogy van békepipájuk.)

    public static void whichIndiansAreInTheOldCouncilInTheApacheTribe() {
        HashSet<_1027_IndianClass> apacheIndians = getIndiansInOneTribe("Apache");
        for (_1027_IndianClass actualIndian : apacheIndians) {
            if (actualIndian.getBelongings().contains("békepipa")) {
                System.out.println(actualIndian.getName());
            }
        }
    }

    // Átlagosan hány tulajdona van egy indiánnak?

    public static int howManyBelongingsOneIndianHasInAverage() {
        int counter = 0;
        for (_1027_IndianClass actualIndian : indianClassArrayList) {
            counter += actualIndian.getBelongings().size();
        }
        return Math.round((float) counter / indianClassArrayList.size());
    }

    // Hány indiánnak van íja?

    public static int howManyIndiansHaveAnArrow() {
        int counter = 0;
        for (_1027_IndianClass actualIndian : indianClassArrayList) {
            if (actualIndian.getBelongings().contains("íj")) {
                counter++;
            }
        }
        return counter;
    }

    // Hány mezítlábas indián van? Mennyi az átlagéletkoruk? (Mezítlábas az, akinek nincs mokaszinje.)

    public static void howManyBareFootIndianAndTheirAverageAge() {
        int counter = 0;
        int counterAge = 0;
        for (_1027_IndianClass actualIndian : indianClassArrayList) {
            if (!actualIndian.getBelongings().contains("mokaszin")) {
                counter++;
                counterAge += actualIndian.getAge();
            }
        }
        System.out.println("Ennyi mezítlábas van: " + counter);
        System.out.println("Ennyi az átlagéletkoruk: " + (float) counterAge / counter);
    }

    // Melyik indián törzsben vannak a legtöbben?

    public static void whichTribeHasTheMostOfTheIndians() {
        HashMap<String, Integer> indianMap = new HashMap<>();
        int max = 0;
        String string = "";
        for (_1027_IndianClass actualIndian : indianClassArrayList) {
            indianMap.put(actualIndian.getTribe(), indianMap.getOrDefault(actualIndian.getTribe(), 0) + 1);
        }
        for (Map.Entry actualTribe : indianMap.entrySet()) {
            if ((int) actualTribe.getValue() > max) {
                max = (int) actualTribe.getValue();
                string = (String) actualTribe.getKey();
            }
            // System.out.println(actualTribe.getKey() + " " + actualTribe.getValue());
        }
        System.out.println(string);
    }

    // Milyen a férfi arány az egyes indián törzseknél

    public static HashMap<String, List<_1027_IndianClass>> orderIndiansByTribe() {
        HashMap<String, List<_1027_IndianClass>> indianMap = new HashMap<>();
        for (_1027_IndianClass actualIndian : indianClassArrayList) {
            List<_1027_IndianClass> ind = new ArrayList<>();
            ind.add(actualIndian);
            indianMap.putIfAbsent(actualIndian.getTribe(), ind);
            if (indianMap.containsKey(actualIndian.getTribe())) {
                List<_1027_IndianClass> indianList = indianMap.get(actualIndian.getTribe());
                indianList.add(actualIndian);
                indianMap.put(actualIndian.getTribe(), indianList);
            }
        }
        return indianMap;
    }

    public static HashMap<String, Float> whatIsTheManRateInTheIndianTribes() {
        HashMap<String, List<_1027_IndianClass>> indianClass = orderIndiansByTribe();
        HashMap<String, Float> indClass = new HashMap<>();
        for (String string : indianClass.keySet()) {
            indClass.put(string, whatIsTheManRate(string));
        }
        return indClass;
    }

    // Melyik törzsben van a legtöbb férfinak tomahawkja?

    public static String whichTribesMenHasTheMostTomahawks() {
        HashMap<String, List<_1027_IndianClass>> indianClass = orderIndiansByTribe();
        String tribeName = null;
        int max = 0;
        for (String key : indianClass.keySet()) {
            int counter = 0;
            for (_1027_IndianClass indian : indianClass.get(key)) {
                if (indian.getGender() == Gender.MALE) {
                    if (indian.getBelongings().contains("tomahawk")) {
                        counter++;
                    }
                }
            }
            if (counter > max) {
                tribeName = key;
                max = counter;
            }
        }
        return tribeName;

    }

    // Mely törzs gyerekeinek van a legtöbb tulajdona (gyerek az, aki 18 év alatti).

    public static String whichTribeHasTheMostBelongings() {
        HashMap<String, List<_1027_IndianClass>> indianClass = orderIndiansByTribe();
        String tribeName = null;
        int max = 0;
        for (String key : indianClass.keySet()) {
            int counter = 0;
            for (_1027_IndianClass indian : indianClass.get(key)) {
                if (indian.getAge() < 18) {
                    indian.getBelongings().size();
                    counter += indian.getBelongings().size();
                }
            }
            if (counter > max) {
                tribeName = key;
                max = counter;
            }
        }
        return tribeName;
    }

    // Írd ki, hogy törzsenként mennyi van az egyes eszközökből!

    public static HashMap<String, List<String>> howManyBelongingsInOneTribe() {
        HashMap<String, List<_1027_IndianClass>> indianClass = orderIndiansByTribe();
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String key : indianClass.keySet()) {
            for (_1027_IndianClass actualIndian : indianClass.get(key)) {
                hashMap.putIfAbsent(key, new ArrayList<>());
                hashMap.get(key).addAll(actualIndian.getBelongings());
            }
        }
        return hashMap;
    }

    public static HashMap<String, HashMap<String, Integer>> howManyItemsPerTypePerTribe() {
        HashMap<String, List<String>> tribeItems = howManyBelongingsInOneTribe();
        HashMap<String, HashMap<String, Integer>> mapToReturn = new HashMap<>();
        for (String tribeName : tribeItems.keySet()) {
            HashMap<String, Integer> itemCount = new HashMap<>();
            for (String actualItem : tribeItems.get(tribeName)) {
                if (itemCount.containsKey(actualItem)) {
                    int currentNumberOfTools = itemCount.get(actualItem) + 1;
                    itemCount.put(actualItem, currentNumberOfTools);
                } else {
                    itemCount.put(actualItem, 1);
                }
            }
            mapToReturn.put(tribeName, itemCount);
        }
        return mapToReturn;
    }


}







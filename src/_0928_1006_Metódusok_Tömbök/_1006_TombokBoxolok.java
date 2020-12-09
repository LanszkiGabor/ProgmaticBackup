package _0928_1006_Metódusok_Tömbök;

import java.util.Arrays;
import java.util.Collection;

public class _1006_TombokBoxolok {
    public static int[] englishBoxers = {73, 64, 81, 54, 82, 73, 62, 91, 83};

    public static int[] frenchBoxers = {51, 82, 58, 67, 85, 100, 78, 91, 130, 72};

    public static int[] weightCategories = {52, 57, 63, 71, 79, 91};

    public static int englishLength = englishBoxers.length;
    public static int frenchLength = frenchBoxers.length;
    public static int[] twoInOne = new int[englishLength + frenchLength];

    public static void main(String[] args) {

        /* int[] segedtomb = new int[frenchBoxers.length];
        for (int i = 0; i < frenchBoxers.length; i++) {
            segedtomb[i] = frenchBoxers[i] * -1;
        } */

        int englishLength = englishBoxers.length;
        int frenchLength = frenchBoxers.length;
        int[] twoInOne = new int[englishLength + frenchLength];
        System.arraycopy(englishBoxers, 0, twoInOne, 0, englishLength);
        System.arraycopy(frenchBoxers, 0, twoInOne, englishLength, frenchLength);


        writeTheWeightsInOneCategory(twoInOne);
    }


    // Mennyi az angol boxolók átlagos testsúlya?int[] hills = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};

   /* public static int avarageEnglishWeight(int[] nums) {
        int counter = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            counter++;
            sum = sum + nums[i];
        }
        return sum / counter;
    } */

    public static int avarageEnglishWeight2(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum / nums.length;
    }


    // Hány kg-s a legnehezebb boxoló?

    public static int theHeaviestBoxer(int[] nums1, int[] nums2) {
        int maxValue1 = 0;
        int maxValue2 = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] > maxValue1) {
                maxValue1 = nums1[i];
            }
        }


        for (int j = 0; j < nums2.length; j++) {
            if (nums2[j] > maxValue2) {
                maxValue2 = nums2[j];
            }
        }


        if (maxValue1 > maxValue2) {
            return maxValue1;
        } else {
            return maxValue2;
        }
    }

    // Hány Kgos a legnehezzeb boxoló( Egy tömbből)

    public static int theHeaviestBoxerFromOneArray(int[] nums) {
        int maxValue = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (maxValue < nums[i]) {
                maxValue = nums[i];
            }
        }
        return maxValue;
    }


    // Tömb elemeinek sorba rakása

    public static void sortOfArray(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }

            }
    }


    //Van két olyan boxoló, akik együtt is könnyebbek mint a legnehezebb boxoló?
    // KIk ők (hány kg-sak)?

    public static boolean lighterThanTheHeaviest(int[] nums) {
        boolean t = false;
        int n = theHeaviestBoxerFromOneArray(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] < n) {
                    System.out.println(nums[i] + " " + nums[j]);
                    t = true;
                }
            }
        }
        return t;
    }

    // Hányan boxolnak az egyes súlycsoportokban?

    public static int[] getThePersonsInOneWeightCategories(int[] nums) {
        int[] counterResults = new int[7];
        /* int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int counter6 = 0;
        int counter7 = 0; */
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > 0 && nums[i] <= 52) {
                counterResults[0] = counterResults[0] + 1;
                // counter1++;
            }
            if (nums[i] > 52 && nums[i] <= 57) {
                counterResults[1] = counterResults[1] + 1;
                // counter2++;
            }
            if (nums[i] > 57 && nums[i] <= 63) {
                counterResults[2] = counterResults[2] + 1;
                // counter3++;
            }
            if (nums[i] > 63 && nums[i] <= 71) {
                counterResults[3] = counterResults[3] + 1;
                // counter4++;
            }
            if (nums[i] > 71 && nums[i] <= 79) {
                counterResults[4] = counterResults[4] + 1;
                // counter5++;
            }
            if (nums[i] > 79 && nums[i] <= 91) {
                counterResults[5] = counterResults[5] + 1;
                // counter6++;
            }
            if (nums[i] > 91) {
                counterResults[6] = counterResults[6] + 1;
                // counter7++;
            }
        }
        /* System.out.println("Első kategória" + " " + counter1);
        System.out.println("Második kategória" + " " + counter2);
        System.out.println("Harmadik kategória" + " " + counter3);
        System.out.println("Negyedik kategória" + " " + counter4);
        System.out.println("Ötödik ketagória" + " " + counter5);
        System.out.println(("Hatodik kategória" + " " + counter6));
        System.out.println("Hetedik kategória" + " " + counter7); */

        return counterResults;

    }

    // Van-e olyan boxoló, aki mérkőzés nélkül is nyerni fog (mert egyedül van a súlycsoportjában)?

    public static boolean winWithoutAMatch(int[] nums) {
        int[] personQuantityInCategories = getThePersonsInOneWeightCategories(nums);
        for (int i = 0; i < personQuantityInCategories.length; i++) {
            if (personQuantityInCategories[i] == 1) {
                return true;
            }
        }
        return false;
    }


    // Egyesítő metódus
    /*public static int[] englishAndFrenchInOne (int[] nums){
        for (int i = 0; i < twoInOne.length; i++) {

        }
    } */

    // Van-e olyan súlycsoport, ahol garantált a francia aranyérem (mert csak franciák indulnak)?
    //  Ha igen melyek ezek?

    public static boolean onlyFrance(int[] nums) {
        boolean t = false;
        int[] onlyEnglish = getThePersonsInOneWeightCategories(nums);
        for (int i = 0; i < onlyEnglish.length; i++) {
            if (onlyEnglish[i] == 0) {
                System.out.println(i);
                t = true;
            }
        }
        return t;
    }

    // Hány azonos súlyú angol boxoló van? Írd ki a súlyukat!

    public static void sameWeightEnglish(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println("Az azonos súlyú boxolók súlya:" + " " + nums[i]);
                }
            }
        }

    }

   // Hány olyan francia boxoló van, aki pontosan azonos súlyú egy angol boxolóval? Írd ki a súlyukat!

    public static void sameEnglishAndFranceWeight(int[] english, int[] france){
        for (int i = 0; i < english.length; i++) {
            for (int j = 0; j < france.length; j++) {
                if(english[i] == france[j]) {
                    System.out.println("Az azonos súlyú franciák és angolok súlyai:" +  " " +  english[i]);
                }
            }
        }
    }

   // Írd ki, hogy súlycsoportonként milyen mérkőzések lesznek (hogy milyen súlyú boxolók küzdenek egymással).

    public static void writeTheWeightsInOneCategory(int[] nums){
        int temp = 0;
        sortOfArray(nums);
        int[] personsInCategories = getThePersonsInOneWeightCategories(nums);
        System.out.println(Arrays.toString(personsInCategories));
        for (int i = 0; i < personsInCategories.length; i++) {
            for (int j = temp; j < personsInCategories[i]+temp ; j++) {

                System.out.println(i + ":" + nums[j]);
            }
            temp = temp + personsInCategories[i];
        }
    }

}



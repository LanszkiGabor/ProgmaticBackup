package _1008_Gandalf;

import java.util.Arrays;

public class _1008_Gandalf {

    public static int[] hills = {100, 430, 380, 230, 310, 225, 213, 178, 202, 30, 110};

    public static int[] weight = {84, 83, 82, 76, 61, 70, 58, 67, 72, 85};

    public static String[] text = {"Üdvözöllek", "Gandalf", "jó", "hogy", "újra", "látlak"};

    public static void main(String[] args) {

        System.out.println(Arrays.toString(characterSlipping(text, 3)));

    }

    // Segíts Gandalfnak megtalálni a legmagasabb dombot! Írj metódust, ami megkeresi
    // egy tömb legnagyobb elemét!

    public static int theHighestHill (int[] nums){
        int maxValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(maxValue < nums[i]){
                maxValue = nums[i];
            }
        }
        return  maxValue;
    }

    /* Írj metódust, ami válaszol Gandalf kérdésére, vagyis egy tömb minden elemét
    lecseréli a tőle jobbra lévő elemek (és saját maga) közül a legnagyobbra.
            Pl.
    {3, 1, 6, 14, 5} -> {14, 14, 14, 14, 5}
    {7, 10, 6, 2, 5, 3} -> {10, 10, 6, 5, 5, 3}
    Meg tudod ezt a feladatot egy ciklussal is oldani? */

    public static int maxOfTheArrayGreaterThan (int [] nums, int fromIndex) {
        int max = Integer.MIN_VALUE;
        for (int i = fromIndex; i < nums.length; i++) {
            if (nums[i] > max ){
                max = nums[i];
            }
        }
        return max;
    }

    public static int[] changeTheElementsForTheBiggestElements (int[] nums){

        int[] biggestElements = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            biggestElements[i] = maxOfTheArrayGreaterThan(nums, i);
        }
        return biggestElements;
    }

    // Átkelés a hídon

    /*Szolidaritásból Gandalf
    sem repül, hanem közösen úgy határoztak, hogy súly szerint sorba állnak és először a
    legkönnyebb és a legnehezebb megy át, utána a második legkönnyebb és a második
    legnehezebb és így tovább. Ha valamelyik pár nehezebb 150 kg-nál, akkor ők egyesével
    mennek át. Egy személy ill. egy pár 5 perc alatt kel át a hídon. Mennyi ideig tartott a teljes
    átkelés? */

    public static int goThroughTheBridge (int [] nums){
        Arrays.sort(nums);
        int first = 0;
        int last = 0;
        int timeCounter = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            first = nums[i];
            last = nums[nums.length - 1 -i];
            if(first + last <= 150){
                timeCounter = timeCounter + 5;
            } else {
                timeCounter = timeCounter + 10;
            }
        }
        return timeCounter;
    }

    /*Írj metódust, ami egy Stringeket tartalmazó tömb összes elemét ciklikusan jobbra
    csúsztatja egyel! A ciklikusság azt jelenti, hogy a tömb utolsó elemét az első helyre
    rakd!*/

    public static String[] welcomeMonolog (String[] text) {
        String[] welcome = new String[text.length];
        for (int i = 0; i < text.length; i++) {
            if (i == text.length - 1) {
                welcome[0] = text[i];
            } else {
                welcome[i + 1] = text[i];
            }
        }
        return welcome;
    }


    /* Írj metódust, ami egy Sting karaktereit csúsztatja jobbra valahányszor. Használd a
    String toCharArray metódusát, hogy String-ből char[]-t csinálj! */

    public static String[] characterSlipping (String[] text, int n){
        String[] welcome = new String[text.length];
        int x;
        char[] segedtomb;
        char[] character;
        for (int i = 0; i < text.length; i++) {
            character = text[i].toCharArray();
            segedtomb = new char[character.length];
            x = n % character.length;
            for (int j = 0; j < character.length; j++) {
                if(j >= character.length - x){
                    segedtomb[j + x - character.length] = character[j];
                } else {
                    segedtomb[j + x] = character[j];
                }
            }
            welcome[i] = Arrays.toString(segedtomb);
        }
        return welcome;
    }


}

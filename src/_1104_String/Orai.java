package _1104_String;

import java.util.Arrays;

public class Orai {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countTheDifferentCharacters("KÁDÁR   <<<666>>>")));
        System.out.println(countTheGivenCharacter("asdasdvrvrv", 'a'));
        System.out.println(countTheSameCharsOnTheSamePosition("nnn","nnnwfwef"));
    }

    /* Írj programot, ami megszámolja, hogy egy string-ben hány betű,
    hány szám, hány space és hány egyéb karakter van! */

    public static int[] countTheDifferentCharacters(String string){
        int wordCounter = 0;
        int numberCounter = 0;
        int spaceCounter = 0;
        int miscellaneousCounterCounter = 0;

        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(string.charAt(i))){
                wordCounter++;
            }
            else if(Character.isDigit(string.charAt(i))){
                numberCounter++;
            }
            else if(Character.isSpaceChar(string.charAt(i))){
                spaceCounter++;
            }
            else {
                miscellaneousCounterCounter++;
            }
        }
        int[] returnArray = {wordCounter, numberCounter, spaceCounter, miscellaneousCounterCounter};
        return returnArray;
    }


    // Írj programot, ami megszámolja, hogy egy string-ben hányszor fordul elő egy adott karakter!

    public static int countTheGivenCharacter(String str, char ch){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch ){
                counter++;
            }
        }
        return counter;
    }

    /* Írj egy függvényt, mely két sztringet kap paraméterként és visszaadja hány karakterük egyezik meg
            (ugyanazon a poziíción ugyanaz a karakter van)!
            (például: „alma" és „ álmatlan” -> 3; „sátortábor” és „bátorság” -> 5; „ágy”, „vágy” -> 0) */

    public static int countTheSameCharsOnTheSamePosition(String str1, String str2){
        int counter = 0;
        String shorterString;
        String longerString;
        if(str1.length() > str2.length()){
            shorterString = str2;
            longerString = str1;
        } else {
            shorterString = str1;
            longerString = str2;
        }
        for (int i = 0; i < shorterString.length(); i++) {
            if(shorterString.charAt(i) == longerString.charAt(i)){
                counter++;
            }
        }
        return counter;
    }

}

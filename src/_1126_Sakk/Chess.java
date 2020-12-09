package _1126_Sakk;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Chess {

    static ArrayList<Character> characterArrayList = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException, InvalidChessBoardException {
        isItAChessGame("Files/chess.txt");
    }


    public static void isItAChessGame(String pathName) throws FileNotFoundException, InvalidChessBoardException {

    characterArrayList.add('\u2654');
    characterArrayList.add('\u2655');
    characterArrayList.add('\u2656');
    characterArrayList.add('\u2657');
    characterArrayList.add('\u2658');
    characterArrayList.add('\u2659');
    characterArrayList.add('\u265A');
    characterArrayList.add('\u265B');
    characterArrayList.add('\u265C');
    characterArrayList.add('\u265D');
    characterArrayList.add('\u265E');
    characterArrayList.add('\u265F');
    characterArrayList.add(' ');


        Scanner scanner = new Scanner(new File(pathName));
        int row = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            if (parts.length != 8){
                throw new InvalidChessBoardException("Oszlop hiba");
            }
            for (String part : parts) {
                char ch = part.toCharArray()[0];
                if (!characterArrayList.contains(ch)) {
                    throw new InvalidChessBoardException("Karakter hiba");
                }
            }
            row++;
        }
        if (row != 8){
            throw new InvalidChessBoardException("Sor hiba");
        }
    }

}

package _1103_Artists;

import java.util.ArrayList;

public class Artist {

    private String name;
    private int yearOfThePrize;
    private String highestPrizeName;
    private ArrayList<String> occupation = new ArrayList<>();

    public Artist(String name, int yearOfThePrize, String highestPrizeName) {
        this.name = name;
        this.yearOfThePrize = yearOfThePrize;
        this.highestPrizeName = highestPrizeName;
    }

    public Artist(String name, int yearOfThePrize) {
        this.name = name;
        this.yearOfThePrize = yearOfThePrize;
    }

    public String getName() {
        return name;
    }

    public int getYearOfThePrize() {
        return yearOfThePrize;
    }

    public String getHighestPrizeName() {
        return highestPrizeName;
    }

    public ArrayList<String> getOccupation() {
        return occupation;
    }




    @Override
    public String toString() {
        return  name + "\n" +
                "yearOfThePrize: " + yearOfThePrize + "\n" +
                "highestPrizeName: " + highestPrizeName + "\n" +
                "occupation: " + occupation + "\n";
    }

}

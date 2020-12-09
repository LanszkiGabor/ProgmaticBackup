package _1123_OkosOtthon;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    static FirstFloor firstFloor = new FirstFloor();
    static GroundFloor groundFloor = new GroundFloor();

    static ArrayList<SmartHome> arrayListHome = new ArrayList<>();
    static {
        arrayListHome.add(firstFloor);
        arrayListHome.add(groundFloor);
    }


    public static void main(String[] args) {
        System.out.println("Fűtés nélküli ház:");
        System.out.println("|");
        firstFloor.makeMyHome();
        System.out.println(firstFloor);
        groundFloor.makeMyHome();
        System.out.println(groundFloor);

        System.out.println("Fűtött ház:");
        turnTheHeat();

        System.out.println("Szellőztetés:");
        letFreshAirIn();

    }

    static void turnTheHeat(){
        System.out.println("Í");
        for (SmartHome smartHome : arrayListHome) {
            smartHome.heatOn = true;
            smartHome.closeAllTheNyilaszaro();
            System.out.println(smartHome);
        }
    }

    static void letFreshAirIn(){
        for (SmartHome smartHome : arrayListHome) {
            smartHome.openTheSmallWindows();
            System.out.println(smartHome);
        }
    }









}

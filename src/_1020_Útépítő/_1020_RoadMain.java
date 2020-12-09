package _1020_Útépítő;

import java.io.FileNotFoundException;

public class _1020_RoadMain {
    public static void main(String[] args) throws FileNotFoundException {
        _1020_RoadReadAndMethodClass roadReadAndMethodClass = new _1020_RoadReadAndMethodClass();
        roadReadAndMethodClass.readFromFile();
        // roadReadAndMethodClass.whichCityToward();
        // System.out.println(roadReadAndMethodClass.howManySecDifference());
        roadReadAndMethodClass.howManyVehiclesInTheExactHour();
    }
}

package _1113_Öröklődés;

import _1012_Bicikli._1012_Biciklis;

public class CityBike extends Bike {

    private boolean isLightOn;

    public CityBike(double wheelDiameter, int actualGear, int frontCogWheelCogNr, int[] rearCogWheelCogNrs) {
        super(wheelDiameter, actualGear, frontCogWheelCogNr, rearCogWheelCogNrs);
    }


    public void switchLight() {
        isLightOn = !isLightOn;
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public String useTheBell() {
        return "Tim-Tim-Tim";
    }

}

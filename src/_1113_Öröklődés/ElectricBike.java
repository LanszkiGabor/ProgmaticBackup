package _1113_Öröklődés;

public class ElectricBike extends Bike{

    private boolean isCharged;
    private double engine = 10;

    public ElectricBike(double wheelDiameter, int actualGear, int frontCogWheelCogNr, int[] rearCogWheelCogNrs) {
        super(wheelDiameter, actualGear, frontCogWheelCogNr, rearCogWheelCogNrs);
    }



    @Override
    public double getSpeed(double cadence) {
        return super.getSpeed(cadence);
    }
}

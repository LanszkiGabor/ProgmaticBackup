package _1113_Öröklődés;

public class Bike {
    private double wheelDiameter;
    private int actualGear;
    private int frontCogWheelCogNr;
    private int[] rearCogWheelCogNrs;

    public Bike(double wheelDiameter, int actualGear, int frontCogWheelCogNr, int[] rearCogWheelCogNrs) {
        this.wheelDiameter = wheelDiameter;
        this.actualGear = actualGear;
        this.frontCogWheelCogNr = frontCogWheelCogNr;
        this.rearCogWheelCogNrs = rearCogWheelCogNrs;
    }

    public void setGear(int i){
        this.actualGear = i;
    }

    public double getSpeed(double cadence) {
        double speedInCmPerMin = (double)frontCogWheelCogNr / (double)rearCogWheelCogNrs[actualGear] * cadence * wheelDiameter * Math.PI;
        double speedInKmPerH = speedInCmPerMin / 100E3 * 60;
        return speedInKmPerH;
    }

    public int nrOfGears(){
        return rearCogWheelCogNrs.length;
    }



}

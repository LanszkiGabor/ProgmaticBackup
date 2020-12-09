package _1118_Járművek;

public class Truck implements Vehicles {

    int speed = 100;
    int weight = 10000;
    int seats = 4;
    int capacityOfBoot = 10;


    @Override
    public int getMaxSpeed() {
        return speed;
    }

    @Override
    public int getMaximumWeight() {
        return weight;
    }

    @Override
    public int getNumberOfSeats() {
        return seats;
    }

    @Override
    public int getCapacityOfBoot() {
        return capacityOfBoot;
    }

    @Override
    public int getCalcPrice(int age) {
        return 0;
    }
}

package _1118_Járművek;

public class SportAuto implements Vehicles {

    int speed = 300;
    int weight = 500;
    int seats = 2;
    int capacityOfBoot = 2;


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

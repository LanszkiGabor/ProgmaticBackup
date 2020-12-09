package _1118_Járművek;

public class SUV implements Vehicles{

    int speed = 150;
    int weight = 1000;
    int seats = 6;
    int capacityOfBoot = 5;


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

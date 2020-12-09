package _1021_Autó;

import java.util.ArrayList;

public class _1021_CarService {
    private ArrayList<_1021_Car> parkingLot;
    private int income;

    public _1021_CarService() {
        parkingLot = new ArrayList<>(6);
        income = 0;
    }

    public void addNewCar(_1021_Car c) {
        if (parkingLot.size() < 6) {
            parkingLot.add(c);
        }
    }

    public boolean repairNextCar() {
        if (parkingLot.size() > 0) {
            _1021_Car car = parkingLot.get(0);
            for (_1021_Tire t : car.getTires()) {
                if (t.hasHole()) {
                    t.fixHole();
                }
                t.pump();
            }
            if (car.getEngine().getOilLevel() < 100) {
                car.getEngine().fillOil();
            }
            pay(car);
            parkingLot.remove(0);
            return true;
        }
        return false;
    }

    public void pay(_1021_Car car) {
        income += car.getEngine().isDiesel() ? 12000 : 11000;
    }

    public int countRemainingCars() {
        return parkingLot.size();
    }

    public int getIncome() {
        return income;
    }
}

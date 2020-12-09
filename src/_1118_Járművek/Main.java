package _1118_Járművek;

public class Main {
    public static void main(String[] args) {
        SportAuto sportAuto1 = new SportAuto();
        SportAuto sportAuto2 = new SportAuto();
        SUV suv1 = new SUV();
        SUV suv2 = new SUV();
        Truck truck1 = new Truck();
        Truck truck2 = new Truck();

        System.out.println(getTargetCustomer(sportAuto1));

    }

    public static String getTargetCustomer(Vehicles vh){
        if (vh.getMaxSpeed() > 200 && vh.getNumberOfSeats() <= 2){
            System.out.println("A sportautót ajánlom");
        } else if (vh.getCapacityOfBoot() > 5 && vh.getMaximumWeight() > 900){
            System.out.println("A teherautót ajánlom");
        } else if (vh.getNumberOfSeats() > 4){
            System.out.println("Az apukaautót ajánlom");
        }
        return "";
    }
}

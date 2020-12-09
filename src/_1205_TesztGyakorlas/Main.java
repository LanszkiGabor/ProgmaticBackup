package _1205_TesztGyakorlas;

public class Main {
    public static void main(String[] args) {
        AverageList averageList = new AverageList();
        averageList.add(1);
        averageList.add(2);
        averageList.add(3);
        averageList.add(4);
        averageList.add(5);

        System.out.println(averageList.averageValue());
    }
}

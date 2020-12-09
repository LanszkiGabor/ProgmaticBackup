package _1105_Kocsma;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pub pub = new Pub(100000, new ArrayList<Drink>());
        pub.getStorage().add(new Drink("wine",300, 20));
        System.out.println(pub.purchaseDrink("p"));
    }
}

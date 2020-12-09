package _0921_0927_Elágazás_Ciklus;

public class Elagazasok2 {
    public static void main(String[] args) {
        int myAge = 5;
        if (0 > myAge) {
            System.out.println("Hello Marty McFly");
        }
        if (0 <= myAge && myAge <= 3) {
            System.out.println("bruu-bruu-bruu");
        }
        if (3 < myAge && myAge <= 10) {
            System.out.println("szia");
        }
        if (10 < myAge && myAge <= 20) {
            System.out.println("Csá");
        }
        if (20 < myAge){
            System.out.println("Jó napot kívánok!");
        }
    }
}

package _1117_Intelligens_Letformak_Interface;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        DullTherapist dullTherapist = new DullTherapist();
        LazyTherapist lazyTherapist = new LazyTherapist();


        //System.out.println(parrot.communication("Hello"));
        //System.out.println(dullTherapist.communication("Szia"));
        System.out.println(lazyTherapist.communication("Hello"));

    }
}

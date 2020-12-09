package _1116_Állatkert;

public class Cat extends Mammal {

    private boolean domesticated;

    public Cat(String type, String location, int age, String voice, boolean domesticated) {
        super(type, location, age, voice);
        this.domesticated = domesticated;
    }

    public boolean isDomesticated() {
        return domesticated;
    }

    public void setDomesticated(boolean domesticated) {
        this.domesticated = domesticated;
    }


}

package _1116_Állatkert;

public class Mammal extends Animal{
    public Mammal(String type, String location, int age, String voice) {
        super(type, location, age, voice);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", voice='" + voice + '\'' +
                '}';
    }
}

package _1116_Állatkert;

public class Animal {

    protected String type;
    protected String location;
    protected int age;
    protected String voice;


    public Animal(String type, String location, int age, String voice) {
        this.type = type;
        this.location = location;
        this.age = age;
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", voice='" + voice + '\'' +
                '}';
    }
}

package _1116_Állatkert;

public class Bird extends Animal {
    
    protected int windsLength;

    public Bird(String type, String location, int age, String voice, int windsLength) {
        super(type, location, age, voice);
        this.windsLength = windsLength;
    }



    @Override
    public String toString() {
        return "Bird{" +
                "windsLength=" + windsLength +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", age=" + age +
                ", voice='" + voice + '\'' +
                '}';
    }
}


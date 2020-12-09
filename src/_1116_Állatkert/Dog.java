package _1116_Állatkert;

public class Dog extends Mammal {

    private boolean likeToPlay;

    public Dog(String type, String location, int age, String voice, boolean likeToPlay) {
        super(type, location, age, voice);
        this.likeToPlay = likeToPlay;
    }

    public boolean isLikeToPlay() {
        return likeToPlay;
    }

    public void setLikeToPlay(boolean likeToPlay) {
        this.likeToPlay = likeToPlay;
    }

    public void funWithTheDogClass(){
        System.out.println("Eldobtam a kutyának a csontot");
        System.out.println("Visszahozza");
    }
}

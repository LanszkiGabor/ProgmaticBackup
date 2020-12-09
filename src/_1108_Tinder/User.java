package _1108_Tinder;

import java.util.ArrayList;

public class User {

    enum Sex {MALE, FEMALE}
    enum Hair {BLONDE, BLACK, BROWN, RED}
    enum Eye {GREEN, BROWN, GRAY, BLUE}

    private int ID;
    private String name;
    private Sex sex;
    private int age;
    private Hair hair;
    private Eye eye;
    private ArrayList<Swipe> likes;
    private ArrayList<Swipe> dislikes;


    public User(int ID, String name, String sex, int age, String hair, String eye) {
        this.ID = ID;
        this.name = name;
        this.sex = Sex.valueOf(sex);
        this.age = age;
        this.hair = Hair.valueOf(hair);
        this.eye = Eye.valueOf(eye);
        this.likes = new ArrayList<>();
        this.dislikes = new ArrayList<>();
    }

    public boolean isFemale(){
        return this.sex == Sex.FEMALE;
    }

    public void addSwipe (Swipe swipe){
        if (swipe.isLike()){
            this.likes.add(swipe);
        }
        else {
            this.dislikes.add(swipe);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", hair=" + hair +
                ", eye=" + eye +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public Eye getEye() {
        return eye;
    }

    public void setEye(Eye eye) {
        this.eye = eye;
    }

    public ArrayList<Swipe> getLikes() {
        return likes;
    }

    public void setLikes(ArrayList<Swipe> likes) {
        this.likes = likes;
    }

    public ArrayList<Swipe> getDislikes() {
        return dislikes;
    }

    public void setDislikes(ArrayList<Swipe> dislikes) {
        this.dislikes = dislikes;
    }
}

package _1106_Pets;

import java.util.ArrayList;

public class PetOwner {

    private String name;
    private int age;
    private String sex;
    private ArrayList<Pet> pets;

    public PetOwner(String name, int age, String sex, ArrayList<Pet> pets) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "PetOwner{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", pets=" + pets +
                '}';
    }
}

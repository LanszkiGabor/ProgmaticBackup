package _1027_Indián;

import _1119_Enum.Gender;

import java.util.HashSet;

public class _1027_IndianClass {

    private String name;
    private String tribe;
    private Gender gender;
    private int age;
    private HashSet<String> belongings;

    public _1027_IndianClass(String name, String tribe, Gender gender, int age, HashSet<String> belongings) {
        this.name = name;
        this.tribe = tribe;
        this.gender = gender;
        this.age = age;
        this.belongings = belongings;
    }

    @Override
    public String toString() {
        return "_1027_IndianClass{" +
                "name='" + name + '\'' +
                ", tribe='" + tribe + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", belongings=" + belongings +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTribe() {
        return tribe;
    }

    public void setTribe(String tribe) {
        this.tribe = tribe;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HashSet<String> getBelongings() {
        return belongings;
    }

    public void setBelongings(HashSet<String> belongings) {
        this.belongings = belongings;
    }
}

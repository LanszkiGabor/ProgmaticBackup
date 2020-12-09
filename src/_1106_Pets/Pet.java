package _1106_Pets;

import java.util.ArrayList;

public class Pet {

    private int identifier;
    private String name;
    private String type;
    private int age;
    private PetOwner petOwner;

    public Pet(int identifier, String name, String type, int age) {
        this.identifier = identifier;
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PetOwner getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(PetOwner petOwner) {
        this.petOwner = petOwner;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }
}

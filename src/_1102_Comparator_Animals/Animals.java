package _1102_Comparator_Animals;

import java.util.ArrayList;

public class Animals {

    private String name;
    private String type;
    private double weight;
    private double maxSpeed;
    private double averageLifeLength;
    private ArrayList<String> locations;


    public Animals(String name, String type, double weight, double maxSpeed, double averageLifeLength, ArrayList<String> locations) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.averageLifeLength = averageLifeLength;
        this.locations = locations;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getAverageLifeLength() {
        return averageLifeLength;
    }

    public void setAverageLifeLength(double averageLifeLength) {
        this.averageLifeLength = averageLifeLength;
    }

    public ArrayList<String> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", averageLifeLength=" + averageLifeLength +
                ", locations=" + locations +
                '}';
    }
}

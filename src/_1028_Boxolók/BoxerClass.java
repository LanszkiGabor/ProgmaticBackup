package _1028_Boxolók;

public class BoxerClass {

    private String name;
    private String nationality;
    private int weight;
    private int weightLossOneDayMax;
    private int weightLossMax;

    public BoxerClass(String name, String nationality, int weight, int weightLossOneDayMax, int weightLossMax) {
        this.name = name;
        this.nationality = nationality;
        this.weight = weight;
        this.weightLossOneDayMax = weightLossOneDayMax;
        this.weightLossMax = weightLossMax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeightLossOneDayMax() {
        return weightLossOneDayMax;
    }

    public void setWeightLossOneDayMax(int weightLossOneDayMax) {
        this.weightLossOneDayMax = weightLossOneDayMax;
    }

    public int getWeightLossMax() {
        return weightLossMax;
    }

    public void setWeightLossMax(int weightLossMax) {
        this.weightLossMax = weightLossMax;
    }

    @Override
    public String toString() {
        return  name;
    }

    public int myWeightCategory(){
        int[] weightCategories = {52, 57, 63, 71, 79, 91};
        int weightCategory = -1;
        for (int i = 0; i < weightCategories.length; i++) {
            if(weight <= weightCategories[i]){
                weightCategory = i;
                break;
            }
            if(weight > weightCategories[weightCategories.length-1]){
                weightCategory = weightCategories.length;
                break;
            }
        }
        return weightCategory;
    }
}

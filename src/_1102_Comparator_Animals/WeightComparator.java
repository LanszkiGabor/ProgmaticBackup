package _1102_Comparator_Animals;

import java.util.Comparator;

public class WeightComparator implements Comparator<Animals> {

    @Override
    public int compare(Animals o1, Animals o2) {
        if(o1.getWeight() > o2.getWeight()){
            return 1;
        }
        if(o1.getWeight() < o2.getWeight()){
            return -1;
        }
        return 0;
    }
}

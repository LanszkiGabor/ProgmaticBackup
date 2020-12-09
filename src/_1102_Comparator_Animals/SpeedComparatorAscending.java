package _1102_Comparator_Animals;

import java.util.Comparator;

public class SpeedComparatorAscending implements Comparator<Animals> {

    @Override
    public int compare(Animals o1, Animals o2) {
        if(o1.getMaxSpeed() > o2.getMaxSpeed()){
            return 1;
        }
        if(o1.getMaxSpeed() < o2.getMaxSpeed()){
            return -1;
        }
        return 0;
    }
}

package _1205_TesztGyakorlas;
import java.util.ArrayList;

public class AverageList extends ArrayList{

    public int averageValue(){
        int sum = 0;
        for (Object o : this) {
             sum += (int) o;
        }
        return sum/this.size();
    }
    /*public <T extends Converting>  AverageList(Class<T> converting)  {

    }

    private */

}

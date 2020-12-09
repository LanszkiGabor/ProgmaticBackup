package _1103_Artists;

import java.util.Comparator;

public class ABC_Comparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

package Órai_Példák;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _1026_List {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            list.add((int) Math.random() * 20);
        }
        deleteEvenNums(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
    /* public static void deleteEvenNums(List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            if(i % 2 == 0){
                nums.remove(i);
            }
        }
    } */
        public static void deleteEvenNums(List<Integer> list){
            Iterator<Integer> iterator = list.iterator();
            while(iterator.hasNext()){
                Integer number = iterator.next();
                if(number % 2 == 0){
                    iterator.remove();
                }
            }
        }



    }


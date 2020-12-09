package Órai_Példák;

import java.util.ArrayList;

public class _1026_PersonMain {
    public static void main(String[] args) {
        ArrayList<_1026_Person> person = new ArrayList<>();
        person.add(new _1026_Person("Józsi", 25, 70, 170));
        person.add(new _1026_Person("Marci", 26,69,171));
        person.add(new _1026_Person("Mark",28,75,180));

        System.out.println(minWeight(person));

    }

    public static int minWeight(ArrayList<_1026_Person> person){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < person.size(); i++) {
            if(person.get(i).getWeight() < min){
                min = person.get(i).getWeight();
            }
        }
        return min;
    }

    /* public static void deleteEvenNums(List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            if(i % 2 == 0){
                nums.remove(i);
            }
        }
    } */

     /* public static void deleteEvenNums(List<Integer> numbers){
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            if(number % 2 == 0){
                iterator.remove();
            }
        }
    } */




}

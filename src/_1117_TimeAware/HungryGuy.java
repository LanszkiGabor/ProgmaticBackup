package _1117_TimeAware;

import java.time.LocalTime;

public class HungryGuy implements TimeAware {
    @Override
    public LocalTime localTime() {
        LocalTime actualTime = LocalTime.now();
        LocalTime breakfastTime1 = LocalTime.parse("07:00:00");
        LocalTime breakfastTime2 = LocalTime.parse("08:00:00");
        LocalTime lunchTime1 = LocalTime.parse("12:00:00");
        LocalTime lunchTime2 = LocalTime.parse("13:00:00");
        LocalTime dinnerTime1 = LocalTime.parse("16:00:00");
        LocalTime dinnerTime2 = LocalTime.parse("17:00:00");
        if (actualTime.isAfter(breakfastTime1) && actualTime.isBefore(breakfastTime2)){
            System.out.println("Juhhuuu reggeliidő");
        } else if (actualTime.isAfter(lunchTime1) && actualTime.isBefore(lunchTime2)){
            System.out.println("Juhhuuu ebédidő");
        } else if (actualTime.isAfter(dinnerTime1) && actualTime.isBefore(dinnerTime2)){
            System.out.println("Juhhuuu vacsoraidő");
        } else {
            System.out.println("De éhes vagyok");
        }
        return actualTime;
    }
}

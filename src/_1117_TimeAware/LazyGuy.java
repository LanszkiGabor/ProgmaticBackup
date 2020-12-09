package _1117_TimeAware;

import java.time.LocalTime;

public class LazyGuy implements TimeAware {


    @Override
    public LocalTime localTime() {
        LocalTime localTime1 = LocalTime.parse("20:00:00");
        LocalTime localTime2 = LocalTime.parse("11:00:00");
        LocalTime actualTime = LocalTime.now();
        if (actualTime.isBefore(localTime2)) {
            System.out.println("Hagyj aludni");
            return actualTime;
        } else if (actualTime.isAfter(localTime1)) {
            System.out.println("Hagyj alduni");
            return actualTime;
        }
        System.out.println("Kösz, hogy szóltál");
        return actualTime;
    }
}

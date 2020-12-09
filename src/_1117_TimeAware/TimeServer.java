package _1117_TimeAware;

import java.time.LocalTime;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class TimeServer implements TimeAware {

    @Override
    public LocalTime localTime() {
        return null;
    }

    /**
     * @author progmatic
     */

    private static final List<TimeAware> TIME_AWARES = new ArrayList<>();
    private static final int PERIOD_IN_SEC = 10;

    static {
        TIME_AWARES.add(new LazyGuy());
        TIME_AWARES.add(new HungryGuy());
    }

    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                for (TimeAware timeAware : TIME_AWARES) {
                    if (timeAware instanceof LazyGuy){
                        System.out.println(timeAware.localTime());
                    } else if (timeAware instanceof HungryGuy){
                        System.out.println(timeAware.localTime());
                    }
                }
            }
        };
        Timer timer = new Timer();
        Date startAt = new Date();
        timer.scheduleAtFixedRate(task, startAt, PERIOD_IN_SEC * 1000);
    }
}




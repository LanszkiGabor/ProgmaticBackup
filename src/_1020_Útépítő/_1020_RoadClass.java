package _1020_Útépítő;

public class _1020_RoadClass {

    private int hour;
    private int minute;
    private int sec;
    private int time;
    private String fromWhere;



    public _1020_RoadClass(int hour, int minute, int sec, int time, String fromWhere){
        this.hour = hour;
        this.minute = minute;
        this.sec = sec;
        this.time = time;
        this.fromWhere = fromWhere;

    }


    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSec(){
        return sec;
    }

    public int getTime(){
        return time;
    }

    public String getFromWhere() {
        return fromWhere;
    }
}

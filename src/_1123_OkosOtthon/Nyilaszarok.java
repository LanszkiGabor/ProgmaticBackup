package _1123_OkosOtthon;

public class Nyilaszarok {

    protected boolean isItOpen;

    public Nyilaszarok() {
       double x = Math.random();
        if (x > 0.5){
            isItOpen = true;
        } else {
            isItOpen = false;
        }
    }

    public void openWindow(){
        isItOpen = true;
    }
}

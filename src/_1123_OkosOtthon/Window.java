package _1123_OkosOtthon;

public class Window extends Nyilaszarok {

    protected boolean isItSmall;

    public Window() {
       double x = Math.random();
       if (x > 0.5){
           isItSmall = true;
       } else {
           isItSmall = false;
       }
    }

    public boolean isItSmall() {
        return isItSmall;
    }

    @Override
    public String toString() {
        if (this.isItOpen){
            return "\u25A1";
        } return "\u25A0";
    }
}

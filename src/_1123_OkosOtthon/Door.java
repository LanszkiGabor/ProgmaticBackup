package _1123_OkosOtthon;

public class Door extends Nyilaszarok {

    @Override
    public String toString() {
       if (this.isItOpen){
           return "\u25AF";
       } return "\u25AE";
    }
}

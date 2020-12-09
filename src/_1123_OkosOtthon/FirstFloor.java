package _1123_OkosOtthon;

public class FirstFloor extends SmartHome{


    public FirstFloor(boolean heatOn) {
        super(heatOn);
    }

    public FirstFloor() {
        super();
    }

    @Override
    public void makeMyHome() {
        for (int i = 0; i < 4; i++) {
            nyilaszarokArrayList.add(new Window());
        }
    }

    @Override
    public String toString() {
        return "" + nyilaszarokArrayList;
    }
}

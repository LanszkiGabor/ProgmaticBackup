package _1123_OkosOtthon;

public class GroundFloor extends SmartHome{


    public GroundFloor(boolean heatOn) {
        super(heatOn);
    }

    public GroundFloor() {

    }

    @Override
    public void makeMyHome() {
        for (int i = 0; i < 3; i++) {
            nyilaszarokArrayList.add(new Window());
        }
        nyilaszarokArrayList.add(new Door());
    }

    @Override
    public String toString() {
        return "" + nyilaszarokArrayList;
    }
}

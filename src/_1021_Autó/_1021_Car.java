package _1021_Autó;

public class _1021_Car {
    private _1021_Tire[] tires = new _1021_Tire[4];
    private _1021_Engine engine;

    public _1021_Car() {
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new _1021_Tire();
        }
        engine = new _1021_Engine();
    }

    public _1021_Tire[] getTires() {
        return tires;
    }

    public _1021_Engine getEngine() {
        return engine;
    }

    /*
    public boolean getStatus() {
        return getEngineStatus() && getTiresStatus();
    }

    public boolean getEngineStatus() {

    }

    public boolean getTiresStatus() {

    }
    */
}

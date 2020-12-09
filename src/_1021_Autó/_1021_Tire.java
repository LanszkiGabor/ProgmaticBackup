package _1021_Autó;

public class _1021_Tire {
    private float pressure;
    private boolean hasHole;

    public _1021_Tire() {
        if (Math.random() < 0.05) {
            hasHole = true;
            pressure = 0;
        } else {
            // hasHole = false;
            pressure = (float) (Math.random() * 3);
        }
    }

    public void pump() {
        if (! hasHole) {
            pressure = 3;
        }
    }

    public void fixHole() {
        hasHole = false;
    }

    public boolean hasHole() {
        return hasHole;
    }
}

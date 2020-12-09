package _1116_Absztrakt_Öröklődés;

public class ThreePoint extends Point {

    protected int z;

    public ThreePoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    protected void doubleTheValues() {
        super.doubleTheValues();
        setZ(z * 2);
        System.out.println(x + " " + y + " " + z);
    }

}

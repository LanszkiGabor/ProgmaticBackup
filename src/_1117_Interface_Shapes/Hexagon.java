package _1117_Interface_Shapes;

public class Hexagon implements Shape{

    private float sideLength;

    public Hexagon(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public float getCircumference() {
        return sideLength * 6;
    }

    @Override
    public float getArea() {
        return (float) ((Math.sqrt(3) / 4 * (sideLength * sideLength))) * 6;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "sideLength=" + sideLength +
                '}';
    }
}

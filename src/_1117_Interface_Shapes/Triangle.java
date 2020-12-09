package _1117_Interface_Shapes;

public class Triangle implements Shape{

    private float sideLength;


    public Triangle(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public float getCircumference() {
        return sideLength * 3;
    }

    @Override
    public float getArea() {
        return (float) (Math.sqrt(3) / 4 * (sideLength * sideLength));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideLength=" + sideLength +
                '}';
    }
}

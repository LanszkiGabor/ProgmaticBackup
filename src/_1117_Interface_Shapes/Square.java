package _1117_Interface_Shapes;

public class Square implements Shape {

    private float sideLength;

    public Square(float sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public float getCircumference() {
        return sideLength * 4;
    }

    @Override
    public float getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideLength=" + sideLength +
                '}';
    }
}

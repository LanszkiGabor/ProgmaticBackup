package _1117_Interface_Shapes;

public class Circle implements Shape{

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getCircumference() {
        return (float) ((float) 2*radius * Math.PI);
    }

    @Override
    public float getArea() {
        return (float) ((float) radius * radius * Math.PI);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

package _1116_Absztrakt_Öröklődés;

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected void doubleTheValues(){
        setX(x * 2);
        setY(y * 2);
        System.out.println(x + " " + y);
    }
}

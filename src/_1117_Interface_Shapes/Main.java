package _1117_Interface_Shapes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws FileNotFoundException {


        Circle circle1 = new Circle(5);
        Square square1 = new Square(6);
        Triangle triangle1 = new Triangle(7);
        Hexagon hexagon1 = new Hexagon(8);

        List<Shape> shapeList = readFile();

        // printInfo(hexagon1);
        // System.out.println(readFile());
        System.out.println(getLargestShape(shapeList));
    }


    static void printInfo(Shape s){
        System.out.println("Alakzat kerülete: " + s.getCircumference());
        System.out.println("Alakzat területe: " + s.getArea());
        if (s.getArea() > s.getCircumference()){
            System.out.println("Kövér");
        } else if (s.getArea() < s.getCircumference()){
            System.out.println("Sovány");
        } else if (s.getArea() == s.getCircumference()) {
            System.out.println("Perfekt");
        }
        System.out.println("Arány: " + s.getCircumference() / s.getArea());
    }

    public static List<Shape> readFile() throws FileNotFoundException {
        List<Shape> shapeList = new ArrayList<>();
        Scanner scanner = new Scanner(new File("Files/shapes.csv"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            switch (parts[0]){
                case "0":
                    shapeList.add(new Circle(Float.parseFloat(parts[1])));
                    break;
                case "3":
                    shapeList.add(new Triangle(Float.parseFloat(parts[1])));
                    break;
                case "4":
                    shapeList.add(new Square(Float.parseFloat(parts[1])));
                    break;
                case "6":
                    shapeList.add(new Hexagon(Float.parseFloat(parts[1])));
            }
        }
        return shapeList;
    }

    public static Shape getLargestShape(List<Shape> shapes){
        float max = 0;
        Shape theLargest = null;
        for (Shape shape : shapes) {
            if (shape.getArea() > max){
                max = shape.getArea();
                theLargest = shape;
            }
        }
        return theLargest;
    }



}

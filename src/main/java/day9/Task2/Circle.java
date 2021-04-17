package day9.Task2;

public class Circle extends Figure{
    private int radius;
    public final static double PI = Math.PI;

    public Circle(int radius, String color){
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}

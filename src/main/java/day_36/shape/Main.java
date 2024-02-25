package day_36.shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(8,5);
        Rectangle rectangle = new Rectangle(5,7);

        circle.calculateArea();
        triangle.calculate();
        rectangle.calculateArea();

    }

}

package day_36.shape;

public class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius =radius;
    }
    public void calculateArea(){
        System.out.println(Math.PI*radius*radius);
    }
}

package day_36.shape;

public class Triangle extends Shape{
    double height;
    double base;

    public Triangle(double height,double base){
        this.base = base;
        this.height = height;
    }
    public void calculate(){
        System.out.println("area"+(base*height)/2);
    }
}

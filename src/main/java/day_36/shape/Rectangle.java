package day_36.shape;

public class Rectangle extends Shape{
    int length;
    int with;

    public Rectangle(int length, int with){
        this.length = length;
        this.with = with;
    }
    public void calculateArea(){
        System.out.println("area"+ length*with);
    }
}

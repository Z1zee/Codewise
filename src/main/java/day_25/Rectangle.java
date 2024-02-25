package day_25;


public class Rectangle {
    double width;
    double length;
    public static void main (String[] args){
        Rectangle num1 = new Rectangle();
        Rectangle num2 = new Rectangle();
        num1.width = 5;
        num1.length = 6;
        num1.calculateArea();
        num1.calculatePerimeter();
        num2.width = 2;
        num2.length = 3;
        num2.calculateArea();
        num2.calculatePerimeter();
    }
    public void calculateArea(){
        System.out.println(length*width);
    }
    public void calculatePerimeter(){
        System.out.println(2 * (length + width));


    }
}



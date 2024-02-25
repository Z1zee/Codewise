package day_25;

public class Car {
    String make;
    double price;
    int year;
    String color;

    public void run(){
        System.out.println(make +"Running");
    }
    public void carInfo(){
        System.out.println(make);
        System.out.println(price);
        System.out.println(year);
        System.out.println(color);
        System.out.println();
    }
    public static void main(String[] args) {
          Car mercedes = new Car();
       mercedes.make = "Mercedes";
//        mercedes.price = 5000;
//        mercedes.year = 2020;
//        mercedes.color = "red";
        mercedes.run();
        mercedes.carInfo();
//        System.out.println(mercedes.make);
//        System.out.println(mercedes.price);
//        System.out.println(mercedes.year);
//        System.out.println(mercedes.color);

        Car toyota = new Car();
        toyota.make = "Toyota";
        toyota.price = 2500;
        toyota.year = 2018;
        toyota.color = "white";
        toyota.run();
        toyota.carInfo();
//        System.out.println(toyota);
//        System.out.println(toyota.price);
//        System.out.println(toyota.year);
//        System.out.println(toyota.color);

        Car lexus = new Car();
        lexus.make = "Lexus";
        lexus.price = 1500;
        lexus.year = 2010;
        lexus.color = "yellow";
        lexus.run();
        lexus.carInfo();
//        System.out.println(lexus.make);
//        System.out.println(lexus.price);
//        System.out.println(lexus.year);
//        System.out.println(lexus.color);
    }
}



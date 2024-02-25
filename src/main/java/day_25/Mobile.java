package day_25;

public class Mobile {
    String model;
    double price;
    String memory;

    public static void main(String[] args) {
        Mobile phone1 = new Mobile();
        Mobile phone2 = new Mobile();
        Mobile phone3 = new Mobile();
        phone1.model = "Samsung ";
        phone2.model = "Iphone ";
        phone3.model = "RedMi ";

        phone1.ring();
        phone1.turnOn();
        phone1.turnOff();

        phone2.ring();
        phone2.turnOn();
        phone2.turnOff();

        phone3.ring();
        phone3.turnOn();
        phone3.turnOff();

    }
    public void ring(){
        System.out.println(model+ "ringing");
    }
    public void turnOn(){
        System.out.println(model+ "turning On");
    }
    public void turnOff(){
        System.out.println(model+"turning Off");
        System.out.println();
    }
}

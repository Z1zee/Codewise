package day_26;

public class Smartphone {
    String brand;
    String model;
    int price;
    int memory;
    boolean isSold;
    public Smartphone(String brand,String model,int price,int memory,boolean isSold){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memory = memory;
        this.isSold = isSold;
    }
    public Smartphone(String brand,String model,int price,int memory){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.memory = memory;
    }
    public void SmartphoneDetails(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
        System.out.println(memory);
        System.out.println(isSold);
        System.out.println();
    }
    public static void main(String[] args) {
     Smartphone smartphone = new Smartphone("Apple","Iphone13",1000,256,true);
     Smartphone smartphone2 = new Smartphone("Apple","Iphone13",1000,512);
     smartphone.SmartphoneDetails();
     smartphone2.SmartphoneDetails();
    }
}

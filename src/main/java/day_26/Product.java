package day_26;

public class Product {
    String name;
    double price;
    int quantity;
    public Product(String name,double price,int quantity){
        this.name = name;
        this.price =price;
        this.quantity = quantity;
    }
    public Product(int quantity){
        this.quantity = quantity;
    }
    public void ProductInfo(){
        System.out.println("Name:"+name);
        System.out.println("price:"+price);
        System.out.println("quantity:"+quantity);
    }
    public static void main(String[] args) {
        Product product = new Product("Apple",5.0,10);
        Product product2 = new Product(10);
        product.ProductInfo();
        product2.ProductInfo();
    }
}

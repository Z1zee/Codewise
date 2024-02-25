package day_34.nosuper;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("dog",5,"black","sdsdsd");
        Cat cat = new Cat("Cat",4,"red");
        System.out.println(dog.dogHasOnly);
        System.out.println(cat.name);
    }
}

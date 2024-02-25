package day_36.overriding;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cow cow =new Cow();
        Dog dog = new Dog();

        cow.animalSound();
        dog.animalSound();

        Animal dog1 = new Dog();

        ArrayList<Animal> list = new ArrayList<>();
        dog.bark();


    }
}

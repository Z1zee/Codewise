package day_34.supew;

import day_34.supew.Animal;

public class Cat extends Animal {
    public Cat (String name,int age,String color){
        super(name, age, color);
        System.out.println("Cat constructor");
    }
}

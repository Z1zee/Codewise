package day_34.supew;

import day_34.supew.Animal;

public class Dog extends Animal {

    public Dog (String name,int age,String color){
        super(name, age, color);
        System.out.println("Dog constructor");
    }
}

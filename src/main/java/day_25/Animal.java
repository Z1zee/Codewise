package day_25;

public class Animal {
    String name;
    int age;
    String color;
    public void animalInfo(){
        System.out.println("name "+ name);
        System.out.println("age "+ age);
        System.out.println("color "+ color);
    }
    public void eat(){
        System.out.println(name + "is eating");
    }
    public void sleep(){
        System.out.println(name+ "is slepping");
        System.out.println();

    }
    public static void main(String[] args){
        Animal animal1 = new Animal();
        animal1.name = "Lion ";
        animal1.age = 5;
        animal1.color = "black ";

        Animal animal2 = new Animal();
        animal2.name = "Python ";
        animal2.age = 10;
        animal2.color = "green ";

        Animal animal3 = new Animal();
        animal3.name = "Dog ";
        animal3.age = 4;
        animal3.color = "white ";

        Animal animal4 = new Animal();
        animal4.name = "Horse ";
        animal4.age = 7;
        animal4.color = "black ";

        animal1.animalInfo();
        animal1.eat();
        animal1.sleep();

        animal2.animalInfo();
        animal2.eat();
        animal2.sleep();

        animal3.animalInfo();
        animal3.eat();
        animal3.sleep();

        animal4.animalInfo();
        animal4.eat();
        animal4.sleep();
    }
}

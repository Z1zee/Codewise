package day_25;

public class Student {
    String StudentId;
    String name;
    int age;
    String gradLevel;
    double GPA;
    String major;

    public static void main (String[] args){
        Student mike = new Student();
        mike.name = "Mike";
        System.out.println(mike.name);
        mike.study();

        Student sara = new Student();
        sara.name = "Sara";
        System.out.println(sara.name);
        sara.study();

        Student john = new Student();
        john.name = "John";
        System.out.println(john.name);
        john.study();
    }
    public void study(){
        System.out.println("studying");
    }
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("Sleeping");
    }
}

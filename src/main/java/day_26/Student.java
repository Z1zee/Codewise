package day_26;

public class Student {
    String name;
    int age;
    String gender;
    double gpa;
    public Student(String name,int age,String gender,double gpa){
       this.name = name;
    }
    public static void main(String[] args){
        Student student = new Student("mike",15,"male",3.9);
        student.name ="Mike";
        student.age = 15;
        student.gender ="male";
        student.gpa = 3.9;
    }
}

package day_26.task;

import java.util.Arrays;
import java.util.Scanner;

public class student {
    String name;
    int id;
    int age;
    int[] grades = new int[3];
    String car;
    public student(String name,int id,int age,int[] grades,String car){
        this.name =name;
        this.id = id;
        this.age = age;
        this.grades = grades;
        this.car = car;
    }
    public student(String name,int id,int age,int[] grades){
        this.name =name;
        this.id = id;
        this.age = age;
        this.grades = grades;
        this.car = "no car";
    }
    public void studentCases(){
        System.out.println(name+", "+ id+ " ,"+ age+" ,"+ Arrays.toString(grades)+" "+car);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter details for student1");
        System.out.print("name ");
        String student1Name = scanner.nextLine();
        System.out.print("ID: ");
        int student1Id = scanner.nextInt();
        System.out.print("Age: ");
        int student1Age = scanner.nextInt();
        System.out.print("Grades: ");
        int[] student1Grades = new int [3];
        for (int i = 0;i<student1Grades.length;i++){
            student1Grades[i] = scanner.nextInt();
        }
        scanner.nextLine();
        System.out.println("Car brand: ");
        String student1Car = scanner.nextLine();
        student student1 = new student(student1Name, student1Id, student1Age, student1Grades, student1Car);


        System.out.println("enter details for student2");
        System.out.print("name ");
        String student2Name = scanner.nextLine();
        System.out.print("ID: ");
        int student2Id = scanner.nextInt();
        System.out.print("Age: ");
        int student2Age = scanner.nextInt();
        System.out.print("Grades: ");
        int[] student2Grades = new int [3];
        for (int i = 0;i<student2Grades.length;i++){
            student1Grades[i] = scanner.nextInt();
        }
        scanner.nextLine();
        System.out.println("Car brand: ");
        String student2Car = scanner.nextLine();
        student student2 = new student(student2Name, student2Id, student2Age, student2Grades, student2Car);

        System.out.println("enter details for student3");
        System.out.print("name ");
        String student3Name = scanner.nextLine();
        System.out.print("ID: ");
        int student3Id = scanner.nextInt();
        System.out.print("Age: ");
        int student3Age = scanner.nextInt();
        System.out.print("Grades: ");
        int[] student3Grades = new int [3];
        for (int i = 0;i<student3Grades.length;i++){
            student1Grades[i] = scanner.nextInt();
        }
        scanner.nextLine();
        System.out.println("Car brand: ");
        String student3Car = scanner.nextLine();
        student student3 = new student(student3Name, student3Id, student3Age, student3Grades, student3Car);
        student1.studentCases();
        student2.studentCases();
        student3.studentCases();
    }
}

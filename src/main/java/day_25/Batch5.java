package day_25;

public class Batch5 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Mike";
        Student student2 = new Student();
        student2.name= " Sara";
        Student student3 = new Student();
        student3.name = "John";

        //String[] names = {"Ann", "John"};
        Student[] student = {student1, student2, student3};
        System.out.println();
        for (int i = 0;i<student.length;i++){
            if (student[i].name.length()>=6){
                System.out.println(student[i].name);

            }

        }
    }
}

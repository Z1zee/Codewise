package day_34.person;

public class student extends person {
    int grade;
    String favoriteSubject;

    public student(String name, int age, String gender ,String address,int grade, String favoriteSubject) {
        super(name, age, gender, address);
        this.grade = grade;
        this.favoriteSubject = favoriteSubject;
    }
    public void study(){
        System.out.println(name+ " is studying");
    }
}

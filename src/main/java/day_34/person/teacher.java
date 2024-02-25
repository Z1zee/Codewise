package day_34.person;

public class teacher extends person {
    String subject;
    int yearExperience;

    public teacher(String name, int age, String gender,String address,String subject, int yearExperience) {
        super(name,age,gender,address);
        this.subject = subject;
        this.yearExperience = yearExperience;
    }
}

package day_34.person;

public class person {
    String name;
    int age;
    String gender;
    String address;

    public person(String name,int age,String gender,String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void eat(){
        System.out.println("eating");
    }


}


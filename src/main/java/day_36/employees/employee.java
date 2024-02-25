package day_36.employees;

public class employee {
    int id;
    String name;
    double salary;

    public employee(int id, String name,double salary ){
        this.id = id;
        this.name = name;
        this.salary=salary;


    }public  void calculateSalary(){
        System.out.println(salary);
    }
}

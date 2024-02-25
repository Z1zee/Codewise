package day_36.employees;

public class fulltimemployee extends employee{
    int bonus;
    public fulltimemployee(int id,String name,double salary,int bonus){
        super(id, name, salary);
        this.bonus = bonus;
    }public void cLCULteSalary(){
        System.out.println("full time emp salary"+ (salary+bonus));
    }
}

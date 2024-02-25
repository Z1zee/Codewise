package day_36.employees;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        fulltimemployee fe = new fulltimemployee(1,"mike",8000,500);
        ContractEmployee ce = new ContractEmployee(2,"adam",2000,400,5000);

        fe.calculateSalary();
        ce.calculateSalary();
        ce.calculateSalary(60,900);
        ArrayList<employee>employees = new ArrayList<>();

    }
}

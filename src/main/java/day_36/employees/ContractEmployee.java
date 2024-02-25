package day_36.employees;

public class ContractEmployee extends employee {

    int contractDuration;
    int hourlyRate;

    public ContractEmployee(int id , String name, double salary, int contractDuration,int hourlyRate){
        super(id,name,hourlyRate*165);
        this.contractDuration=contractDuration;
        this.hourlyRate=hourlyRate;
    }
    public void calculateSalary(){
        System.out.println("Contract salary: "+ hourlyRate*165);
    }
    public void calculateSalary(double hourlyRete, int  hourWorked){
        System.out.println("contract emp earned"+ hourlyRete*hourWorked);
    }
}

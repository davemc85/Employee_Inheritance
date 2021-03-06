package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary){
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name != null && !name.equals("")) {
            this.name = name;
        }
    }

    public String getNationalInsuranceNumber(){
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber){
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void raiseSalary(double amount){
        if(amount > 0) {
            this.salary += amount;
        }
    }

    public double payBonus(){
        return (this.salary * 0.01);
    }
}

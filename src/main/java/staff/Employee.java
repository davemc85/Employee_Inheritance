package staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceINumber;
    private double salary;

    public Employee(String name, String nationalInsuranceINumber, double salary) {
        this.name = name;
        this.nationalInsuranceINumber = nationalInsuranceINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if( name != null) {
            this.name = name;
        }
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceINumber;
    }

    public void setNationalInsuranceINumber(String nationalInsuranceINumber) {
        this.nationalInsuranceINumber = nationalInsuranceINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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

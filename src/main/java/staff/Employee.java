package staff;

public class Employee {
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary){
        this.name = name;
        this.niNumber=niNumber;
        this.salary=salary;
    }

    public Double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public void raiseSal(Double money){
         this.salary += money;
    }

    public Double payBonus(){
     Double bonus = this.salary *=0.1;
     return bonus;
    }
}

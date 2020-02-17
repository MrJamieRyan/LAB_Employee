package Staff;

public abstract class Employee {
    public String name;
    public String niNumber;
    public int salary;


    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    };
    public String getNiNumber(){
        return this.niNumber;
    };
    public int getSalary(){
        return this.salary;
    };
    
    public void raiseSalary (double raiseAmount) {
         this.salary += raiseAmount;
    }
    
    public void payBonus() {
       int bonus = (int) (this.salary * 0.01);
       salary += bonus;
    }
}
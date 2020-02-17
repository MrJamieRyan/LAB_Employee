package Staff;

import com.sun.istack.internal.NotNull;

public abstract class Employee {
    public String name;
    public String niNumber;
    public int salary;

    public Employee(String name, String niNumber, int salary) {
        if (name == null) this.name ="Please Enter Name";
    }
    {
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
        if(raiseAmount < 0){
            System.out.println("Cannot Decrease Pay");
        }
            else this.salary += raiseAmount;
    }
    
    public void payBonus() {
       int bonus = (int) (this.salary * 0.01);
       salary += bonus;
    }
}
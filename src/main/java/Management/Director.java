package Management;

import Staff.Employee;

public class Director extends Staff.Employee {

    private String deptName;
    private int budget;

    public Director(String name, String niNumber, int salary, String deptname
            , int budget) {
        super(name, niNumber, salary);
        this.deptName = deptname;
        this.budget = budget;
    }
    public String getName(){
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public int getSalary() {
        return this.salary;
    }

    public String getDeptName() {
        return this.deptName;
    }

    public int getBudget(){
        return this.budget;
    }
    @Override
    public void payBonus() {
        int bonus = (int) (this.salary * 0.02);
        salary += bonus;
    }
}

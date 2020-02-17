package Management;

import Staff.Employee;

public class Manager extends Staff.Employee {

    private String deptName;

    public Manager(String name, String niNumber, int salary, String deptname) {
        super(name, niNumber, salary);
        this.deptName = deptname;
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
}

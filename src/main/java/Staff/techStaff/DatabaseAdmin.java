package Staff.techStaff;

import Staff.Employee;

public class DatabaseAdmin extends Employee {

    public DatabaseAdmin(String name, String niNumber, int salary) {
        super(name, niNumber, salary);
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
}

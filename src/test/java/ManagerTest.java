import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Management.Manager manager;

    @Before
    public void before() {
        this.manager  = new Manager("Bob", "BB1234567N", 30000,
            "Finance");
    }

    @Test
    public void nameCannotBeNull(){
        this.manager  = new Manager(null, "BB1234567N", 30000,
                "Finance");
        assertEquals("Please Enter Name", manager.getName());
    }
// @NotNull a possibilty?
    @Test
    public void canGetEmployeeName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canGetEmployeeNiNumber(){
        assertEquals("BB1234567N", manager.getNiNumber());
    }

    @Test
    public void canGetEmployeeSalary(){
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canGetEmployeeDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary( 10);
        assertEquals(30010, manager.getSalary());
    }

    @Test
    public void cannotApplyNegativeNumbers(){
        manager.raiseSalary( -10);
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canGiveBonus(){
        manager.payBonus();
        assertEquals(30300, manager.getSalary());
    }
}


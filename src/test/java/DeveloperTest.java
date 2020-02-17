import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        this.developer = new Developer("Ross", "RR1234567N", 25000);
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Ross", developer.getName());
    }

    @Test
    public void canGetEmployeeNiNumber() {
        assertEquals("RR1234567N", developer.getNiNumber());
    }

    @Test
    public void canGetEmployeeSalary() {
        assertEquals(25000, developer.getSalary());
    }


    @Test
    public void canIncreaseSalary() {
        developer.raiseSalary(10);
        assertEquals(25010, developer.getSalary());
    }

    @Test
    public void canGiveBonus() {
        developer.payBonus();
        assertEquals(25250, developer.getSalary());
    }
}
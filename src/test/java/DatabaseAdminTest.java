import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        this.databaseAdmin = new DatabaseAdmin("Jamie", "JJ1234567N", 20000);
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Jamie", databaseAdmin.getName());
    }

    @Test
    public void canGetEmployeeNiNumber() {
        assertEquals("JJ1234567N", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetEmployeeSalary() {
        assertEquals(20000, databaseAdmin.getSalary());
    }


    @Test
    public void canIncreaseSalary() {
        databaseAdmin.raiseSalary(10);
        assertEquals(20010, databaseAdmin.getSalary());
    }

    @Test
    public void canGiveBonus() {
        databaseAdmin.payBonus();
        assertEquals(20200, databaseAdmin.getSalary());
    }
}
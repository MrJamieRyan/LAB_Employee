import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        this.director = new Director("Kevin", "KK1234567N", 90000,
                "Board", 1000000);
    }

    @Test
    public void canGetEmployeeName() {
        assertEquals("Kevin", director.getName());
    }

    @Test
    public void canGetEmployeeNiNumber() {
        assertEquals("KK1234567N", director.getNiNumber());
    }

    @Test
    public void canGetEmployeeSalary() {
        assertEquals(90000, director.getSalary());
    }

    @Test
    public void canGetEmployeeDeptName() {
        assertEquals("Board", director.getDeptName());
    }

    @Test
    public void canIncreaseSalary() {
        director.raiseSalary(10);
        assertEquals(90010, director.getSalary());
    }

    @Test
    public void canGiveBonus() {
        director.payBonus();
        assertEquals(91800, director.getSalary());
    }
}
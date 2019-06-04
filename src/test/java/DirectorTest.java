import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DirectorTest {

    private Director director;

    @Before

    public void setUp() {
        director = new Director("Lynn", "LS246810A", 75000, "software", 1000000);
    }

    @Test
    public void hasName() {
        assertEquals("Lynn", director.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("LS246810A", director.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(75000, director.getSalary(), 1);
    }

    @Test
    public void hasDept() {
        assertEquals("software", director.getDeptName());
    }

    @Test
    public void canGetPayRise() {
        director.raiseSalary(3000);
        assertEquals(78000, director.getSalary(), 1);
    }


    @Test
    public void canGetBudget() {
        assertEquals(1000000, director.getBudget(), 1);
    }

    @Test
    public void canGetDirectorBonus() {
        assertEquals(1500, director.payBonus(), 1);
    }

    @Test
    public void setNameCanNotBeNull(){
        director.setName(null);
        assertEquals("Lynn", director.getName());
        assertNotNull(director.getName());
    }
}
import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ManagerTest{

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("David", "DM123456A", 26000, "management");
    }

    @Test
    public void hasName() {
        assertEquals("David", manager.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("DM123456A", manager.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(26000, manager.getSalary(), 1);
    }

    @Test
    public void hasDepartment() {
        assertEquals("management", manager.getDeptName());
    }

    @Test
    public void canGetPayRise() {
        manager.raiseSalary(1000);
        assertEquals(27000, manager.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(260, manager.payBonus(),1);
    }

    @Test
    public void payRiseCanNotBeNegative() {
        manager.raiseSalary(-10000);
        assertEquals(26000, manager.getSalary(), 1);
    }

    @Test
    public void setNameCanNotBeNull() {
        manager.setName(null);
        assertEquals("David", manager.getName());
    }
}
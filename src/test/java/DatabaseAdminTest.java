import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin databaseAdmin;

    @Before

    public void setUp() {
        databaseAdmin = new DatabaseAdmin("Ken", "KT987654A", 20000);
    }

    @Test
    public void hasName() {
        assertEquals("Ken", databaseAdmin.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("KT987654A", databaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(20000, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canSetSalary(){
        databaseAdmin.setSalary(25000);
        assertEquals(25000, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canGetPayRise() {
        databaseAdmin.raiseSalary(1000);
        assertEquals(21000, databaseAdmin.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(200, databaseAdmin.payBonus(),1);
    }
}
import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before

    public void setUp() {
        developer = new Developer("Beth", "BC135790A", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Beth", developer.getName());
    }

    @Test
    public void hasNationalInsuranceNumber() {
        assertEquals("BC135790A", developer.getNationalInsuranceNumber());
    }

    @Test
    public void canSetNationalInsuranceNumber(){
        developer.setNationalInsuranceNumber("AE112233A");
        assertEquals("AE112233A", developer.getNationalInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, developer.getSalary(), 1);
    }

    @Test
    public void canGetPayRise() {
        developer.raiseSalary(2500);
        assertEquals(32500, developer.getSalary(), 1);
    }

    @Test
    public void canGetBonus() {
        assertEquals(300, developer.payBonus(),1);
    }
}
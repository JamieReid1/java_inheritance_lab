import management.Manager;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Jeff BloomHill", "PA172963E",
                23500.01, "Toys");
    }


    @Test
    public void canGetName(){
        assertEquals("Jeff BloomHill", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("PA172963E", manager.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(23500.01, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDepartment(){
        assertEquals("Toys", manager.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(24500.01, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(235.0001, manager.payBonus(), 0.01);
    }






}


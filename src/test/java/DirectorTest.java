import management.Director;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Frank Dudley", "hhshs",
                2500000, 47936374, "stupid");
    }

    @Test
    public void canGetName(){
        assertEquals("Frank Dudley", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("hhshs", director.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(2500000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDepartment(){
        assertEquals("stupid", director.getDepartment());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(1);
        assertEquals(2500001, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(25000, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(47936374, director.getBudget(), 0.01);
    }


}

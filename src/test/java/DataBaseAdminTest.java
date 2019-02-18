import org.junit.Before;
import org.junit.Test;
import techStaff.DataBaseAdmin;

import static org.junit.Assert.assertEquals;


public class DataBaseAdminTest {
    DataBaseAdmin dataBaseAdmin;



    @Before
    public void before() {
        dataBaseAdmin = new DataBaseAdmin("Bob Johnson", "ddd",
                500.01);
    }


    @Test
    public void canGetName(){
        assertEquals("Bob Johnson", dataBaseAdmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("ddd", dataBaseAdmin.getNationalInsuranceNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(500.01, dataBaseAdmin.getSalary(), 0.01);
    }



}


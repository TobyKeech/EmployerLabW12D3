import org.junit.Before;
import org.junit.Test;

import staff.management.Manager;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class TestDatabaseAdmin{
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() { databaseAdmin = new DatabaseAdmin("Bob","PB67676",
            20.000);}

    @Test
    public void testHasName(){
        assertEquals("Bob", databaseAdmin.getName() );
    }

    @Test
    public void testHasNinumber(){
        assertEquals("PB67676", databaseAdmin.getNiNumber());
    }

    @Test
    public void testHasSalary(){
        assertEquals(20.000, databaseAdmin.getSalary(), 0.002 );
    }

    @Test
    public void testRaiseSal(){
        databaseAdmin.raiseSal(2.000);
        assertEquals(22.000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void testCanPayBonus(){
        databaseAdmin.payBonus();
        assertEquals(2.000, databaseAdmin.getSalary(), 0.0000);
    }
}

import org.junit.Before;
import org.junit.Test;

import staff.management.Manager;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class TestDeveloper {
    Developer developer;

    @Before
    public void before() { developer = new Developer("Keith","PB4723284",
            100.000);}

    @Test
    public void testHasName(){
        assertEquals("Keith", developer.getName() );
    }

    @Test
    public void testHasNinumber(){
        assertEquals("PB4723284", developer.getNiNumber());
    }

    @Test
    public void testHasSalary(){
        assertEquals(100.000, developer.getSalary(), 0.002 );
    }

    @Test
    public void testRaiseSal(){
        developer.raiseSal(2.000);
        assertEquals(102.000, developer.getSalary(), 0.0);
    }

    @Test
    public void testCanPayBonus(){
        developer.payBonus();
        assertEquals(10.000, developer.getSalary(), 0.0000);
    }
}

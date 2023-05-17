import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class TestManager {
    Manager manager;

    @Before
    public void before() { manager = new Manager("T Keech","PB4722347",
            32.000, "Navy");}

    @Test
    public void testHasName(){
        assertEquals("T Keech", manager.getName() );
    }

    @Test
    public void testHasNinumber(){
        assertEquals("PB4722347", manager.getNiNumber());
    }

    @Test
    public void testHasSalary(){
        assertEquals(32.000, manager.getSalary(), 0.002 );
    }

    @Test
    public void testHasDeptname(){
        assertEquals("Navy", manager.getDeptName());
    }

    @Test
    public void testRaiseSal(){
        manager.raiseSal(2.000);
        assertEquals(34.000, manager.getSalary(), 0.0);
    }

    @Test
    public void testCanPayBonus(){
        manager.payBonus();
        assertEquals(3.200, manager.getSalary(), 0.0000);
    }

}

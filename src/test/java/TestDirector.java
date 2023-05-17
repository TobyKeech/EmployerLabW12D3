import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class TestDirector {
    Director director;

    @Before
    public void before() { director = new Director("Super Keith","PB32895",
            500.000, "Minstery of Defence", 1000000.000);}

    @Test
    public void testHasName(){
        assertEquals("Super Keith", director.getName() );
    }

    @Test
    public void testHasNinumber(){
        assertEquals("PB32895", director.getNiNumber());
    }

    @Test
    public void testHasSalary(){
        assertEquals(500.000, director.getSalary(), 0.002 );
    }

    @Test
    public void testHasDeptname(){
        assertEquals("Minstery of Defence", director.getDeptName());
    }

    @Test
    public void testHasBudget(){
        assertEquals(1000000.000, director.getBudget(), 0.000000);
    }

    @Test
    public void testRaiseSal(){
        director.raiseSal(2.000);
        assertEquals(502.000, director.getSalary(), 0.0);
    }

    @Test
    public void testCanPayBonus(){
        director.payBonus();
        assertEquals(50, director.getSalary(), 0.0000);
    }

}
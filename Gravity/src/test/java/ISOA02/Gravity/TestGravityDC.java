package ISOA02.Gravity;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestGravityDC {

	private gravity_problem g;

	@Before
	public void init() throws DividedByZeroException, InvalidValueException {
		g = new gravity_problem(1,1,1);
	}

	  @Test(expected = DividedByZeroException.class)
	    public void testSetDistance() throws DividedByZeroException, InvalidValueException {
	    	g.setDistance(0);
	    }

	    @Test(expected = InvalidValueException.class)
	    public void testSetBodyMass1() throws DividedByZeroException, InvalidValueException {
	    	g.setBodyMass1(-1);    
	    }
	    
	    @Test(expected = InvalidValueException.class)
	    public void testSetBodyMass2() throws DividedByZeroException, InvalidValueException { 
	    	g.setBodyMass2(-1);    
	    }

    @Test
    public void testCalculateForce() throws DividedByZeroException, InvalidValueException {
        gravity_problem problem = new gravity_problem(5.0, 10.0, 2.0);
        double force = problem.calculate_force();
        double expected = (6.67*Math.pow(10, -11)*5*10)/(2.0*2.0);
        assertEquals(expected, force, 0.00);
    }
}

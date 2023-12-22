package ISOA02.Gravity;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


public class TestGravityEachUse {

	  
    @Test(expected = InvalidValueException.class)
	    public void testGravity1() throws DividedByZeroException, InvalidValueException {
	            gravity_problem g = new gravity_problem (0,1,1);
	            assertEquals(0, g.getBodyMass1());
	            assertEquals(1, g.getBodyMass2());
	            assertEquals(1, g.getDistance());
	            double result=(6.67*Math.pow(10, -11)*0*1)/(1*1);
	            assertEquals(result, g.calculate_force());
	    }
	  
	  @Test
	    public void testGravity2() throws DividedByZeroException, InvalidValueException {
	            gravity_problem g = new gravity_problem (1.0,1.0,1.0);
	            assertEquals(1.0, g.getBodyMass1(),0.000001);
	            assertEquals(1.0, g.getBodyMass2(),0.000001);
	            assertEquals(1.0, g.getDistance(),0.000001);
	            double result=(6.67*Math.pow(10, -11)*1*1)/(1*1);
	            assertEquals(result, g.calculate_force(),0.000001);
	    }

	    @Test(expected = InvalidValueException.class)
	    public void testGravity3() throws DividedByZeroException, InvalidValueException {
	            gravity_problem g = new gravity_problem (1,-1,1);
	            assertEquals(1, g.getBodyMass1());
	            assertEquals(-1, g.getBodyMass2());
	            assertEquals(1, g.getDistance());
	            double result=(6.67*Math.pow(10, -11)*1*-1)/(1*1);
	            assertEquals(result, g.calculate_force());
	    }

	  @Test(expected = DividedByZeroException.class)
	    public void testGravity4() throws DividedByZeroException, InvalidValueException {
	            gravity_problem g = new gravity_problem (1,1,0);
	            assertEquals(1, g.getBodyMass1());
	            assertEquals(1, g.getBodyMass2());
	            assertEquals(0, g.getDistance());
	            double result=(6.67*Math.pow(10, -11)*1*1)/(0);
	            assertEquals(result, g.calculate_force());
	    }
	  
	    @Test(expected = InvalidValueException.class)
	    public void testGravity5() throws DividedByZeroException, InvalidValueException {
	            gravity_problem g = new gravity_problem (1,1,-5);
	            assertEquals(1, g.getBodyMass1());
	            assertEquals(1, g.getBodyMass2());
	            assertEquals(-5, g.getDistance());
	            double result=(6.67*Math.pow(10, -11)*1*1)/(-5*-5);
	            assertEquals(result, g.calculate_force());
	    }
}

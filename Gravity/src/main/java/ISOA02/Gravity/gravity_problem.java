package ISOA02.Gravity;

public class gravity_problem {
	
	private double m1; // Mass of Body1
	private double m2; // Mass of Body2
	private double d; // Distance between Body1 & Body2
	
	final private double G=6.67*Math.pow(10, -11);
	
	public gravity_problem(double m1, double m2, double d) {
		this.m1=m1;
		this.m2=m2;
		this.d=d;
	}
	
	public double calculate_force() throws DividedByZeroException, InvalidValueException{
		if(d==0) {
			throw new DividedByZeroException();
		}
		if(d<0) {
			throw new InvalidValueException();
		}
		if(m2<=0) {
			throw new InvalidValueException();	
		}
		if(m1<=0) {
			throw new InvalidValueException();
		}
		return (G*m1*m2)/(d*d);
	}
}

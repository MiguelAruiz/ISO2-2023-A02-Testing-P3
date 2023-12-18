package ISOA02.Gravity;

public class gravity_problem {
	
	private double m1; // Mass of Body1
	private double m2; // Mass of Body2
	private double d; // Distance between Body1 & Body2
	
	final private double G=6.67*Math.pow(10, -11);
	
	public gravity_problem(double m1, double m2, double d) throws DividedByZeroException, InvalidValueException {
		this.setBodyMass1(m1);
		this.setBodyMass2(m2);
		this.setDistance(d);
	}
	
	public double getBodyMass1() {
		return this.m1;
	}
	
	public double getBodyMass2() {
		return this.m2;
	}
	
	public double getDistance() {
		return this.d;
	}
	
	public void setBodyMass1(double newMass1) throws InvalidValueException {
		if(newMass1 < 0) {
			throw new InvalidValueException();
		}
		this.m1 = newMass1;
	}
	
	public void setBodyMass2(double newMass2) throws InvalidValueException{
		if(newMass2 < 0) {
			throw new InvalidValueException();
		}
		this.m2 = newMass2;
	}
	
	public void setDistance(double newDistance) throws DividedByZeroException, InvalidValueException{
		if(newDistance == 0) {
			throw new DividedByZeroException();
		}else if(newDistance < 0) {
			throw new InvalidValueException();
		}
		
		this.d = newDistance;
	}
	
	public double calculate_force() {
		return (G*this.m1*this.m2)/(this.d*this.d);
	}
	
	
}

package ISOA02.Gravity;

public class gravity_calc {
	
	private double m1; // Mass of Body1
	private double m2; // Mass of Body2
	private double d; // Distance between Body1 & Body2
	
	final private double G=6.67*(10^-11);
	
	public gravity_calc(double m1, double m2, double d) {
		this.m1=m1;
		this.m2=m2;
		this.d=d;
	}
	
	public double calculate_force() {
		return (G*m1*m2)/(d*d);
	}
}

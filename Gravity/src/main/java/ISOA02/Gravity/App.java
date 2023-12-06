package ISOA02.Gravity;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
	static Scanner s=new Scanner(System.in);
  public static void main(String[] args) {
	  
	  double m1 = 0;
	  double m2 = 0;
	  double d = 0;
	  
	  try {
	  System.out.println("Introduce the mass value for Body1 (Kg):");
	  m1=s.nextDouble();
	  System.out.println("Introduce the mass value for Body2 (Kg):");
	  m2=s.nextDouble();
	  System.out.println("Introduce the distance value between Body1 and Body2 (Meters):");
	  d=s.nextDouble();
	  
	  }catch(InputMismatchException e) {
		  System.out.println("InputMismatchException: the value introduced is not valid.");
		  return;
	  }
	  
	  gravity_problem gv=new gravity_problem(m1,m2,d);
	  try {
		  double force = gv.calculate_force();
		  System.out.println("The total force is "+force+ " Newtons.");
	  }catch(DividedByZeroException e) {
		  System.out.println("DividedByZeroException: D cannot be zero.");
	  }catch(InvalidValueException e) {
		  System.out.println("InvalidValueException: no value can be negative.");
	  }
	  
  }
}

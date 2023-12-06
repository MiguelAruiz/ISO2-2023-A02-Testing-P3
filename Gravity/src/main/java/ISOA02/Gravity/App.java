package ISOA02.Gravity;
import java.util.InputMismatchException;
import java.util.Scanner;
import reading.Read;

public class App {
	static Scanner s=new Scanner(System.in);
  public static void main(String[] args) {
	  
	  double m1 = 0;
	  double m2 = 0;
	  double d = 0;
	  
	  try {
	  System.out.print("Introduce the mass value for Body1 (Kg):");
	  m1=Read.read_double();
	  System.out.print("Introduce the mass value for Body2 (Kg):");
	  m2=Read.read_double();
	  System.out.print("Introduce the distance value between Body1 and Body2 (Meters):");
	  d=Read.read_double();
	  
	  }catch(InputMismatchException e) {
		  System.out.print("InputMismatchException: the value introduced is not valid.");
		  return;
	  }
	  
	  gravity_problem gv=new gravity_problem(m1,m2,d);
	  try {
		  double force = gv.calculate_force();
		  System.out.print("The total force is "+force+ " Newtons.");
	  }catch(DividedByZeroException e) {
		  System.out.print("DividedByZeroException: D cannot be zero.");
	  }catch(InvalidValueException e) {
		  System.out.print("InvalidValueException: no value can be negative.");
	  }
	  
  }
}

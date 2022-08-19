import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
	
	Scanner adder = new Scanner(System.in);
		
	double x;
	double y;
	double add;
	double sub;
	double mult;
	double div;
	
	System.out.println("X : ");
	x = adder.nextDouble();
	System.out.println("Y : ");
	y = adder.nextDouble();
	
	add = Math.abs(x+y);
	sub = Math.abs(x-y);
	mult = Math.abs(x*y);
	div = Math.abs(x/y);
	
	System.out.println("Sum: "+add);
	System.out.println("Difference: "+sub);
	System.out.println("Product: "+mult);
	System.out.println("Qoutient: "+div);
	
	adder.close();
	}

}

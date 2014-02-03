/* Enter name CS120
   Description of the functionality of the program.*/



import java.util.*;

public class MathStuff {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

		System.out.println ((5+3)*5);
		System.out.println (100/3);
		System.out.println (100%3);
		System.out.println (100/3.0);


		System.out.print ("Enter an integer:  ");
		int x = in.nextInt ();
		System.out.print ("Enter a double:  ");
		double y = in.nextDouble();

		System.out.println ("The sum is:  "+(x+y));
		System.out.println ("The difference is:  "+(x-y));
		System.out.println ("The product is:  "+x*y);
		System.out.println ("The quotient is:  "+x/y);


		System.out.print ("Enter the radius of a circle:  ");
		double r = in.nextDouble();
		//double area = Math.PI*r*r;
		double area = Math.PI*Math.pow(r,2);
		System.out.println ("The area is "+area+".");

		System.out.print ("Enter the area of a square:  ");
		area = in.nextDouble ();
		//double side = Math.sqrt (area);
		double side = Math.pow (area,0.5);
		System.out.println ("The side of the square is "+side+".");

		//System.out.println (Math.sqrt (-100));
		//System.out.println (12/0);

	}
}
/* Stephen Douglas Willson CS120
   This program is designed to ask the user for the radius
   and height of a cone and print out the volume and surface area.*/



import java.util.*;

public class Cone {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

		System.out.print ("Enter the radius of the cone:  ");
		double r = in.nextDouble ();
		System.out.print ("Enter the height of the cone:  ");
		double h = in.nextDouble ();
		double volume = (1.0/3.0)*Math.PI*r*r*h;
		double s = Math.sqrt ((h*h)+(r*r));
		double area = Math.PI*r*(r+s);
        System.out.println ("The volume is "+volume+". The surface area is "+area+".");
	}
}
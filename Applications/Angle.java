/* Stephen Douglas Willson CS120
   This program is designed to ask the user for the lengths of all sides of a
   triangle and, given that information, print out the size of the largest angle.*/



import java.util.*;

public class Angle{

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

	System.out.print ("Enter a side:  ");
	double s1 = in.nextDouble ();
	System.out.print ("Enter another side:  ");
	double s2 = in.nextDouble ();
	System.out.print ("Enter the third side:  ");
	double s3 = in.nextDouble ();
	double la1 = 180/Math.PI * Math.acos ((s2*s2+s3*s3-s1*s1)/(2*s2*s3));
	double la2 = 180/Math.PI * Math.acos ((s1*s1+s3*s3-s2*s2)/(2*s1*s3));
	double la3 = 180/Math.PI * Math.acos ((s1*s1+s2*s2-s3*s3)/(2*s1*s2));
	if (s1 >= s2 && s1 >= s3)
	System.out.println ("The largest angle is "+la1+" degrees.");
	else if (s2 >= s1 && s2 >= s3)
	System.out.println ("The largest angle is "+la2+" degrees.");
	else if (s3 >= s1 && s3 >= s2)
	System.out.println ("The largest angle is "+la3+" degrees.");


	}
}
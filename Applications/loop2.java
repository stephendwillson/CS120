import java.util.*;

public class loop2 {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

		System.out.println ("Please enter a number:  ");
		double d = in.nextDouble ();
		while (d < 0) {
			System.out.println ("You can't take the square root of a negative number.");
			System.out.print ("Try again:  ");
			d=in.nextDouble ();
		}
		System.out.println ("The square root of "+d+" is:  "+Math.sqrt (d));

		}
	}
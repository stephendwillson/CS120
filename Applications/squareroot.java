import java.util.*;

public class squareroot {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

	 System.out.print ("Please enter a number:  ");
	 double n = in.nextDouble ();
	 double prevguess = n,
	        currguess = 1;

	 while (Math.abs(prevguess-currguess) >= 1e-10) {

		 prevguess = currguess;
		 currguess = (n/currguess + currguess)/2;
	 }

	 System.out.println ("The square root of "+n+" is "+currguess);


 }
}
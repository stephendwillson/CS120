import java.util.*;

public class multilineif {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

	System.out.print ("Enter a number:  ");
	int n = in.nextInt ();
	if (n%2==0) {
		System.out.println (n+" is even.");
		System.out.println ("Yay!");
		System.out.println ("I like even numbers.");
} else {
	System.out.println (n+" is odd.");
	System.out.println ("Odd numbers are strange...that's why they call them that.");
}
	}
}
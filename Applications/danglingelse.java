import java.util.*;

public class danglingelse {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

		System.out.print ("Enter an integer:  ");
		int n = in.nextInt ();

		if (n%2==0) {

		if (n%3==0)
		System.out.println (n+" is divisible by both 2 and 3.");
		/*else ;*/      //enter an empty else or enclose inner if/else in braces
}
		else
		System.out.println (n+" is odd.");

	}
}
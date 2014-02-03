import java.util.*;

public class Age{

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

		System.out.print ("What year were you born?  ");
		int by = in.nextInt ();
		System.out.print ("What is the current year?  ");
		int cy = in.nextInt ();
		int a = cy-by;
		System.out.print ("Have you had your birthday yet this year?"  );
		String yn = in.next();
		if (yn.equals("no")) a = a-1;
		System.out.println ("You are "+a+" years old.");
	}
}
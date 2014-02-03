import java.util.*;

public class runningsum{

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

	System.out.print ("Enter a number:  ");
    int n = in.nextInt ();
	int sum = 0;

	for (int i=1; i <= n; i++)

	sum += 2*i-1;

	System.out.println ("The sum of the first "+n+" odd integers is "+sum);
	}
}
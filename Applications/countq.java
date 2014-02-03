import java.util.*;

public class countq{

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

	int ct = 0;
	System.out.print ("Please enter a string:  ");
			String line = in.nextLine();
		for (int i=0; i < line.length(); i++)
		if (line.charAt(i)=='Q'  || line.charAt(i)=='q')
		ct++;
		System.out.println ("There are "+ct+" q's in your string.");
	}
}
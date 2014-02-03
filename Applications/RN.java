/* Stephen Douglas Willson CS120
   This program is designed to ask the user for a real number. Given that real
   number, it will print out that same number as well as the root.*/


import java.util.*;

public class RN{

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {

System.out.print ("Enter a real number:  ");
double rn = in.nextDouble ();
System.out.println ("You entered "+rn+". The square root is "+(Math.sqrt (rn))+".");

}
}
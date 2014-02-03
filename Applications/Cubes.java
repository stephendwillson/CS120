/* Stephen Douglas Willson CS120
   This program's function is to ask the user for a positive integer.
   It will nag the user until a positive integer is entered. It will
   then add up all of the cubes from one to the integer entered and
   print out the sum of said cubes.*/


import java.util.*;

public class Cubes {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

System.out.print ("Enter a positive integer:  ");
int n = in.nextInt ();

while (n <= 0) {
	System.out.println ("No, a POSITIVE integer.");
	System.out.println ("Try again.");
	System.out.print ("Enter a positive integer:  ");
	n = in.nextInt ();
}

    int total = 0;
    for (int i=0; i <= n; i++)
    {
    total += (i*i*i);
	System.out.println ("The sum of the cubes from 1 to "+n+" is "+total+".");
	}




 }
}
/* Stephen Douglas Willson CS120
   This program is designed to, given the month and day, print out the
   day of the year.*/



import java.util.*;

public class DayOfYear {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

System.out.print ("Enter the month:  ");
int month = in.nextInt ();
	System.out.print ("Enter the day:  ");
int day = in.nextInt ();
if (month==1) System.out.println ("The day number of "+month+"/"+day+" is "+(day)+".");
else if (month==2) System.out.println ("The day number of "+month+"/"+day+" is "+(31+day)+".");
else if (month==3) System.out.println ("The day number of "+month+"/"+day+" is "+(59+day)+".");
else if (month==4) System.out.println ("The day number of "+month+"/"+day+" is "+(90+day)+".");
else if (month==5) System.out.println ("The day number of "+month+"/"+day+" is "+(120+day)+".");
else if (month==6) System.out.println ("The day number of "+month+"/"+day+" is "+(151+day)+".");
else if (month==7) System.out.println ("The day number of "+month+"/"+day+" is "+(181+day)+".");
else if (month==8) System.out.println ("The day number of "+month+"/"+day+" is "+(212+day)+".");
else if (month==9) System.out.println ("The day number of "+month+"/"+day+" is "+(243+day)+".");
else if (month==10) System.out.println ("The day number of "+month+"/"+day+" is "+(273+day)+".");
else if (month==11) System.out.println ("The day number of "+month+"/"+day+" is "+(304+day)+".");
else if (month==12) System.out.println ("The day number of "+month+"/"+day+" is "+(334+day)+".");

}
}
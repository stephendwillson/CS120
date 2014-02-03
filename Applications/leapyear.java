import java.util.*;

public class leapyear {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

  System.out.print ("Enter a year:  ");
  int y = in.nextInt ();
/*  if (y%400==0) System.out.println (y+" is a leap year.");
  else if (y%100==0) System.out.println (y+" is not a leap year.");
  else if (y%4==0) System.out.println (y+" is a leap year.");
  else System.out.println (y+" is not a leap year.");*/


  if (y%400==0 || (y%100 !=0 && y%4==0)) System.out.println (y+" is a leap year.");
  else System.out.println (y+" is not a leap year.");
 }
}

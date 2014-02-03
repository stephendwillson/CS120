import java.util.*;

public class method2 {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

  System.out.print ("Please enter a positive integer:  ");
  int n = in.nextInt ();
  if (IsASquare(n)) System.out.println (n+" is a perfect square.");
  else System.out.println (n+" is not a perfect square.");


   for (int i=1; i<= 1000; i++)
   if (IsASquare(i)) System.out.println (i);
 }

 public static boolean IsASquare (int i) { //used as part of an if statement

	 double d = Math.sqrt (i);
	 int s = (int)(d+1e-5); //minimizes chances of round-off error
	 int ns = s*s;
	 if (s*s==i)
	 return true;
	 else return false;


 }
}
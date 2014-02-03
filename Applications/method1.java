import java.util.*;

public class method1 {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

  System.out.print ("Please enter a positive integer:  ");
  int n = in.nextInt ();
  System.out.println ("The next perfect square after "+n+" is "+
                       NextPerfectSquare (n)+".");

   int d = NextPerfectSquare (17)+1;
   System.out.println (d); //prints out next perfect square and adds 1
   System.out.println (NextPerfectSquare (95));
   System.out.println (NextPerfectSquare (1030));
   //method allows NextPerfectSquare or whatever variable to be used over and over again

 }

 public static int NextPerfectSquare (int i) {

	 double d = Math.sqrt (i);
     int t = (int)(d+1e-5);
     int ns = (t+1)*(t+1); //squares next largest number
     return ns;  //kills the method and sends a value back to main



 }
}
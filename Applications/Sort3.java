/* Stephen Willson CS120
   This program is designed to ask the user to enter 3 floating-point numbers.
   The program will then, using methods, print out the numbers from smallest
   to largest.*/



import java.util.*;

public class Sort3 {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {  //sets returned doubles to a, b, and c and prints out returned smallest, middle, and largest doubles in order


     double a = GetDouble();
     double b = GetDouble();
     double c = GetDouble();

       System.out.println (Smallest (a,b,c));
       System.out.println (Middle (a,b,c));
       System.out.println (Largest (a,b,c));



                                         }

   public static double GetDouble () {  //this method gets doubles from the user and returns them to the main method; it will nag until a legitimate double is entered

      double numb = 0;
      System.out.print ("Please enter a double: ");
      while (true) {
      try         {
	       numb = Double.parseDouble (in.nextLine());
	       break; } catch (Exception e) {
			System.out.println ("Not a double.");
			                            }
				   }return numb;

								     }
   public static double Smallest (double a, double b, double c) { //this method returns whichever is the smallest double to the main method

	   if (a <= b && a <= c)
	      {return a;}
	   else
	   if (b <= a && b <= c)
	      {return b;}
	   else
	   if (c <= a && c <= b)
	      {return c;}
	   else {return 0;}
															    }

   public static double Largest (double a, double b, double c) { //this method returns whichever is the largest double to the main method

	   if (a >= b && a >= c)
	      {return a;}
	   else
	   if (b >= a && b >= c)
	      {return b;}
	   else
	   if (c >= a && c >= b)
	      {return c;}
	   else {return 0;}
															   }


   public static double Middle (double a, double b, double c) { //this method returns whichever is the middle double to the main method

	   if (a >= b && a <= c || a <= b && a >= c)
	      {return a;}
	   if (b >= a && b <= c || b <= a && b >= c)
	      {return b;}
	   if (c >= a && c <= b || c <= a && c >= b)
	      {return c;}
	   else {return 0;}



															  }



}
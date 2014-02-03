/* Stephen Douglas Willson CS120
   This program, given an initial deposit, prints out the total amount of money
   in the account each year over a 5 year span.*/



   import java.util.*;

   public class Money {

	   public static Scanner in = new Scanner (System.in);

	   public static void main (String[] args) {

		   System.out.print ("Enter the amount of the initial depost:  ");
		   double amount = in.nextDouble();
           double year1 = amount*.02+amount;
		   System.out.println ("After one year, there is $"+year1+".");
		   double year2 = year1*.02+year1;
		   System.out.println ("After two years, there is $"+year2+".");
		   double year3 = year2*.02+year2;
		   System.out.println ("After three years, there is $"+year3+".");
		   double year4 = year3*.02+year3;
		   System.out.println ("After four years, there is $"+year4+".");
		   double year5 = year4*.02+year4;
		   System.out.println ("After five years, there is $"+year5+".");

	   }
   }
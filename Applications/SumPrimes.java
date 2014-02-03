/* Stephen Willson CS120
   This program will ask the user for a positive integer and nag until the user gets it right.
   It will then add up the sum of all the prime numbers from 1 to the number entered and print
   it out.*/


import java.util.*;

public class SumPrimes {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {



   System.out.print ("Enter a positive integer:  ");
    int n = in.nextInt ();

    while (n <= 0) {
		System.out.println ("No, a POSITIVE integer. Try again.");
		System.out.print ("Enter a positive integer:  ");
		n = in.nextInt ();
                   } //will nag user until a positive int is entered

		System.out.println ("The sum of the primes up to "+n+" is "+(sumprimes(n)));
								         }

  public static int sumprimes (int n) { //adds up all numbers returned from IsPrime and returns value to main method

	  int sum = 0;
	  for (int i = 0; i <= n; i++)
	      if (IsPrime(i) && i != 1)
	      sum += i;  //adds each prime number to value of 'sum' with the exception of 1
	        return sum;

		                              }


  public static boolean IsPrime (int n) { //checks each number up to number entered for primality

	  for (int i = 2; i < n; i++)
	      if (n % i == 0)
	      return false; //will return false for numbers not prime and true for primes to 'sumprimes'
	      return true;
	                                       }
}

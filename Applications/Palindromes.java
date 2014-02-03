/* Stephen Willson CS120
   This program will ask the user how many words they would like to enter, nagging until a positive
   integer is entered. It will prompt them to enter in the words one by one. It will then take
   the palindromes entered and print them out in the reverse order of how they were entered. */


import java.util.*;

public class Palindromes {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {
		//words asked for one by one, calling StringSize for array size
		//palindromes printed out in reverse of order entered

     String[] array = new String[StringSize()];

	 for (int i=0; i < array.length; i++) {
		System.out.print ("Please enter a word:  ");
		array[i] = in.nextLine();
								         }

     for (int i = array.length; i > 0 ; i--){
      if (IsPalindrome(array[i-1]))
      	System.out.println ((array[i-1]));
										    }
										    }

	public static int StringSize () {
		//asks for number of words, nagging until a positive int or 0 is entered

	 System.out.print ("How many words would you like to enter?  ");
	  while (true)
	   try {
	   int stringsize = Integer.parseInt (in.nextLine());
	   while (stringsize < 0) {
	    System.out.println ("You can't enter a negative amount of words. Try again.");
		System.out.print ("How many words would you like to enter?  ");
		stringsize = Integer.parseInt (in.nextLine());
			                  }
		return stringsize;
		   } catch (Exception e) {
		System.out.print ("That wasn't an integer. Try again: ");
							     }
                                    }
    public static String Backwards (String str)  {
	   //reverses string and returns reversed string

	 String backwards = "";
	   for (int i=0; i < str.length(); i++)
	   backwards = str.charAt(i) + backwards;
	   return backwards;
                                                 }
    public static boolean IsPalindrome (String str) {
	   //checks reversed string against original string for equality, returning true if equal and not a single letter


	 if (Backwards(str).equalsIgnoreCase(str))
	 return true;
	 else return false;
	                                                }
}
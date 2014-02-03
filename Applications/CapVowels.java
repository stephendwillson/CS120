/* Stephen Douglas Willson CS120
   This program is designed to ask the user to enter in a string. It will
   take said string and check each letter one by one until each letter in
   the string is checked. If it's a vowel, it will be added to the output
   value as a capitalized vowel. If not, the 'else' line will run, adding
   the letter to the output value unaltered. The 'for' loop ends when each
   letter is checked and added. The program will then print out the 'outline'
   value after the loop is finished running.*/


import java.util.*;

public class CapVowels {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {





	 System.out.print ("Please enter a string:  ");
	 	 String line = in.nextLine ();
	 	 String outline = "";
	 	  for (int i=0; i < line.length(); i++)
		 	     {
		 	     if (line.charAt(i)  == 'a' ||  line.charAt(i)  == 'e' ||
		 	         line.charAt(i)  == 'i' ||  line.charAt(i)  == 'o' ||
		 	         line.charAt(i)  == 'u')
		 	        {
		 				outline += Character.toUpperCase(line.charAt(i));
		 	        }
		 	     else
		 	     {
		 			 outline += line.charAt(i) ;
		 		 }
		 	 }
      System.out.println (outline);



 }
}
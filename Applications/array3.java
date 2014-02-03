import java.util.*;

public class array3 {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {


	System.out.print ("How many strings would you like to enter?  ");
	int sz = Integer.parseInt (in.nextLine());
	//in.nextInt(); will also work...Integer.parseInt etc. reads in entire string, converts it to int
	String[] A = new String[sz];

	for (int i=0; i < A.length; i++) {
		System.out.println ("Please enter the "+(i+1)+"th. value:  "); //i+1 starts numbering at 1 instead of 0
		A[i] = in.nextLine();
		                             }
	for (int i=0; i < A.length; i++)
        System.out.println (A[i]);



    for (int i=0; i < A.length; i++) //A.length refers to length of array, not single string
        System.out.println (A[i].length()); //prints out number of characters in each string; A[i] is a particular string in the array of strings
                //need parentheses for string length, must be omitted for array length

       // System.out.println (A[3].charAt (1));


	for (int i=0; i < A.length; i++) //length of array
	 for (int j=0; j < A[i].length(); j++) //goes through each character in the array
	    System.out.println (A[i].charAt(j));
}
}
import java.util.*;

public class array1 {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {



	/*int[] A = new int[10];  //'A' represents several ints (an array of ints)--is not an int intself

	A[0] = 3;
	A[1] = 17;
	A[2] = 11;
	A[3] = -3;
	A[4] = 0;
	A[5] = 2;
	A[6] = 9;
	A[7] = 1000006;
	A[8] = 91;
	A[9] = 4;*/


	System.out.print ("How many integers would you like to enter?  ");
	int sz = in.nextInt();
	int[] A = new int[sz];

	for (int i=0; i < A.length; i++) {
	 System.out.println ("Please enter the "+(i+1)+"th. value:  "); //i+1 starts numbering at 1 instead of 0
	 A[i] = in.nextInt();
 }
    for (int i=0; i < A.length; i++)
    System.out.println (A[i]);

	/*System.out.println (A[0]);
	System.out.println (A[1]);
	System.out.println (A[2]);
	System.out.println (A[3]);
	System.out.println (A[4]);
	System.out.println (A[5]);
	System.out.println (A[6]);
	System.out.println (A[7]);
	System.out.println (A[8]);
	System.out.println (A[9]);*/




	}
}

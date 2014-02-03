import java.util.*;

public class method3 {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {


   PrintNumberAndSquare (17,4);
   PrintNumberAndSquare (206,4);
   PrintNumberAndSquare (-11,-4);

   System.out.println ("ReturnStuff returns "+ReturnStuff());
   System.out.println ("KillLoop returns "+KillLoop());
   System.out.print ("Enter a string:  ");
   String s = in.nextLine ();
   System.out.println (Backwards(s));

 }

 public static void PrintNumberAndSquare (int i, int j) { //a method without an answer

	System.out.println (i+" squared is "+i*i+".");
	System.out.println (j+" squared is "+j*j+".");


 }

 public static int ReturnStuff (){

	System.out.println ("I'm in ReturnStuff.");
	if (1==1) return 17;
	System.out.println ("I'm still in ReturnStuff."); //will never be returned, as 1 == 1 always
	return -17;
 }

 public static int KillLoop () {

	 for (int i=0; i<=100000; i++){
		 System.out.println (i);
		 if (i==100) return 10;
	 }
	 return 100; //will never fire..i==100 it returns 10. line is still necessary to compile
 }

 public static String Backwards (String o) {

	 String b = "";
	 for (int i=0; i<o.length(); i++)
	 b = o.charAt(i) + b;
	 return b;
 }
}
//empty return can only be used in a void statement--useful for program
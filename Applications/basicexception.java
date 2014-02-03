import java.util.*;

public class basicexception {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

  System.out.print ("Please enter an integer:  ");
  try {
   int i = Integer.parseInt (in.nextLine());
   //double d = Double.parseDouble (in.nextLine());

  // int i = in.nextInt();
   System.out.println ("You have entered "+i);
  } catch (Exception e) {
	  //in.nextInt();
   System.out.println ("That wasn't an integer.");
  }
 }
}

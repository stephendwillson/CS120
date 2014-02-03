import java.util.*;

public class positiveinteger {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {


      int n = 0;
      while (true) {
      try {
      System.out.print ("Please enter a positive integer:  ");
      n = Integer.parseInt (in.nextLine());
      if (n > 0) break;
      //if (n <= 0) n = 5/0;
  }   catch (Exception e) {
  }
	  System.out.println ("That's not a valid integer.");

}



	}
}

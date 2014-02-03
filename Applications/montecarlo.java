import java.util.*;

public class montecarlo {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {


      int thrs=0;
      int hits=0;

      while (true) {

		  double x = Math.random();
		  double y = Math.random();
		  thrs++;
		  if (x*x+y*y < 1) hits++;
		  System.out.println (4.0*hits/thrs);
		  break;
		           }


	}
}

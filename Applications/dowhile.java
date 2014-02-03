import java.util.*;

public class dowhile {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

  int i=1;
  do {
	  System.out.println (i);
	  i++;
	 } while (i <= 10);

i=0;
do {
	System.out.println ("Please enter an even integer:  ");
	i = in.nextInt ();
	if (i%2 !=0 ) System.out.println ("I said an EVEN integer.");
} while (i%2 !=0);


System.out.println ("Second try.");


while (1==1) /* can also write 'while (true)'*/ {
System.out.println ("Please enter an even integer:  ");
	i = in.nextInt ();
	if (i%2==0) break;
	System.out.println ("I said an EVEN integer.");
}


 }
}
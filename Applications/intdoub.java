import java.util.*;

public class intdoub {

 public static Scanner in = new Scanner (System.in);

 public static void main (String[] args) {

System.out.print ("Please enter a number:  ");
int i = in.nextInt ();
int s = (int)(Math.pow(i,2)+0.5); //(int) converts double to an integer
System.out.println (i+" squared is "+s);

/*double x = 5; //This will work
int y  = 5.0;  //This will not */
 }
}
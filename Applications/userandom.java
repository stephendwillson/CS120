import java.util.*;

public class userandom {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {


		for (int i=0; i < 10; i++){
		System.out.println ((int)(10+11*Math.random()));}
		//numbers between 10 and 20. First number(10) is lowest number, second number (11) is the number of choices
		System.out.println ();
        for (int i=0; i < 10; i++){
        System.out.println (2*(int)(50+51*Math.random()));}
        //2* gives only even integer
        System.out.println ();
        for (int i=0; i < 10; i++)
        System.out.println (1+2*(int)(50+50*Math.random()));
        //just adding one will print out only odd numbers


	}
}
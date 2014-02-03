import java.util.*;

public class loop1 {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {


        int i=1;       //initializer
		while (i <=10) {    //test
			System.out.println (i);     //loop
			i=i+1;        //iterator
			// i+=1  //a +=b is a shorthand for a = a + b;
			//i++  //i++ is a shorthand for i +=1
		}

		/*for (int i=1; i<=10; i++) System.out.println (i); <---does same thing as above statement*/



	/*i = 11;
	while (i <=10) {
			System.out.println (i);
			i++;
		}

		while (i <= 100) System.out.println (i); //infinite loop - will run forever*/

	}
}
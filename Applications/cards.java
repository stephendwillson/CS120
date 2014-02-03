import java.util.*;

public class cards {

	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args) {


		int[] deck = new int[52];
		int[] deck2 = new int[52];

		/*for (int i=0; i < deck.length; i++) {
		  boolean good = false;
		  while (!good) {
		   deck[i] = (int)(52*Math.random()); //prints out cards, may have repeats as does not keep track of card picked
		   //deck[i] = i; prints out each card in order
		   good = true;
		    for (int j=0; j < i; j++)
		    if (deck[j]==deck[i]) good = false;
		}
	}*/






	/*	for (int i=0; i < deck2.length; i++) deck2[i] = i;
		int d2len = deck2.length;
		for (int i=0; i < deck.length; i++) {
			int rc = (int)(d2len*Math.random());
			deck[i] = deck2[rc];
			deck2[rc] = deck2[d2len-1];
			d2len--;

		System.out.println (CardName (deck[i]));
	}*/

	for (int i=0; i < deck.length; i++) deck[i]=i;
	for (int i=1; i < deck.length; i++) {
		int rc = (int)((i+1)*Math.random());
		int t = deck[i];
		deck[i] = deck[rc];
		deck[rc] = t;
}

    for (int i=0; i < deck.length; i++)
     System.out.println (CardName (deck[i]));


}

    public static String CardName (int c) {

		String N = "";
		switch (c%13) {
			case 0 : N += "Ace"; break;
			case 1 : N += "Two"; break;
			case 2 : N += "Three"; break;
			case 3 : N += "Four"; break;
			case 4 : N += "Five"; break;
			case 5 : N += "Six"; break;
			case 6 : N += "Seven"; break;
			case 7 : N += "Eight"; break;
			case 8 : N += "Nine"; break;
			case 9 : N += "Ten"; break;
			case 10 : N += "Jack"; break;
			case 11 : N += "Queen"; break;
			case 12 : N += "King"; break;
		}

		N+= " of ";
		switch (c/13) {
			case 0: N+= "Hearts"; break;
			case 1: N+= "Clubs"; break;
			case 2: N+= "Diamonds"; break;
			case 3: N+= "Spades"; break;
		}
		return N;


}

}
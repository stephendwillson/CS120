/* Stephen Douglas Willson CS120
   This program is designed to ask for a number of dice and a number of rolls,
   printing out the frequency of each number rolled.*/

import java.util.*;

public class Dice
{
	public static Scanner in = new Scanner (System.in);

	public static void main (String[] args)
	{
     //this method asks for number of dice and rolls and prints out frequency of numbers rolled

    	int dice;
        while (true)
        {
        	try
        	{
        		System.out.print ("Please enter a positive number of dice to roll:  ");
        		dice = Integer.parseInt (in.nextLine());

        		if (dice > 0)
        			break;
        	}
        	catch (Exception e)
        	{
				System.out.println ("That's not a valid number of dice.");
            }
        }

        int rolls;
        while (true)
        {
        	try
        	{
        		System.out.print ("Please enter the number of times you'd like to roll them:  ");
        		rolls = Integer.parseInt (in.nextLine());
        		if (rolls > 0)
        			break;
        	}
        	catch (Exception e)
        	{
				System.out.println ("That's not a valid number of rolls.");
            }
        }

        int[] results = new int[(dice*6)+1];

        for (int i=0; i < rolls; i++)
        {
	    	results[diceRoll(dice)]++;
	    }

	    for (int i=dice; i < results.length; i++)
	    {
	    	System.out.println ("You rolled "+results[i]+" "+i+"'s.");
	    }
    }

    public static int diceRoll (int dice)
    {  //this method rolls the dice, looping once for each die entered and returning the total

    int total = 0;

    for (int i = 0; i < dice; i++)
    {
    	int rollcount = (int)(1+6*(Math.random()));
        total+=rollcount;
    }

    return total;

    }
}

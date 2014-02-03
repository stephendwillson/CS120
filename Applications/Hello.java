/*This is CS120
  This is our first super awesome program!
  Doesn't it rock? */

import java.util.*;

public class Hello {

public static Scanner in = new Scanner (System.in);

public static void main (String[] args) {


System.out.println ("Hi there!");
System.out.println ("Word.");
System.out.println ("I just said \"Hello\" to my friend.\\\"Yeah\".");
System.out.print ("What is your name?  ");
String name = in.next (); //reads in a string.
System.out.println ("Hello, "+name+".  I'm pleased to meet you.");
in.nextLine();
System.out.print ("What is your FULL name?  ");
String fullname = in.nextLine (); //reads in a whole line.
System.out.println ("Well, "+fullname+", ain't life grand?");
System.out.println ("How old are you?");
int age = in.nextInt (); //reads in an integer
if (age >=50){
System.out.println (age+"!? You're "+age+"!!??  That's really old!");}
System.out.print ("What's your name?? ");
String first = in.next();
System.out.print ("What's your last name? ");
String last = in.next();
System.out.println ("Well, howdy "+first+" "+last+"!");
}
}
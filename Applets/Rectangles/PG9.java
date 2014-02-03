/* Stephen Douglas Willson CS120
   This program will take two mouse clicks from the user and set them as opposite points on a rectangle.
   It will do the same thing for a second rectangle. It will then print out on the screen the area of
   intersection.*/

   import java.applet.*;
   import java.awt.*;
   import java.awt.event.*;

   public class PG9 extends Applet {

     int x1=0, x2=0, x3=0, x4=0;
     int y1=0, y2=0, y3=0, y4=0;
     int clickcount = 0;
     int height = 0;
     int width = 0;

	public void init () {
     //this method just sets the background size and color

	 resize (500,500);
	 setBackground (Color.black);

	 addMouseListener (new MouseAdapter ()
	   {
	    public void mousePressed (MouseEvent e) {
         //this method takes in clicks from the user and calls the paint method through repaint()

         if (clickcount==0){
         x1 = e.getX();
         y1 = e.getY();
         clickcount++;
         repaint();        }
         else if (clickcount==1){
         x2 = e.getX();
         y2 = e.getY();
		 clickcount++;
         repaint();             }
         else if (clickcount==2)
         {
		 x3 = e.getX();
		 y3 = e.getY();
		 clickcount++;
		 repaint();
		 }
		 else if (clickcount==3){
	     x4 = e.getX();
	     y4 = e.getY();
	     clickcount++;
	     repaint();             }
                                                }
      }
  );
                        }

  public void paint (Graphics g) {
   //this method does all of the drawing of the rectangles and the strings for area of intersection

    g.setColor(Color.green);
    g.drawString("Click once to establish the top-left point of a rectangle.",10,30);
    g.drawString("Your second click will be the opposite point of a drawn rectangle.",11,43);
    g.drawString("Click twice more to do the same with another rectangle.",11,56);
    g.drawString("The area of the intersection will be printed out when both are drawn.",11,69);

    g.setColor(Color.green);
    g.drawRect(x1,y1,(x2-x1),(y2-y1));

    g.setColor(Color.green);
    g.drawRect(x3,y3,(x4-x3),(y4-y3));

    if (clickcount==1)    {
	g.setColor(Color.green);
	g.drawRect(x1,y1,0,0);}

	if (clickcount==3)    {
	g.setColor(Color.green);
	g.drawRect(x3,y3,0,0);}

    if (x1 < x4 && x3 < x2) width = Math.min(x4,x2)-Math.max(x3,x1);
    else width = 0;
	if (y1 < y4 && y3 < y2) height = Math.min(y4,y2)-Math.max(y3,y1);
	else height = 0;

    g.setColor(Color.green);
    g.drawString("Area of intersection = "+width*height,10,450);
 }
}
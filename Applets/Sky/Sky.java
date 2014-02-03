/* Stephen Douglas Willson CS120
   This program draws a pretty picture of the night sky with a crescent moon and a bevy of stars.*/

import java.applet.*;
import java.awt.*;

public class Sky extends Applet {

	public void init () {

		setSize (600,300);
		setBackground (Color.black);
	                    }

	public void paint (Graphics g) {
		//this method calls DrawMoon and DrawStars to paint the moon and stars

        DrawMoon(g,150,100);
        DrawStar(g,300,100);
        DrawStar(g,350,150);
        DrawStar(g,400,100);
        DrawStar(g,500,200);
        DrawStar(g,400,200);
        DrawStar(g,300,200);
        DrawStar(g,450,150);
        DrawStar(g,500,100);
        DrawStar(g,550,150);
        DrawStar(g,250,150);
        DrawStar(g,250,50);
        DrawStar(g,350,50);
        DrawStar(g,450,50);
        DrawStar(g,550,50);
        DrawStar(g,350,250);
        DrawStar(g,250,250);
        DrawStar(g,450,250);
        DrawStar(g,550,250);
                                   }

    public void DrawStar (Graphics g, int x, int y) {
		//this method sets the shape and color for the stars

        g.setColor (Color.yellow);
        int[] h = new int[10];
        int[] v = new int[10];
        h[0]=x; v[0]=y;
        h[1]=x-4; v[1]=y+5;
        h[2]=x-11; v[2]=y+5;
        h[3]=x-5; v[3]=y+8;
        h[4]=x-9; v[4]=y+13;
        h[5]=x; v[5]=y+10;
        h[6]=x+9; v[6]=y+13;
        h[7]=x+5; v[7]=y+8;
        h[8]=x+11; v[8]=y+5;
        h[9]=x+4; v[9]=y+5;


        g.fillPolygon (h,v,10);
	                                                }

   public void DrawMoon (Graphics g, int x, int y) {
	   //this method sets the shape and color of two circles overlapped to make the moon

		g.setColor(Color.gray);
		g.fillOval(150,100,100,100);

		g.setColor(Color.black);
		g.fillOval(175,100,100,100);

                                                   }
}

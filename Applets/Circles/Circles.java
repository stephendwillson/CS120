import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Circles extends Applet {

 int cct = 0;
 OneCircle[] C = new OneCircle[500];

 public void init () {

  resize (800,600);
  setBackground (Color.black);

  addMouseListener (new MouseAdapter ()
   {
    public void mousePressed (MouseEvent e) {

     C[cct] = new OneCircle();
     C[cct].x = e.getX();
     C[cct].y = e.getY();
     C[cct].R = (int) (256*Math.random());
     C[cct].G = (int) (256*Math.random());
     C[cct].B = (int) (256*Math.random());
     C[cct].r = (int) (20+50*Math.random());
     cct++;
     repaint();
    }
   }
  );

   addKeyListener (new KeyAdapter ()
    {
	 public void keyPressed (KeyEvent e) {

	  if (e.getKeyCode()==KeyEvent.VK_UP) ChangeCircles (0,-10);
	  if (e.getKeyCode()==KeyEvent.VK_DOWN) ChangeCircles (0,10);
	  if (e.getKeyCode()==KeyEvent.VK_LEFT) ChangeCircles (-10,0);
	  if (e.getKeyCode()==KeyEvent.VK_RIGHT) ChangeCircles (10,0);
	  repaint();
	  }
    }
   );


 }

 public void paint (Graphics g) {

   g.setColor(Color.green);
   g.drawString("Click the screen to draw a circle with a random radius and color.",10,30);
   g.drawString("Press the arrow keys to make all the circles move in that direction.",10,43);
   g.drawString("The area of the circle is displayed on the bottom of the screen.",10,56);

  for (int i=0; i < cct; i++) {
   g.setColor (new Color(C[i].R,C[i].G,C[i].B));
   g.fillOval (C[i].x-C[i].r,C[i].y-C[i].r,2*C[i].r,2*C[i].r);
  }
  g.setColor (Color.green);
  if (cct > 0)
   g.drawString ("Area = "+Math.PI*C[cct-1].r*C[cct-1].r,10,570);
 }

 public void ChangeCircles (int x, int y) {

	 for (int i=0; i < cct; i++) {
		 C[i].x += x;
		 C[i].y += y;

	 }
 }

}

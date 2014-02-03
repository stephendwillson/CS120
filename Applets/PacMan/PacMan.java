/* Stephen Douglas Willson CS120
   This program draws a PacMan to the applet window. Pressing
   an arrow key will cause PacMan to face and move in that
   direction. His mouth will also open and close upon moving.
   Clicking the applet window will cause a piece of PacMan crack to appear.
   When PacMan hits a piece of PacMan crack, the dot will disappear.*/

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class PacMan extends Applet 
{

   	int x=350;
   	int y=300;
   	int keycount=1;
   	int direction=2;
   	int dotcount=0;
   	Dots[] dots = new Dots[100000];

	public void init () 
	{
   

	resize(700,600);
	setBackground(Color.black);

   	addMouseListener (new MouseAdapter ()
	{
		public void mousePressed (MouseEvent e) 
		{

	 	dots[dotcount] = new Dots();
		dots[dotcount].dx = e.getX();
		dots[dotcount].dy = e.getY();
		dots[dotcount].r = 4;
		dotcount++;
		repaint();
		}
	}
	);

	addKeyListener (new KeyAdapter ()
    	{
		public void keyPressed (KeyEvent e) 
		{
     
		  	if ((e.getKeyCode()==KeyEvent.VK_UP) && (y > 0))
			{ 
				y -= 10;
		  		direction=1;                                    
			}

	  		if ((e.getKeyCode()==KeyEvent.VK_DOWN) && (y < 565))
			{ 
				y += 10;
	  			direction=3;                                       
			}

	 		if ((e.getKeyCode()==KeyEvent.VK_LEFT) && (x > 0))
			{ 
				x -= 10;
	  			direction=4;                                      
			}

	  		if ((e.getKeyCode()==KeyEvent.VK_RIGHT) && (x < 665))
			{ 
				x += 10;
	  			direction=2;                                         
			}

      		keycount++;
      		repaint();
		}
    	}
	);
	}

	public void paint (Graphics g) 
	{

		g.setColor(Color.green);
	  	g.drawString("Click the screen to begin. Press the directional",10,20);
	  	g.drawString("keys to move in a given direction. Clicking the",11,33);
	  	g.drawString("screen will cause new PacMan crack to appear.",11,46);

     		if (keycount > 300) 
			g.drawString ("Someone's bored...",300,20);
      		if (keycount > 600) 
			g.drawString ("Seriously--consider renting a movie or something.",300,33);
      if (keycount > 900) {g.drawString ("You know, you can find PacMan for free on the internet.",300,46);}
      if (keycount > 1200) {g.drawString ("You are a sad, sad man.",300,59);}

      for (int i=0; i < dotcount; i++) {
		if (dots[i].Visible())
		dots[i].DrawDot(g);
		                               }

      for (int i=0; i < dotcount; i++) {
	    if ((Math.abs((x+15)-dots[i].dx)) <= 19 && (Math.abs((y+15)-dots[i].dy)) <= 19){
        dots[i].IsVisible(false);
        dots[i].EatenDot(g);
                                                                                       }
                                       }

      if(keycount%2==0) CloseMouth(g,x,y);
      else OpenMouth(g,x,y);
                                 }

  public void CloseMouth (Graphics g, int x, int y){
   //sets up a closed mouth PacMan

	  g.setColor(Color.yellow);
	  g.fillOval(x,y,30,30);
                                                   }

  public void OpenMouth (Graphics g, int x, int y) {
   //sets up an open mouth PacMan for each direction

      if (direction==2)           {
	  g.setColor(Color.yellow);
	  g.fillArc(x,y,30,30,30,300);}

	  if (direction==1)            {
      g.setColor(Color.yellow);
      g.fillArc(x,y,30,30,120,300);}

      if (direction==4)            {
	  g.setColor(Color.yellow);
	  g.fillArc(x,y,30,30,210,300);}

	  if (direction==3)            {
	  g.setColor(Color.yellow);
	  g.fillArc(x,y,30,30,300,300);}
											       }
}

/* Stephen Douglas Willson CS120
   Class keeping track of the dots for PacMan.java.
   Called to draw dots and eaten dots. Also called
   to set dots as 'eaten.'*/



import java.awt.*;

public class Dots {
 //initializes variables used through Dots class

 int dx, dy;
 int r;
 boolean visible=true;

public void DrawDot (Graphics g) {
 //sets color and size of dots

  g.setColor(Color.white);
  g.fillOval(dx-r,dy-r,2*r,2*r);
                                 }

public void EatenDot (Graphics g) {
 //sets color and size of dots after they've been 'eaten'

  g.setColor(Color.black);
  g.fillOval(dx-r,dy-r,2*r,2*r);
							      }

public boolean Visible() {
 //called in PacMan class-if true, dots are drawn

    return visible;
                         }

public void IsVisible (boolean eaten) {
 //called in PacMan class-changes boolean visible to false to allow dots to appear 'eaten'

    visible=eaten;
                                      }
}
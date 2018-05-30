/* J19_05.java	*/
/* Drawing  a Polygon Using drawPolygon() Methods */
import java.awt.*;
import java.applet.*;
public class J19_05 extends Applet
{
 int X1[] = {30, 130, 30, 30};
 int Y1[] = {50, 150, 150, 50};
 int N = 4;
public void paint (Graphics g)
 {
  g.drawString("The Polygon ABC is:", 10,20);
  g.drawPolygon(X1, Y1, N); // Drow triangle ABC
  g.drawString("A(30,50)", 30,45); 
  g.drawString("B(130,150)",130,165); 
  g.drawString("C(30,150)", 30,165); 
 }
}

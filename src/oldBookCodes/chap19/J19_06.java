/* J19_06.java	*/
/* Drawing  a Polygon Using drawPolygon() Methods */
import java.awt.*;
import java.applet.*;

public class J19_06 extends Applet
{
 int X1[] = {50, 80, 80, 50, 20, 20};
 int Y1[] = {50, 70, 100,120,100,70};
 int N = 6;

public void paint (Graphics g)
 {
  g.drawString("The Polygon ABCDEFA is:", 10,20);
  // A(50, 50), B(80, 70), C(80, 100)
  // D(50, 120), E(20, 100),F(20,70)
  g.setColor(Color.blue);
  g.fillPolygon(X1, Y1, N); // Drow filled polygon ABCDEFA
 }
}

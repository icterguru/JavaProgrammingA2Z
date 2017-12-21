/* J19_08.java  */
/* Drawing  a angle Polygon using drawLine() Method */
import java.awt.*;
import java.applet.*;
public class J19_08 extends Applet
{
public void paint (Graphics g)
 {
  g.drawOval(30, 30, 200, 160); // Drawing a hollow Oval
  g.setColor(Color.red);
  g.fillOval(80, 60, 100, 100); // Drawing a filled Circle
  }
}


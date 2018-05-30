/* J19_07.java  */
/* Drawing  a triangle Polygon using drawLine() Method */
import java.awt.*;
import java.applet.*;

public class J19_07 extends Applet
{
public void paint (Graphics g)
 {
  g.drawString("The triangle ABC is:", 10,20);
  g.drawLine(30,50, 130,150); // Drow line AB
  g.drawLine(130,150, 30,150); // Drow line BC
  g.drawLine(30,150, 30,50); // Drow line CA
  g.drawString("A(30,50)", 30,45); 
  g.drawString("B(130,150)",130,165); 
  g.drawString("C(30,150)", 30,165); 
  }
}


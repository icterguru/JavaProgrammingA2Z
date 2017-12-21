/* J19_03.java  */
/* Drawing a Rectangle Using drawLine() Method	*/
import java.awt.*;
import java.applet.*;

public class J19_03 extends Applet
{
public void paint (Graphics g)
 {
  g.drawString("The lines AB, BC, CD and DA are:", 10,20);
  g.drawLine(30,50, 130,50); 	// Drow line AB
  g.drawString("A(30,50)", 30,45); 
  g.drawString("B(130,50)",130,45); 
  g.drawLine(130,50, 130,150); // Drow line BC
  g.drawString("C(130,150)",130,165); 
  g.drawLine(130,150, 30,150); // Drow line CD
  g.drawLine(30,150, 30,50); // Drow line DA
  g.drawString("D(30,150)", 30,165); 
  }
}


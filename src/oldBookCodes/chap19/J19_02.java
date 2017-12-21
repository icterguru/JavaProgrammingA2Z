/* J19_02.java  */
/* Drawing a Rectangle Using drawRect Method	*/
import java.awt.*;
import java.applet.*;

public class J19_02 extends Applet
{
public void paint (Graphics g)
 {
  g.drawString("The Rectingle ABCD is:", 10,20);
  g.drawRect(30, 50, 100, 100); 
  g.drawString("A(30,50)", 30,45); 
  g.drawString("B(130,50)",130,45); 
  g.drawString("D(30,150)", 30,165); 
  g.drawString("C(130,150)",130,165); 
  }
}


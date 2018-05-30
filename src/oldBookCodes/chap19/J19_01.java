/* J19_01.java  */
/* Drawing a Line Using drawLine() Method   */

import java.awt.*;
import java.applet.*;

public class J19_01 extends Applet
{
 
public void paint (Graphics g)
 {
  g.drawString("Line between the points A and B is:", 10,40); 
  g.drawLine(20, 50, 175, 50); 
  g.drawString("A(20,50)", 20,65); 
  g.drawString("B(175,50)", 175,65); 

  g.drawString("Line between the points C and D is:", 10,90); 
  g.drawLine(20, 110, 175, 150); 
  g.drawString("C(20,110)", 20,105); 
  g.drawString("D(175,150)", 180,155); 

  }
}

/* J19_09.java  */
/* Drawing  a series of ovals */

import java.awt.*;
import java.applet.*;

public class J19_09 extends Applet
{
public void paint (Graphics g)
 {
  g.setColor(Color.red);
  for (int i=0; i<=5; i++)
   if(i%2==0)
     g.drawOval(i*50+10,30, 30, 30); 
   else
     g.fillOval(i*50+10,30, 30, 30);
  
  }
}


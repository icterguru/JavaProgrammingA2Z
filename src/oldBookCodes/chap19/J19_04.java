/* J19_04.java  */
/* Drawing  Round Rectangles Using drawRoundRect() and fillRoundRect() Methods */
import java.awt.*;
import java.applet.*;

public class J19_04 extends Applet
{
public void paint (Graphics g)
 {
  g.drawRoundRect(30, 50, 100, 100, 10, 10); 
  g.setColor(Color.green);
  g.fillRoundRect(150, 50, 100, 100, 20, 20); 
  
  }
}


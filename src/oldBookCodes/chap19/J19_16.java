/* J19_13.java  */
/* Displaying Center Alligned Text */
import java.awt.*;
import java.applet.*;

public class J19_16 extends Applet 
 {
  final Font f = new Font("SansSerif", Font.BOLD, 18);

  public void paint(Graphics g) 
   {
    Dimension d = this.getSize();

    g.setColor(Color.white);
    g.fillRect(0, 0, d.width,d.height);
    g.setColor(Color.blue);
    g.setFont(f);
    CenterAllign("This is Center Alligned String.", d.width, d.height, g);
    g.drawRect(0, 0, d.width-1, d.height-1);
  }

  public void CenterAllign(String s, int w, int h, Graphics g)
   {
    FontMetrics fm = g.getFontMetrics();
    int x = (w - fm.stringWidth(s)) / 2;
    int y = (fm.getAscent() + (h - (fm.getAscent()
             + fm.getDescent()))/2);
    g.drawString(s, x, y);
  }
}

/* J19_15.java	*/
/* Displaying Multi-lined Text */
import java.awt.*;
import java.applet.*;

public class J19_15 extends Applet 
 {
  int XPos=0, YPos=0; // current position

  public void init()
  {
    Font f = new Font("Courier", Font.PLAIN, 12);
    setFont(f);
   }
  public void paint(Graphics g) 
  {
    FontMetrics fm = g.getFontMetrics();

    NextLine("This is on Line one.", g);
    NextLine("This is on Line two.", g);
    sameLine(" This is on same Line.", g);
    sameLine(" This is also.", g);
    NextLine("This is on Line three.", g);
  }

  // Add to next line.
  void NextLine(String s, Graphics g) 
  {
    FontMetrics fm = g.getFontMetrics();

    YPos = YPos + fm.getHeight(); // Add to next line
    XPos = 0;
    g.drawString(s, XPos, YPos);
    XPos = fm.stringWidth(s); // Add to end of line
  }

  // Display on same line.
  void sameLine(String s, Graphics g)
   {
    FontMetrics fm = g.getFontMetrics();
    g.drawString(s, XPos, YPos);
    XPos = XPos + fm.stringWidth(s); // Add to end of line
  }
}

/* J19_11.java  */
/* Drawing  a series of ovals */
import java.awt.*;
import java.applet.*;
public class J19_11 extends Applet
{
public void paint (Graphics g)
 {
 g.drawOval(40, 40, 120, 150);// Head
 g.fillArc(60, 125, 80, 40, 180, 180); // Mouth
 g.drawOval(25, 92, 15, 30);  // Left Ear
 g.drawOval(160,92, 15, 30);  // Right Ear
 g.drawOval(57, 75, 30, 20);  // Left  Eye
 g.drawOval(110, 75, 30, 20); // Right Eye
 g.fillOval(68, 81, 10, 10);  // Left Pupil
 g.fillOval(121, 81, 10, 10); // Right Pupil
 g.drawOval(85, 100, 20, 30); // Nose
 }
}

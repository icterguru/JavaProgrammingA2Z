/* J19_18.java  */
/* Loading and Drawing Image */
/* These are the view of DU Carzon Hall and TSC Field */
import java.net.URL;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;
public class J19_18 extends Applet
 {
 Image Img1, Img2;  // Image Object
 public void init() 
  {
   URL codebase = getCodeBase();
   showStatus(codebase.toString());
   Img1 = getImage(codebase, "Image1.gif"); // Loading Image1
   Img2 = getImage(codebase, "Image2.gif"); // Loading Image2
  }
public void paint(Graphics g) 
 {
 g.drawImage(Img1,10,10,this);  // Display the loaded Image1
 g.drawImage(Img2,200,10,this); // Display the loaded Image2
 }
}

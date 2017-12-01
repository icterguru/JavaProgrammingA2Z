package chapter17;
/* A Sample Applet Program */
/* J17_01.java     	  */
/* Applet Source File	 */
import java.applet.*;
import java.awt.*;
public class J17_01 extends Applet
{
 public void paint (Graphics g) 
 {
  setSize(400, 200);   // Set Size of Applet Screen 
  g.drawString("WELCOME TO APPLET PROGRAMMING",10,50);
  }
}

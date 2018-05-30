/*	J18_01.java	*/
/*  Creating a Panel Window		*/	
import java.awt.*;
import java.applet.*;
public class J18_01 extends Applet
{
 Panel P = new Panel();
 public void init()
  {
   P.setSize(new Dimension(400, 250));
   P.setVisible(true);
  }
}

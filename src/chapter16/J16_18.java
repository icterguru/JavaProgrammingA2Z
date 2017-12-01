package chapter16;
/*	J16_18.java	*/
/* Without using any Layout Manager	*/	
import java.awt.*;
import java.applet.*;
public class J16_18 extends Applet {
  public void init()  {
   for(int i=1; i<=6;i++)
    {
     add(new Button("Button" +i));
    }
   }
  public void paint(Graphics g)  {
   g.drawString("Without using any Layout Manager.", 10, 100);
  }
}

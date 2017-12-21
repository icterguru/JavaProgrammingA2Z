/*	J18_19.java	*/
/*  Using FlowLayout Manager	*/	
import java.awt.*;
import java.applet.*;

public class J18_19 extends Applet
  {
  FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
  public void init() 
   {
    setLayout(fl);
    for(int i=1; i<=6;i++)
    {
     add(new Button("Button" +i));
    }
   }
  public void paint(Graphics g) 
   {
     g.drawString("Using Left Aligned FlowLayout Manager.", 10, 100);
  }
}

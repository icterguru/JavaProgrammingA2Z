/*      J18_24.java     */
/*  Implementing ActionListener Event in Button Component */ 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AListener extends Applet implements ActionListener 
{
  String msg = "";

  public void init()
   {
    Button y = new Button("Yes");
    Button n = new Button("No");
    Button c = new Button("Cancel");

    add(y);
    add(n);
    add(c);

    AListener  al = new AListener();
    y.addActionListener(al);
    n.addActionListener(al);
    c.addActionListener(al);
  }

  public void actionPerformed(ActionEvent ae) 
   {
    String str = ae.getActionCommand();
    if(str.equals("Yes"))
     {
      msg = "You Pressed Yes.";
     }
    else if(str.equals("No")) 
     {
      msg = "You Pressed No.";
     }
    else 
     {
      msg = "You Pressed Cancel.";
     }
    repaint();
  }

  public void paint(Graphics g) {
     g.drawString(msg, 10, 100);
  }
}

package chapter16;
/*      J16_06.java     */
/*  Using Button Component 	*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class J16_06 extends Applet implements ActionListener {
  String msg = "";
  public void init() {
   Button y = new Button("Yes");
   Button n = new Button("No");
   Button c = new Button("Cancel");

    add(y);
    add(n);
    add(c);

    y.addActionListener(this);
    n.addActionListener(this);
    c.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae) {
    String str = ae.getActionCommand();
    if(str.equals("Yes")){
      msg = "You Pressed Yes.";
     }
    else if(str.equals("No")){
      msg = "You Pressed No.";
     }
    else{
      msg = "You Pressed Cancel.";
     }
    repaint();
  }
  public void paint(Graphics g) {
     g.drawString(msg, 10, 100);
  }
}


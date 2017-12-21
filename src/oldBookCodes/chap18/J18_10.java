/*      J18_10.java     */
/*  Using Choice Component */	
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class J18_10 extends Applet implements ItemListener 
 {
  Choice Ch = new Choice();
  String msg = "";

  public void init() 
  {
    // add items to Ch list
    Ch.add("C");
    Ch.add("CPP");
    Ch.add("Java");
    Ch.add("Oracle");

    // add choice lists to window
    add(Ch);

    // register to receive item events
    Ch.addItemListener(this);
  }

  public void itemStateChanged(ItemEvent ie) 
  {
    repaint();
  }

  // Display current selections.
  public void paint(Graphics g) 
  {
    msg = "Current Choice: ";
    msg += Ch.getSelectedItem();
    g.drawString(msg, 10, 100);
  }
}

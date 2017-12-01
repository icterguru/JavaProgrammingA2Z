package chapter16;
/*      J16_08.java     */
/*  Using Canvas Component */	
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class J16_08 extends Applet implements ItemListener{
  String msg = "";
  Checkbox C, CPP, Java;
  public void init(){
    C = new Checkbox("C", null, true);
    CPP = new Checkbox("CPP");
    Java = new Checkbox("Java");
    add(C);
    add(CPP);
    add(Java);
    C.addItemListener(this);
    CPP.addItemListener(this);
    Java.addItemListener(this);
  }
  public void itemStateChanged(ItemEvent ie) {
    repaint();
  }
  // display current state of the check boxes.
  public void paint(Graphics g)  {
    msg = "Current state: ";
    g.drawString(msg, 10, 80);
    msg = "  C: " + C.getState();
    g.drawString(msg, 10, 100);
    msg = "  CPP: " + CPP.getState();
    g.drawString(msg, 10, 120);
    msg = "  Java: " + Java.getState();
    g.drawString(msg, 10, 140);
  }
}

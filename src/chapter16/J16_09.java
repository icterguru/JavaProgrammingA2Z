package chapter16;
/*      J16_09.java     */
/*  Using CheckboxGroup Component  */	
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J16_09 extends Applet implements ItemListener {
  String msg = "";
  Checkbox C, CPP, Java;
  CheckboxGroup cbg;

  public void init() {
    cbg = new CheckboxGroup();
    C = new Checkbox("Programming in C", cbg, false);
    CPP = new Checkbox("Programming in C++", cbg, false);
    Java = new Checkbox("Programming in Java", cbg, true);

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
  public void paint(Graphics g)
  {
    msg = "Current selection: ";
    msg += cbg.getSelectedCheckbox().getLabel();
    g.drawString(msg, 16, 100);
  }
}

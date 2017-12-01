package chapter16;
/*	J16_12.java	*/
/*  Using List Component */	

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J16_12 extends Applet implements ActionListener {
  List os, lang;
  String msg = "";

  public void init() {
    os = new List(2, false);
    lang = new List(3, true);

    // add items to os list
    os.add("Windows 7");
    os.add("Windows 10");
    os.add("Solaris");
    os.add("MacOS");
    os.select(1);

    // add items to lang list
    lang.add("C");
    lang.add("CPP");
    lang.add("Java");
    lang.add("Oracle");
    lang.select(2);
    // add lists to window
    add(os);
    add(lang);
    // register to receive action events
    os.addActionListener(this);
    lang.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae) {
    repaint();
  }
  // display current selections.
  public void paint(Graphics g) {
    int idx[];

    msg = "Current Operating System: ";
    idx = os.getSelectedIndexes();
    for(int i=0; i<idx.length; i++)
      msg += os.getItem(idx[i]) + "  ";
    g.drawString(msg, 10, 100);
    msg = "Current Language: ";
    msg += lang.getSelectedItem();
    g.drawString(msg, 10, 120);
  }
}

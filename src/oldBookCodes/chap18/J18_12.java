/*	J18_12.java	*/
/*  Using List Component to a Window		*/	

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J18_12 extends Applet implements ActionListener 
 {
  List os, lang;
  String msg = "";

  public void init()
   {
    os = new List(2, true);
    lang = new List(3, false);

    // add items to os list
    os.add("Windows 98");
    os.add("Windows NT");
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

  public void actionPerformed(ActionEvent ae) 
  {
    repaint();
  }

  // Display current selections.
  public void paint(Graphics g) 
   {
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

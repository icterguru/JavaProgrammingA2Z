package chapter16;
/*  J16_03.java	*/
/*  Creating a Frame  Window	*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class J16_03 extends Frame {
  public J16_03()  // Constructor Defined
  {
    addWindowListener(new MyWindowAdapter());
  }

  public static void main(String args[]) {
    J16_03 appwin = new J16_03();
    appwin.setSize(new Dimension(400, 250));
    appwin.setTitle("Press x to Close the Window");
    appwin.setVisible(true);
  }
}

class MyWindowAdapter extends WindowAdapter {
  public void windowClosing(WindowEvent we) {
    System.exit(0);  // Closes Window
  }
}

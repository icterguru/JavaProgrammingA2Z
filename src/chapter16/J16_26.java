package chapter16;
/*      J16_26.java     */
/*  Event Handling By Extending Button Component */ 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J16_26 extends Applet {
  MyButton btn;
  static int i = 0;
  public void init() {
    btn = new MyButton("Click Me");
    add(btn);
  }
  class MyButton extends Button  {
    public MyButton(String label) 
    {
     super(label);
     enableEvents(AWTEvent.ACTION_EVENT_MASK);
    }
    protected void processActionEvent(ActionEvent ae) 
    {
     showStatus("Button Clicked: " + ++i + " times.");
     super.processActionEvent(ae);
    }
  }
}

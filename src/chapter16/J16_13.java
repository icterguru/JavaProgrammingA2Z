package chapter16;
/*	J16_13.java	*/
/*  Using Scrollbar Component	*/	
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J16_13 extends Applet
  implements AdjustmentListener, MouseMotionListener  {
  String msg = "";
  Scrollbar VerticalSB, HorizontalSB;

  public void init() {
    int width = Integer.parseInt(getParameter("width"));
    int height = Integer.parseInt(getParameter("height"));

    VerticalSB = new Scrollbar(Scrollbar.VERTICAL,
                           0, 1, 0, height);
    HorizontalSB = new Scrollbar(Scrollbar.HORIZONTAL,
                           0, 1, 0, width);
    add(VerticalSB);
    add(HorizontalSB);

    // register to receive adjustment events
    VerticalSB.addAdjustmentListener(this);
    HorizontalSB.addAdjustmentListener(this);
    addMouseMotionListener(this);
  }

  public void adjustmentValueChanged(AdjustmentEvent ae) {
    repaint();
  }

  // Update scroll bars to reflect mouse dragging.
  public void mouseDragged(MouseEvent me) 
   {
    int x = me.getX();
    int y = me.getY();
    VerticalSB.setValue(y);
    HorizontalSB.setValue(x);
    repaint();
  }

  // Necessary for MouseMotionListener
  public void mouseMoved(MouseEvent me)  {   }

  // display current value of scroll bars.
  public void paint(Graphics g)  {
     g.drawString("Cursor Position is : ", 10, 100);
     msg = "Vertical: " + VerticalSB.getValue();
     msg += ",  Horizontal: " + HorizontalSB.getValue();
     g.drawString(msg, 10, 120);
     // show current mouse drag position
     g.drawString("|", HorizontalSB.getValue(),
                  VerticalSB.getValue());
  }
}

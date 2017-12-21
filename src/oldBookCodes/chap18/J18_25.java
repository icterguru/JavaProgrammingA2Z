/*      J18_25.java     */
/*  Implementing MouseListener and MouseMotionListener Interfaces */ 

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J18_25 extends Applet
  implements MouseListener, MouseMotionListener {

  String msg = "";
  int mouseX = 0, mouseY = 0; // coordinates of mouse

  public void init() 
  {
     addMouseListener(this);
     addMouseMotionListener(this);
  }

  // Handling MouseMoved() Method.
  public void mouseMoved(MouseEvent me) 
  {
    // show status
    showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
  }

  // Handle mouse clicked.
  public void mouseClicked(MouseEvent me)
  {
    // save coordinates
    mouseX = 0;
    mouseY = 10;
    msg = "Mouse clicked.";
    repaint();
  }


  // Handling MouseExited() Method.
  public void mouseExited(MouseEvent me) {
    // save coordinates
    mouseX = 0;
    mouseY = 10;
    msg = "Mouse exited.";
    repaint();
  }

  // Handling MousePressed() Method.
  public void mousePressed(MouseEvent me) 
 {
    // save coordinates
    mouseX = me.getX();
    mouseY = me.getY();
    msg = "Down";
    repaint();
  }

  // Handling MouseReleased() Method.
  public void mouseReleased(MouseEvent me) {
    // save coordinates
    mouseX = me.getX();
    mouseY = me.getY();
    msg = "Up";
    repaint();
  }

  // Handling MouseEntered() Method.
  public void mouseEntered(MouseEvent me) 
  {
    // save coordinates
    mouseX = 0;
    mouseY = 10;
    msg = "Mouse entered.";
    repaint();
  }

  // Handling MouseDragged() Method.
  public void mouseDragged(MouseEvent me) 
  {
    // save coordinates
    mouseX = me.getX();
    mouseY = me.getY();
    msg = "*";
    showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
    repaint();
  }

  // Display msg in applet window at current X,Y location.
  public void paint(Graphics g) {
    g.drawString(msg, mouseX, mouseY);
  }    
}

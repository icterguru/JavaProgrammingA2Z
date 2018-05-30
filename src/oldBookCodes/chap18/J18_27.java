/*	J18_27.java	*/
/*  Using Adapter Class   */	
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J18_27 extends Applet 
 {
  public void init()
  {
     addMouseListener(new MyMouseAdapter(this));
     addMouseMotionListener(new MyMouseMotionAdapter(this));
  }
}

class MyMouseAdapter extends MouseAdapter 
 {
  J18_27 ad;
  public MyMouseAdapter(J18_27 ad) 
  {
    this.ad = ad;
  }

  // Handle mouse clicked.
  public void mouseClicked(MouseEvent me) {
    ad.showStatus("Mouse clicked");
  }
}

class MyMouseMotionAdapter extends MouseMotionAdapter 
 {
  J18_27 ad;
  public MyMouseMotionAdapter(J18_27 ad) 
 {
    this.ad = ad;
  }

  // Handle mouse dragged.
  public void mouseDragged(MouseEvent me) 
 {
    ad.showStatus("Mouse dragged");
  } 
}

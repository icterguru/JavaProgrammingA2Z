package chapter16;
/*	J16_27.java	*/
/*  Using Adapter Class   */	
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J16_27 extends Applet {
  public void init() {
     addMouseListener(new MyMouseAdapter(this));
     addMouseMotionListener(new MyMouseMotionAdapter(this));
  }
}

class MyMouseAdapter extends MouseAdapter {
  J16_27 ad;
  public MyMouseAdapter(J16_27 ad) {
    this.ad = ad;
  }

  // Handle mouse clicked.
  public void mouseClicked(MouseEvent me) {
    ad.showStatus("Mouse clicked");
  }
}

class MyMouseMotionAdapter extends MouseMotionAdapter {
  J16_27 ad;
  public MyMouseMotionAdapter(J16_27 ad){
    this.ad = ad;
  }

  // Handle mouse dragged.
  public void mouseDragged(MouseEvent me){
    ad.showStatus("Mouse dragged");
  } 
}

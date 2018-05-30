/*	J18_28.java	*/
/*  Using Anonymous inner class */	
import java.applet.*;
import java.awt.event.*;
public class J18_28 extends Applet 
{
  public void init()
   {
    addMouseListener(new MouseAdapter(){
      public void mousePressed(MouseEvent me) // Anonymous Class
      {
        showStatus("Mouse Pressed"); 
      }
    });
  }
}

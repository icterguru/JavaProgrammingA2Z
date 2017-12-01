package chapter16;
/*	J16_28.java	*/
/*  Using Anonymous inner class */	
import java.applet.*;
import java.awt.event.*;
public class J16_28 extends Applet {
 public void init()  {
  addMouseListener(new MouseAdapter() //Anonymous Class
   {
   public void mousePressed(MouseEvent me) 
    {
     showStatus("Mouse Pressed"); 
    }
  });
 }
}

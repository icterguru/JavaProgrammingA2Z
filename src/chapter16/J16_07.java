package chapter16;
/*	J16_07.java	*/
/*  Using Canvas Component  */	
import java.awt.*;
import java.applet.*;
public class J16_07 extends Applet
{
Canvas canv = new Canvas();
public void init()
 {
  canv.setSize(200, 100);
  canv.setBackground(Color.blue);
  add(canv);
 }
}

package chapter16;
/*	J16_14.java	*/
/*  Using ScrollPane Component	*/	
import java.awt.*;
import java.applet.*;
public class J16_14 extends Applet {
ScrollPane sp = new ScrollPane();
Label lbl = new Label("Programming in Java");
public void init() {
  lbl.setFont(new Font("Courier New", Font.BOLD, 32));
  sp.add(lbl);
  add(sp);
 }
}

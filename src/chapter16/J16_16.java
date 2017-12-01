package chapter16;
/*	J16_16.java	*/
/*  Using TextField Component	*/	
import java.awt.*;
import java.applet.*;

public class J16_16 extends Applet {
 public void init() {
  String Str = "The 'Computer' comes from the Latin word \n"+  
  "'Compute' which means to calculate. \n" +
  "So a computer is normally considered to be a \n" +
  "calculating machine that can be used to perform \n"+
  "operations at enormous speed.\n\n"+
  "Charles Babbage, a ninetheenth century Professor \n"+
  "of Mathematics at Cambridge University, is known as \n"+
  "the father of Modern Digital Computer.";
  TextArea txt = new TextArea(Str, 8, 25);
  add(txt);

  }
}

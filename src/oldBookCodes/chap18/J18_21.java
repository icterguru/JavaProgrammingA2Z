/*	J18_21.java	*/
/* Using BorderLayout Manager */
import java.awt.*;
import java.applet.*;
import java.util.*;

public class J18_21 extends Applet 
{
  public void init() 
  {
    // set background color so insets can be easily seen
    setBackground(Color.cyan);
    setLayout(new BorderLayout());
    add(new Label("This is Titlebar"),
        BorderLayout.NORTH);
    add(new Label("This is Statusbar"),
        BorderLayout.SOUTH);
    add(new Button("Right"), BorderLayout.EAST);
    add(new Button("Left"), BorderLayout.WEST);
   String Str = "The 'Computer' comes from the Latin word \n"+  
    "'Compute' which means to calculate. \n" +
    "So a computer is normally considered to be a \n" +
    "calculating machine that can be used to perform \n"+
    "operations at enormous speed.\n\n"+
    "Charles Babbage, a ninetheenth century Professor \n"+
    "of Mathematics at Cambridge University, is known as \n"+
    "the father of Modern Digital Computer.";
    add(new TextArea(Str), BorderLayout.CENTER);
  }

 public Insets getInsets() // Using getInsets() Method
  {
    return new Insets(10, 10, 10, 10);
  }
}

/*	J18_20.java	*/
/*  Using GridLayout Manager	*/	
import java.awt.*;
import java.applet.*;

public class J18_20 extends Applet
  {
  GridLayout gl = new GridLayout(3, 2,20,30);
  public void init() 
   {
    setLayout(gl);  // Sets Layout Manager
    for(int i=1; i<=6;i++)
    {
     add(new Label("Label" +i));
     add(new Button("Button" +i));
    }
   }
}

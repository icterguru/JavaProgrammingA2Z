/* J17_04.java            */
/* An Applet that takes input */
import java.awt.*;
import java.applet.*;
public class J17_04 extends Applet
{
 TextField Text1, Text2;
 public void init ()
  {
    Text1 = new TextField(10);  // 10 as text length 
    Text2 = new TextField(10);  // 
    add(Text1);
    add(Text2);
    Text1.setText(""); // initial text
    Text2.setText("");
   }
  public void paint (Graphics g)
   {
    int x=0 , y=0, z=0;
    String S1, S2, S3;
    g.drawString("Input a number in each box and press ENTER to sum:", 10,60);
    try
    {
     S1 = Text1.getText();
     x  = Integer.parseInt(S1);
     S2 = Text2.getText();
     y  = Integer.parseInt(S2);
    }
   catch (Exception e) { }
   z = x + y;
   S3 = String.valueOf(z);
   g.drawString("Sum is: ", 10,80);
   g.drawString(S3,80,80);
  }

 public boolean action(Event event, Object Obj)
  {
  repaint();
  return true;

  }

}


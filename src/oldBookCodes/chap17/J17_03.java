/* J17_03.java            */
/* An Applet Program that takes user-defined input */
import java.awt.*;
import java.applet.*;

public class J17_03 extends Applet
{
 int Value1, Value2, Sum;
  public void paint (Graphics g)
   {
     Value1 = 100;
       Value2 = 200;
         Sum = Value1 + Value2;
           String S1 = "Value1 = " + String.valueOf(Value1);
             String S2 = "Value2 = " + String.valueOf(Value2);
               String S3 = "Sum = " + String.valueOf(Sum);
                 g.drawString(S1,10,60);
                   g.drawString(S2,10,80);
                     g.drawString(S3,20,100);

                       }
                       }


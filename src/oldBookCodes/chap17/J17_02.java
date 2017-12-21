/* J17_02.java            */
/* An Applet Program with .... */
import java.awt.*;
import java.applet.*;
public class J17_02 extends Applet
{
 String Msg;
  public void init()
    {
       Msg = getParameter("ParameterValue");
          if( Msg == null)
              Msg ="Java Programming";
                  Msg = "Welcome to" + " " + Msg;
                    }
                     public void paint (Graphics g)
                       {
                         g.drawString(Msg,10,50);
                           }
                           }



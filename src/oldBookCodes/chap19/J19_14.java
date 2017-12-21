/* J19_14.java	*/
/* Displaying Font Information */
import java.awt.*;
import java.applet.*;

public class J19_14 extends Applet
 {
  public void paint(Graphics g)
  {
    Font f = g.getFont();
    String fontName = f.getName();
    String fontFamily = f.getFamily();
    int fontSize = f.getSize();
    int fontStyle = f.getStyle();

    String Msg = "Family : " + fontName;
    Msg = Msg + ",  Font Name : " + fontFamily;
    Msg = Msg + ",  Size : " + fontSize + ",  Style: ";

    if((fontStyle & Font.PLAIN) == Font.PLAIN)
      Msg = Msg + "Plain ";
    if((fontStyle & Font.BOLD) == Font.BOLD)
      Msg = Msg + "Bold ";
    if((fontStyle & Font.ITALIC) == Font.ITALIC)
      Msg = Msg + "Italic ";

    g.drawString(Msg, 4, 16);
  }
}

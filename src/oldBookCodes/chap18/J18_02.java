/*  J18_02.java	*/
/*  Creating a Simple Frame  Window	*/
import java.awt.*;
import java.applet.*;

public class J18_02 extends Applet
{
public static void main(String[] args)
 {
 Frame frame = new Frame("Test Window");
 frame.setSize(400, 250);
 frame.setTitle("Click Command Window and Press Ctrl+C to Close");
 frame.setVisible(true);
 }
}

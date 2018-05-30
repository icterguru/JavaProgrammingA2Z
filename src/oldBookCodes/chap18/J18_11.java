/*	J18_11.java	*/
/*  Using FileDialog Component	*/	
import java.awt.*;
import java.applet.*;
public class J18_11 extends Applet
{
Frame frm = new Frame();
FileDialog fd = new FileDialog(frm, "File Open Dialog Box", FileDialog.LOAD);
public void init()
 {
  fd.setVisible(true);
  add(fd);
 }
}

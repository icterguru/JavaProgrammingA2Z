/* J19_13.java  */
/* Displaying Various Font in using Mouse Click */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 
public class J19_13 extends Applet {
  int next = 0;
  Font f;
  String msg;
  public void init() {
    f = new Font("TimesRoman", Font.PLAIN, 14);
    msg = "Dialog";
    setFont(f);
    addMouseListener(new MyMouseAdapter(this));
  }
  
  public void paint(Graphics g) {
    g.drawString(msg, 10, 20);
    g.drawString("Click to change Current Font.", 10, 50);
  }
}

class MyMouseAdapter extends MouseAdapter {
  J19_13 FName;
  public MyMouseAdapter(J19_13 FName) {
    this.FName = FName;
  }
  public void mousePressed(MouseEvent me) {
    // Switch fonts with each mouse click.
    FName.next++;
    switch(FName.next) {
    case 0:
      FName.f = new Font("Serif", Font.PLAIN, 14);
      FName.msg = "Serif";
      break;
    case 1:
      FName.f = new Font("Dialog", Font.PLAIN, 14);
      FName.msg = "Dialog";
      break;
    case 2:
      FName.f = new Font("SansSerif", Font.PLAIN, 14);
      FName.msg = "SansSerif";
      break;
    case 3:
      FName.f = new Font("DialogInput", Font.PLAIN, 14);
      FName.msg = "DialogInput";
      break;
    case 4:
      FName.f = new Font("Monospaced", Font.PLAIN, 14);
      FName.msg = "Monospaced";
      break;
    }
    if(FName.next == 4) FName.next = -1;
    FName.setFont(FName.f);
    FName.repaint();
  }
}

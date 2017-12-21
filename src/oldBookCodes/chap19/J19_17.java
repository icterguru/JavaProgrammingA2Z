/* J19_17.java  */
/* Managing Multi-lined Text Allignment */

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.applet.*;

 public class J19_17 extends Applet
  {
  final int LEFT = 0;
  final int RIGHT = 1;
  final int CENTER = 2;
  final int JUSTIFIED =3;
  Dimension d;
  int Align;
  Font f;
  FontMetrics fm;
  int FontSize;
  int fh, bl;
  int space;
  String Text;

  public void init()
    {
    setBackground(Color.white);
    Text = getParameter("Text");
    try
    {
     FontSize = Integer.parseInt(getParameter("FontSize"));
    }
    catch (NumberFormatException e)
    {
      FontSize=14;
    }
    Align = LEFT;
    addMouseListener(new MyMouseAdapter(this));
  }

  public void paint(Graphics g)
   {
    update(g);
    g.drawString("Click to change Text Allignment.", 10, 125);
   }

  public void update(Graphics g)
   {
    d = getSize();
    g.setColor(getBackground());
    g.fillRect(0,0,d.width, d.height);
    if(f==null) f = new Font(getParameter("FontName"),
                             Font.PLAIN, FontSize);
    g.setFont(f);
    if(fm == null) {
        fm = g.getFontMetrics();
        bl = fm.getAscent();
        fh = bl + fm.getDescent();
        space = fm.stringWidth(" ");
    }

    g.setColor(Color.black);
    StringTokenizer st = new StringTokenizer(Text);
    int x = 0;
    int nextx;
    int y = 0;
    String word, sp;
    int wordCount = 0;
    String line = "";
    while (st.hasMoreTokens()) {
      word = st.nextToken();
      if(word.equals("<P>")) {
        drawString(g, line, wordCount,
                   fm.stringWidth(line), y+bl);
        line = "";
        wordCount = 0;
        x = 0;
        y = y + (fh * 2);
      }
      else {
        int w = fm.stringWidth(word);
        if(( nextx = (x+space+w)) > d.width )
          {
          drawString(g, line, wordCount,
                     fm.stringWidth(line), y+bl);
          line = "";
          wordCount = 0;
          x = 0;
          y = y + fh;
        }
        if(x!=0) {sp = " ";} else {sp = "";}
        line = line + sp + word;
        x = x + space + w;
        wordCount++;
      }
    }
    drawString(g, line, wordCount, fm.stringWidth(line), y+bl);
  }

  public void drawString(Graphics g, String line,
                         int wc, int lineW, int y) {
    switch(Align) 
      {
      case LEFT:
        g.drawString(line, 0, y);
       g.drawString("Click to change Text Allignment.", 10, 125);
        break;
      case RIGHT: 
        g.drawString(line, d.width-lineW ,y);
        g.drawString("Click to change Text Allignment.", 10, 125);
        break;
      case CENTER:
        g.drawString(line, (d.width-lineW)/2, y);
        g.drawString("Click to change Text Allignment.", 10, 125);
        break;
      case JUSTIFIED:
        if(lineW < (int)(d.width*.75))
        {
         g.drawString(line, 0, y);
         g.drawString("Click to change Text Allignment.", 10, 150);
        }
      else
        {
        int toFill = (int)((d.width - lineW)/wc);
        int nudge = d.width - lineW - (toFill*wc);
        int s = fm.stringWidth(" ");
        StringTokenizer st = new StringTokenizer(line);
        int x = 0;
        while(st.hasMoreTokens())
          {
          String word = st.nextToken();
          g.drawString(word, x, y);
          if(nudge>0) {
            x = x + fm.stringWidth(word) + space + toFill + 1;
            nudge--;
            }
         else {
              x = x + fm.stringWidth(word) + space + toFill;
            }
          }
        }
        break;
      }

  }

}

class MyMouseAdapter extends MouseAdapter 
  {
  J19_17 Obj;
  public MyMouseAdapter(J19_17 Obj) 
  {
    this.Obj = Obj;
  }
 public void mouseClicked(MouseEvent me) 
   {
    Obj.Align = (Obj.Align + 1) % 4;
    Obj.repaint();
  }
}

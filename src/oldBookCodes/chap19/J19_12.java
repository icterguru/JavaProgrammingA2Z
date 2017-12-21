/* J19_12.java  */
/* Drawing  a series of ovals */
import java.awt.*;
import java.applet.*;
public class J19_12 extends Applet
{
int N = 0;
String Label[];
int Value[];

public void init()
{
 try{
  N = Integer.parseInt(getParameter("Column"));
  Label = new String[N];
  Value = new int[N];
  Label[0] = getParameter("Label1");
  Label[1] = getParameter("Label2");
  Label[2] = getParameter("Label3");
  Label[3] = getParameter("Label4");
  Label[4] = getParameter("Label5");
  Value[0] = Integer.parseInt(getParameter("C1"));
  Value[1] = Integer.parseInt(getParameter("C2"));
  Value[2] = Integer.parseInt(getParameter("C3"));
  Value[3] = Integer.parseInt(getParameter("C4"));
  Value[4] = Integer.parseInt(getParameter("C5"));
  
  }
catch(NumberFormatException E) { }
}
public void paint (Graphics g)
 {

 for(int i = 0; i<5; i++)
  {
   if((i%2)==0) 
     g.setColor(Color.blue); 
    else
     g.setColor(Color.red); 
   g.drawString(Label[i],20, i*40 +20); 
   g.fillRect(50, i*40 +10, Value[i], 20);
  }
 }
}


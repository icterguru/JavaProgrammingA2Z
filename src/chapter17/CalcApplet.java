package chapter17;
/*   CalcApplet.java    */
/*  This is the Applet form of the Precedding Calculator Application Program defined by CalcApp.java  */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class CalcApplet extends Applet {
 public void init() {
 add(new CalculatorPanel());
 }
}
class CalculatorPanel extends Panel implements ActionListener
{
 private TextField display;
 private double Arg = 0;
 private String op = "=";
 private boolean start = true;
 public CalculatorPanel()
 {
 setLayout(new BorderLayout());
 display = new TextField("0");
 display.setEditable(false);
 add(display,"North");
 Panel p = new Panel();
 p.setLayout(new GridLayout(4,4));
 String buttons = "123/456*789-0.=+";
 for(int i =0; i<buttons.length(); i++)
  addButton(p,buttons.substring(i,i+1));
 add(p, "Center");
 }
 private void addButton(Container c, String s)
 {
  Button b = new Button(s);
  c.add(b);
  b.addActionListener(this);
 }
 public void actionPerformed(ActionEvent evt)
 {
 String s = evt.getActionCommand();
 if('0'<=s.charAt(0)&&s.charAt(0)<='9' || s.equals("."))
 {
  if(start) 
   display.setText(s);
 else 
  display.setText(display.getText()+s);
 start = false;
 }
 else {
 if (start){
  if(s.equals("-"))
  { 
  display.setText(s); start = false;
 }
 else op = s;
 }
else{
   calculate(Double.parseDouble(display.getText()));
   op = s;
   start = true;
  }
 }
}
public void calculate(double n)
 {
 if (op.equals("+")) 
Arg = Arg + n;
 else if (op.equals("-")) 
Arg = Arg - n;
 else if (op.equals("*")) 
Arg = Arg * n;
 else if (op.equals("/")) 
Arg = Arg / n;
 else if (op.equals("=")) 
Arg = n;
 display.setText("" + Arg);
 }
}

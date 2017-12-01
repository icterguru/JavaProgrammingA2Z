package chapter17;
/*   CalcApp.java   */
/*  A Simple Calculator Application Program  */
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class CalcApp extends Applet{  
 public static void main(String[] args)
 {  
  Frame frame = new CalculatorFrame();
  frame.show();  
 }
}

class CalculatorFrame extends Frame{
 public CalculatorFrame() {
   setTitle("Calculator Application");
   setSize(400, 200);
   addWindowListener(new WindowAdapter(){  
   public void windowClosing(WindowEvent e){  
    	System.exit(0);} } );
 add(new CalculatorPanel());
}
}

class CalculatorPanel extends Panel implements ActionListener
{  
 private TextField display;
 private double Arg = 0;
 private String op = "=";
 private boolean start = true;

 public CalculatorPanel() {  
  setLayout(new BorderLayout());
  display = new TextField("0");
  display.setEditable(false);
  add(display, "North");
		
  Panel p = new Panel();
  p.setLayout(new GridLayout(4, 4));
  String buttons = "123/456*789-0.=+";
  for (int i = 0; i < buttons.length(); i++) 
   addButton(p, buttons.substring(i, i + 1));
  add(p, "Center");
   }
 private void addButton(Container c, String s) {
   Button b = new Button(s);
   c.add(b);
   b.addActionListener(this);
  }
public void actionPerformed(ActionEvent evt) {
  String s = evt.getActionCommand();
   if ('0'<=s.charAt(0)&&s.charAt(0)<='9'||s.equals("."))
   {
    if (start) 
    display.setText(s);
 	else 
display.setText(display.getText() + s);
 	start = false;
   }
   else {  
   if (start)
   {  
   if (s.equals("-")) 
    {
   	display.setText(s);
   	start = false; 
    }
   				
   else op = s;
  }
      	
  else {
   double x = Double.parseDouble(display.getText());
   calculate(x);
   op = s;
   start = true;
   }
  }
 }
   	
 public void calculate(double n) {
 if (op.equals("+")) 
Arg = Arg + n;
  else if (op.equals("-")) 
Arg = Arg -n;
  else if (op.equals("*"))
Arg = Arg * n;
  else if (op.equals("/")) 
Arg = Arg / n;
  else if (op.equals("=")) 
Arg = n;
  display.setText("" + Arg);
  }
 }

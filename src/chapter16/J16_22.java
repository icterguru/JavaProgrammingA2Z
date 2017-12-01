package chapter16;
/*	J16_22.java	*/
/* Using GridBagLayout Manager  */
import java.awt.*; 
import java.util.*; 
import java.applet.Applet; 
public class J16_22 extends Applet {
 protected void makebutton(String name, GridBagLayout gbl, GridBagConstraints gbc)
 { 
  Button button = new Button(name); 
  gbl.setConstraints(button, gbc);
  add(button); 
 }
 public void init() {
   GridBagLayout gbl = new GridBagLayout(); 
   GridBagConstraints gbc = new GridBagConstraints(); 
   setBackground(Color.blue);
   setFont(new Font("Courier", Font.PLAIN, 14)); 
   setLayout(gbl); 
   gbc.fill = GridBagConstraints.BOTH; 
   gbc.weightx = 1.0; 
   makebutton("Button1", gbl, gbc);
   makebutton("Button2", gbl, gbc); 
   makebutton("Button3", gbl, gbc); 
   gbc.gridwidth = GridBagConstraints.REMAINDER; //end row 
   makebutton("Button4", gbl, gbc); 
   gbc.weightx = 0.0; 
//reset to the default    
   makebutton("Button5", gbl, gbc); //another row 
   gbc.gridwidth = GridBagConstraints.RELATIVE; 
//next-to-last in row 
   makebutton("Button6", gbl, gbc); 
   gbc.gridwidth = GridBagConstraints.REMAINDER; //end row 
   makebutton("Button7", gbl, gbc); 
   gbc.gridwidth = 1; //reset to the default 
   gbc.gridheight = 2; 
   gbc.weighty = 1.0; 
   makebutton("Button8", gbl, gbc); 
   gbc.weighty = 0.0; //reset to the default 
   gbc.gridwidth = GridBagConstraints.REMAINDER; //end row 
   gbc.gridheight = 1; //reset to the default 
   makebutton("Button9", gbl, gbc); 
   makebutton("Button10", gbl, gbc); 
   setSize(300, 100); 
  }
 public static void main(String args[]) 
  { 
   Frame f = new Frame("GridBagLayout Example"); 
   J16_22 ex1 = new J16_22(); 
   ex1.init(); 
   f.add("Center", ex1); 
   f.pack(); 
   f.setSize(f.getPreferredSize()); 
   f.show(); 
  }
} 

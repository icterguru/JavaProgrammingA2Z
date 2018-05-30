/*	J18_15.java	*/
/*  Using TextField Component	*/	
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J18_15 extends Applet implements ActionListener 
  {

  TextField email, pass;

  public void init() 
   {
    Label lblEmail = new Label("Email: ", Label.RIGHT);
    Label lblPassword = new Label("Password: ", Label.RIGHT);
    email = new TextField(20);
    pass = new TextField(10);
    pass.setEchoChar('*');

    add(lblEmail);
    add(email);
    add(lblPassword);
    add(pass);

    // register to receive action events
    email.addActionListener(this);
    pass.addActionListener(this);
  }

  // User pressed Enter.
  public void actionPerformed(ActionEvent ae) 
  {
    repaint();
  }

  public void paint(Graphics g) 
   {
     g.drawString("Email: " + email.getText(), 10, 80);
     g.drawString("Selected text in email: "
                  + email.getSelectedText(), 10, 100);
     g.drawString("Password: " + pass.getText(), 10, 120);
  }
}

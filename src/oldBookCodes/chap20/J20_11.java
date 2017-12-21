/* J20_11.java	*/
/* Creating and Sending an E-Mail By a Custom Editor */
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class J20_11
{ 
 public static void main(String[] args)
 { 
  JFrame frame = new MailTestFrame();
  frame.show();
 }
}

class MailTestFrame extends JFrame implements ActionListener
{ 
 BufferedReader in;
 PrintWriter out;
 JTextField smtpServer;
 JTextField to;
 JTextField from;
 JTextArea message;
 JTextArea response;

 public MailTestFrame()
   {  
   setTitle("A Simple E-Mail Editor");
   setSize(400, 250);
   addWindowListener(new WindowAdapter()
    {
   public void windowClosing(WindowEvent e)
    { 
     System.exit(0);
    }
    } );   // Anonymous Class

    getContentPane().setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 0;
    gbc.weighty = 0;
    gbc.weightx = 0;
    add(new JLabel("To: "), gbc, 0, 0, 1, 1);
    gbc.weightx = 100;
    to = new JTextField(20);
    add(to, gbc, 1, 0, 1, 1);

    gbc.weightx = 0;
    add(new JLabel("From: "), gbc, 0, 1, 1, 1);
    gbc.weightx = 100;
    from = new JTextField(20);
    add(from, gbc, 1, 1, 1, 1);

    gbc.weightx = 0;
    add(new JLabel("Mail Server: "), gbc, 0, 2, 1, 1);
    gbc.weightx = 100;
    smtpServer = new JTextField(20);
    add(smtpServer, gbc, 1, 2, 1, 1);
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weighty = 100;
    message = new JTextArea();
    add(new JScrollPane(message), gbc, 0, 3, 2, 1);

    response = new JTextArea();
    add(new JScrollPane(response), gbc, 0, 4, 2, 1);
    gbc.weighty = 0;
    JButton sendButton = new JButton("Send Mail");
    sendButton.addActionListener(this);
    JPanel buttonPanel = new JPanel();
    buttonPanel.add(sendButton);
    add(buttonPanel, gbc, 0, 5, 2, 1);
  }

 private void add(Component c, GridBagConstraints gbc, int x, int y, int w, int h){
   gbc.gridx = x;
   gbc.gridy = y;
   gbc.gridwidth = w;
   gbc.gridheight = h;
   getContentPane().add(c, gbc);
 }

 public void actionPerformed(ActionEvent evt)
  { 
  SwingUtilities.invokeLater(new Runnable()
   {  
    public void run()
     { 
      sendMail();
     }
   });   // Anonymous Class
  }

 public void send(String s) throws IOException
  { 
  if (s != null)
   {
   response.append(s + "\n");
   out.println(s);
   out.flush();
   }
   String line;
   if((line = in.readLine()) != null)
   response.append(line + "\n");
   }

  public void sendMail()
   { 
   try{ 
   Socket s = new Socket(smtpServer.getText(), 25);
   out = new PrintWriter(s.getOutputStream());
   in = new BufferedReader(new
   InputStreamReader(s.getInputStream()));
   String hostName = InetAddress.getLocalHost().getHostName();

   send(null);
   send("Hello " + hostName);
   send("To : " + to.getText());
   send("From: " + from.getText());
   send("DATA");
   out.println(message.getText());
    send(".");
    s.close();
    }
   catch (IOException exception)
    { 
    response.append("Error: " + exception);
    }
   }
}

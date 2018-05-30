/* J20_09.java	*/
/* Connecting and Retrieving data from Remote Computer  */
import java.net.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import java.awt.event.*;

public class J20_09 extends Frame implements ActionListener, WindowListener
{
  TextField txtURL = new TextField(" ", 30);
  TextArea  txtDoc      = new TextArea(); 
  Button    btnOpen = new Button("Open");
  Button    btnCancel  = new Button("Cancel");

  public static void main(String args[])
  {
    J20_09  urlCObj = new  J20_09();
  }

  public J20_09()
  {
    setTitle( "Connecting to the URL: " );
    txtURL.setFont(new Font("Courier", Font.PLAIN, 12));

    Panel P1 = new Panel();
    Panel P2 = new Panel();
    P1.add( new Label( "Enter a URL to Open: " ));
    P1.add(txtURL );
    add( P1, "North" );
    add( txtDoc, "Center" );
    P2.add(btnOpen);
    P2.add(btnCancel);
    add(P2, "South");
        
    btnOpen.addActionListener(this);
    btnCancel.addActionListener(this);
    txtURL.addActionListener(this);
    addWindowListener(this);
    setSize( 500, 300);
    setVisible(true);
    txtURL.requestFocus();
  }

  public void actionPerformed(ActionEvent theEvent)
  {
    if (theEvent.getSource() == btnOpen || theEvent.getSource() == txtURL)
    {
      try
      {
        URL url = new URL( txtURL.getText());  
        txtDoc.setText( "\nConnecting to : " + url + '\n' );
        URLConnection urlC = url.openConnection();
        // Retrieve info
        String  encoding = urlC.getContentEncoding();
        String  type = urlC.getContentType();       
        int length = urlC.getContentLength();
        long expires = urlC.getExpiration();

        txtDoc.append("Content encoding: " + encoding + '\n');
        txtDoc.append("Content length  : " + length   + '\n');
        txtDoc.append("Content type    : " + type     + '\n');
        txtDoc.append("Expires         : " + expires  + '\n');
   
        Object urlContent = url.getContent();

        String objectType = urlContent.getClass().getName();
        txtDoc.append( "\nConneting a "+objectType + "\n\n" );

        if ( urlContent instanceof String ) // Plain text
        {
          txtDoc.append( (String) urlContent );
        }
        else if ( urlContent instanceof InputStream )
        {
          String s = "";
          int b = 0;
          while((b =((InputStream) urlContent).read()) != -1)
          s += (char) b;
                    
          txtDoc.append(s);
        }
        else
        {
          txtDoc.append("\nCan not show the contents");
        }
      }
      catch (MalformedURLException badURL) //Handle wrong URL
      {
     txtDoc.append( "\nCan not Connent to the URL\n");
     txtDoc.append( badURL.toString() );
     }
      catch (IOException io)
      {
      txtDoc.append( "\nURL contents are not available\n");
        txtDoc.append( io.toString() );
      }
      catch (NullPointerException n)
      {
        txtDoc.append("\nURL contents are not available\n");
      }
     }
      else if (theEvent.getSource( ) == btnCancel) 
       ExitWindow();
    }

    public void windowActivated  (WindowEvent theEvent) { }
    public void windowDeactivated(WindowEvent theEvent) { }
    public void windowOpened     (WindowEvent theEvent) { }
    public void windowClosed     (WindowEvent theEvent) { }
    public void windowIconified  (WindowEvent theEvent) { }
    public void windowDeiconified(WindowEvent theEvent) { }
    public void windowClosing    (WindowEvent theEvent)
    { 
      ExitWindow( );
     }

    public void ExitWindow( )
    {
        setVisible(false);
        dispose();
        System.exit(0);
    }

}

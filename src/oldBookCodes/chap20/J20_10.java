/* J20_10.java	*/
/* Browsing Local or Remote Web Page By a Custom Browser */
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

public class J20_10 extends JFrame
 {
   JTextField enter;
  // JTextField to;
   JEditorPane contents;

   public static void main(String args[])
   {
      J20_10 app = new J20_10();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      ); 	  // Anonymous Class

   }
   
   public J20_10()
   {
      super( "A Simple Web Browser" );


      Container c = getContentPane();

      enter = new JTextField("Enter a Local or Remote URL to Browse");
      enter.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e )
            {
               getThePage( e.getActionCommand() );
            }
         }
      );	// Anonymous Class

      c.add( enter, BorderLayout.NORTH );
      contents = new JEditorPane();
      contents.setEditable( false );
      contents.addHyperlinkListener(
         new HyperlinkListener() {
        public void hyperlinkUpdate( HyperlinkEvent e )
            {
        if ( e.getEventType() ==                HyperlinkEvent.EventType.ACTIVATED )
             getThePage( e.getURL().toString() );
          }
         }
      );
      c.add( new JScrollPane( contents ),
             BorderLayout.CENTER );

      setSize( 400, 300 );
      show();
   }

   private void getThePage( String location )
   {
      setCursor( Cursor.getPredefinedCursor(
                    Cursor.WAIT_CURSOR ) );

      try {
         contents.setPage( location );
         enter.setText( location );
      }
      catch ( IOException io ) {
         JOptionPane.showMessageDialog( this,
            "Error retrieving specified URL",
            "Bad URL",
            JOptionPane.ERROR_MESSAGE );
      }
   setCursor( Cursor.getPredefinedCursor(
                    Cursor.DEFAULT_CURSOR ) );
   }

}

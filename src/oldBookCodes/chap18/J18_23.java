/*	J18_23.java	*/
/* Using CardLayout Manager. */
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class J18_23 extends Applet
  implements ActionListener, MouseListener
  {
  Checkbox Win95, Win98, winNT, C, CPP, Java;
  Panel osCards;
  CardLayout cardLO;
  Button Win, Lang;

  public void init()
   {
    Win = new Button("Windows");
    Lang = new Button("Language");
    add(Win);
    add(Lang);

    cardLO = new CardLayout();
    osCards = new Panel();
    osCards.setLayout(cardLO); 
// set panel layout to card layout

    Win95 = new Checkbox("Win95", null, false);
    Win98 = new Checkbox("Win98", null, true);
    winNT = new Checkbox("WinNT", null, false);
    C = new Checkbox("C");
    CPP = new Checkbox("CPP");
    Java = new Checkbox("Java");

    // add Windows check boxes to a panel
    Panel WinPan = new Panel();
    WinPan.add(Win95);
    WinPan.add(Win98);
    WinPan.add(winNT);  

    // Add Lang check boxes to a panel
    Panel LangPan = new Panel();
    LangPan.add(C);
    LangPan.add(CPP);
    LangPan.add(Java);

    // add panels to card deck panel
    osCards.add(WinPan, "Windows");
    osCards.add(LangPan, "Language");

    // add cards to main applet panel
    add(osCards);

    // register to receive action events
    Win.addActionListener(this);
    Lang.addActionListener(this);

    // register mouse events
    addMouseListener(this);
  }

  // Cycle through panels.
  public void mousePressed(MouseEvent me) 
  {
    cardLO.next(osCards);
  }

  /* Provide empty implementations for the MouseListener methods. */
  public void mouseClicked(MouseEvent me) {  }
  public void mouseEntered(MouseEvent me) {  }
  public void mouseExited(MouseEvent me)  {  }
  public void mouseReleased(MouseEvent me){  }

  public void actionPerformed(ActionEvent ae) 
   {
    if(ae.getSource() == Win) 
    {
     cardLO.show(osCards, "Windows");
    }
    else 
    {
     cardLO.show(osCards, "Language");
    }
  }
}

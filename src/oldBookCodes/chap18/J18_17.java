/*	J18_17.java	*/
/*  Using Menu Component   */	
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

// Create frame window.
public class J18_17 extends Applet 
 {
  Frame f;

  public void init() 
  {
    f = new MenuFrame("Testing Menu with Sub-Menu");
    int width = Integer.parseInt(getParameter("width"));
    int height = Integer.parseInt(getParameter("height"));

    setSize(new Dimension(width, height));

    f.setSize(width, height);
    f.setVisible(true);
  }

  public void start() 
  {
    f.setVisible(true);
  }

  public void stop() 
  {
    f.setVisible(false);
  }
}

// Create a subclass of Frame
class MenuFrame extends Frame 
 {
  String msg = "";
  CheckboxMenuItem chk1, chk2;

  MenuFrame(String title) {
    super(title);

    // create menu bar and add it to frame
    MenuBar mbar = new MenuBar();
    setMenuBar(mbar);

    // Create File Menu
    Menu file = new Menu("File");
    MenuItem item1, item2, item3, item4, item5;
    file.add(item1 = new MenuItem("New..."));
    file.add(item2 = new MenuItem("Open..."));
    file.add(item3 = new MenuItem("Close"));
    file.add(item4 = new MenuItem("-"));
    file.add(item5 = new MenuItem("Quit..."));
    mbar.add(file);

	    // Create Edit Menu
    Menu edit = new Menu("Edit");
    MenuItem item6, item7, item8, item9;
    edit.add(item6 = new MenuItem("Cut"));
    edit.add(item7 = new MenuItem("Copy"));
    edit.add(item8 = new MenuItem("Paste"));
    edit.add(item9 = new MenuItem("-")); // Seperator
    Menu sub = new Menu("Special");
    MenuItem item10, item11, item12;
    sub.add(item10 = new MenuItem("Sub1"));
    sub.add(item11 = new MenuItem("Sub2"));
    sub.add(item12 = new MenuItem("Sub3"));
    edit.add(sub);

    // these are checkable menu items
    chk1 = new CheckboxMenuItem("Check1");
    edit.add(chk1);
    chk2 = new CheckboxMenuItem("Check2");
    edit.add(chk2);
    mbar.add(edit);

	//Create  Help Menu
    Menu help=new Menu("Help");	
    help.add(new MenuItem("Contents"));
    help.add(new MenuItem("About This..."));
    mbar.setHelpMenu(help);
    mbar.add(help);

    // create an object to handle action and item events
    MyMenuHandler mmh = new MyMenuHandler(this);
    // register it to receive those events
    item1.addActionListener(mmh);
    item2.addActionListener(mmh);
    item3.addActionListener(mmh);
    item4.addActionListener(mmh);
    item5.addActionListener(mmh);
    item6.addActionListener(mmh);
    item7.addActionListener(mmh);
    item8.addActionListener(mmh);
    item9.addActionListener(mmh);
    item10.addActionListener(mmh);
    item11.addActionListener(mmh);
    item12.addActionListener(mmh);
    chk1.addItemListener(mmh);
    chk2.addItemListener(mmh);

    // create an object to handle window events
    MyWindowAdapter adapter = new MyWindowAdapter(this);
     // register it to receive those events
    addWindowListener(adapter);
  }

  public void paint(Graphics g) 
   {
    g.drawString(msg, 10, 200);

    if(chk1.getState())
      g.drawString("Check1 is On.", 10, 220);
    else
      g.drawString("Check1 is Off.", 10, 220);

    if(chk2.getState())
      g.drawString("Check2 is On.", 10, 240);
    else
      g.drawString("Check2 is Off.", 10, 240);
  }
}

class MyWindowAdapter extends WindowAdapter 
 {
  MenuFrame menuFrame;
  public MyWindowAdapter(MenuFrame menuFrame) 
  {
    this.menuFrame = menuFrame;
  }
  public void windowClosing(WindowEvent we) 
  {
    menuFrame.setVisible(false);
  }
}

class MyMenuHandler implements ActionListener, ItemListener 
 {
  MenuFrame menuFrame;
  public MyMenuHandler(MenuFrame menuFrame) 
  {
    this.menuFrame = menuFrame;
  }
  // Handle action events
  public void actionPerformed(ActionEvent ae) 
   {
      String msg = "You have selected ";
      String arg = (String)ae.getActionCommand();
      if(arg.equals("New..."))
        msg = msg + "New.";
      else if(arg.equals("Open..."))
        msg = msg + "Open.";
      else if(arg.equals("Close"))
        msg = msg + "Close.";
      else if(arg.equals("Quit..."))
        msg = msg + "Quit.";
      else if(arg.equals("Edit"))
        msg = msg + "Edit.";
      else if(arg.equals("Cut"))
        msg = msg + "Cut.";
      else if(arg.equals("Copy"))
        msg = msg + "Copy.";
      else if(arg.equals("Paste"))
        msg = msg + "Paste.";
      else if(arg.equals("Sub1"))
        msg = msg + "Sub1.";
      else if(arg.equals("Sub2"))
        msg = msg + "Sub2.";
      else if(arg.equals("Sub3"))
        msg = msg + "Sub3.";
      else if(arg.equals("Check1"))
        msg = msg + "Check1.";
      else if(arg.equals("Check2"))
        msg = msg + "Check2.";
      menuFrame.msg = msg;
      menuFrame.repaint();
  }
  // Handle item events
  public void itemStateChanged(ItemEvent ie) 
  {
    menuFrame.repaint();
  }
}



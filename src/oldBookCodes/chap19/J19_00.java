import java.awt.*;

import java.awt.event.*;

import javax.swing.*; // Swing is really unbielivable
public class J18_00 extends Frame implements ActionListener
{
	private Button colorChanger;
	private Color color = Color.lightGray;
	private Panel p;
	
	public J18_00()
	{
		super("A new Color tool from Java : JColorChooser");
		setSize(500,400);
		colorChanger = new Button("I want change");
		colorChanger.addActionListener(this);
		add(colorChanger,"South");
		p = new Panel();
		add(p,"Center");
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent theEvent)
	{
		color = JColorChooser.showDialog(J18_00.this,"Select a Color",color);
		
		if(color == null)
		color = Color.lightGray;
		
		p.setBackground(color);
		
		p.repaint();
		
		
		 
	}
	
	public static void main(String args[])
	{
		J18_00 myColor = new J18_00();
		
		myColor.addWindowListener(new WindowClosingTechnic());
	}
	
}

class WindowClosingTechnic extends WindowAdapter
{
	public void windowClosing(WindowEvent e)
	{
		System.exit(0);
	}
}


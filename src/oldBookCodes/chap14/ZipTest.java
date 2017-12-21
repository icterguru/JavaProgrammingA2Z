import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.util.zip.*;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;

public class ZipTest extends JFrame
   implements ActionListener
{  
	public ZipTest()
   	{  
   		setTitle("ZipTest");
      	setSize(300, 400);

      	JMenuBar mbar = new JMenuBar();
      	JMenu m = new JMenu("File");
      	openItem = new JMenuItem("Open");
      	openItem.addActionListener(this);
      	m.add(openItem);
      	exitItem = new JMenuItem("Exit");
      	exitItem.addActionListener(this);
      	m.add(exitItem);
      	mbar.add(m);

      	fileList.addActionListener(this);

      	Container contentPane = getContentPane();
      	contentPane.add(mbar, "North");
      	contentPane.add(fileList, "South");
      	contentPane.add(fileText, "Center");
   	}

   	public void actionPerformed(ActionEvent evt)
   	{  
   		Object source = evt.getSource();
      	if (source == openItem)
      	{  
      		JFileChooser chooser = new JFileChooser();
         	chooser.setCurrentDirectory(new File("."));
         	chooser.setFileFilter(new FileFilter()
            {  
            	public boolean accept(File f)
               {  
               		return f.getName().toLowerCase()
                     .endsWith(".zip")
                     || f.isDirectory();
               }
               
               public String getDescription()
               { return "ZIP Files"; }
            });
         	int r = chooser.showOpenDialog(this);
         	if (r == JFileChooser.APPROVE_OPTION)
         	{  
         		zipname = chooser.getSelectedFile().getPath();
            	scanZipFile();
         	}
      	}
      	else if (source == exitItem) System.exit(0);
     	else if (source == fileList)
         loadZipFile((String)fileList.getSelectedItem());
   }

   	public void scanZipFile()
   	{  
   		fileList.removeAllItems();
      	try
      	{  
      		ZipInputStream zin = new ZipInputStream(new
            FileInputStream(zipname));
         	ZipEntry entry;
         	
         	while ((entry = zin.getNextEntry()) != null)
         	{  
         		fileList.addItem(entry.getName());
            	zin.closeEntry();
         	}
         	zin.close();
      	}
      	
      	catch(IOException e) {}
   	}

   	public void loadZipFile(String name)
   	{  
   		try
      	{  
      		ZipInputStream zin = new ZipInputStream(new
            FileInputStream(zipname));
         	ZipEntry entry;
         	fileText.setText("");
         	
         	while ((entry = zin.getNextEntry()) != null)
         	{  
         		if (entry.getName().equals(name))
            	{  
            		BufferedReader in = new BufferedReader(new
                  	InputStreamReader(zin));
               		String s;
               		while ((s = in.readLine()) != null)
                  		fileText.append(s + "\n");
            	}
            	zin.closeEntry();
         	}
         	zin.close();
      	}	
      	catch(IOException e) {}
   	}

   	public static void main(String[] args)
   	{  
   		Frame f = new ZipTest();
      	f.show();
   	}

   	private JComboBox fileList = new JComboBox();
   	private JTextArea fileText = new JTextArea();
   	private JMenuItem openItem;
   	private JMenuItem exitItem;
   	private String zipname;
}
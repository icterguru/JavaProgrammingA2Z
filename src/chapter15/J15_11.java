package chapter15;
/* 	J15_11.java	  */
/* A Sample File Management Program */
import java.io.*;
import java.awt.*;

 public class J15_11 extends Frame
  {
  TextArea t;

 public static void main(String args[])
  {
   String path = ".";
   if(args.length >=1)
    {
    path = args[0];
    }
   File f = new File(path);
   if (f.isDirectory()==false)
   {
   System.out.println("The directory "+ path + "does not exist." );
   System.exit(0);
   }
  J15_11 Obj = new J15_11(f);
   Obj.setVisible(true);
  }
 
J15_11(File f)
  {
  super("File and Directory of the Current Directory");
  setSize(350,250);
  t = new TextArea();
  add(BorderLayout.CENTER, t);
  recurse(f,0);
  }

 void recurse(File Dir, int Depth)
  {
  String Contents[] = Dir.list();

  for(int i = 0;i<Contents.length; i++)
   {
   for(int j = 0;j<Depth; j++)
    {
     t.append("\t");
    }
		
  File ChildFile = new File(Dir,Contents[i]); 

  if(ChildFile.isDirectory()==true)
   {
    t.append("[DIR] ");
   }
  t.append(Contents[i] + "\n");

  if(ChildFile.isDirectory()==true)
    {	
     recurse(ChildFile,Depth+1);
    }
   }
 }
}

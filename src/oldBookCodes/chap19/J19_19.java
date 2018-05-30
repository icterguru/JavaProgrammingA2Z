/* J19_19.java	*/
/* A Simple  Animation Test Program */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;

public class J19_19 extends java.applet.Applet
implements Runnable 
{
Image Img[] = new Image[6];

String source[] = { "Image1.gif", "Image2.gif", "BdFlag.gif",
"Image2.gif", "Image1.gif", "BdFlag.gif" };

Image currentimg;
Thread runner;
int xPos= 10;
int yPos = 10;

public void init() 
{
resize(400,250);
 for (int i=0; i < Img.length; i++) 
  {
  Img[i] = getImage(getCodeBase(), source[i]);
  }
}

public void start() 
 {
  if (runner == null) 
  {
   runner = new Thread(this);
   runner.start();
  }
}

public void stop() 
{
 if (runner != null) 
 {
 runner.stop();
 runner = null;
 }
}

public void run() 
{
 while(true)
 {
  for (int i=0; i < Img.length; i++) 
  {
   currentimg = Img[i];
   repaint();
   pause(200);
  }
 }
}

void pause(int time) 
 {
try 
 {
  Thread.sleep(time);
 }

catch (InterruptedException e) { }

}

public void paint(Graphics g) 
 {
  g.drawImage(currentimg, xPos, yPos,this);
 }

}




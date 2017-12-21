/* J19_20.java	*/
/* Loading and Playing Sound  */
import java.applet.*;
import java.awt.*;

public class J19_20 extends Applet 
{
   AudioClip MySound;
    public void init()
    {
   try {
    MySound = getAudioClip(getDocumentBase(),"computer.au");
        }
        catch (Exception e)
        {
         showStatus("Unable to load Audio Sound.");
        }
    }
    public void start()
    {
     MySound.loop();
  
    }
    public void stop()
    {
     MySound.stop();
    }

    public void paint(Graphics g)
    {
    	g.setFont(new Font("Courier New",Font.BOLD,16));
    	g.setColor(Color.blue);
    	g.drawString("Playing the Sound ",20, 30);
    } 
}

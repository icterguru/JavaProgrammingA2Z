package chapter17;
/* J17_21.java	*/
/* Loading and Playing Sound  */
import java.awt.*;
import java.applet.*;
public class J17_21 extends Applet
{
Panel  panel1;
Button Sound1;
Button Sound2;
Button Sound3;
Label label1;
AudioClip CurrentSound;
AudioClip S1;
AudioClip S2;
AudioClip S3;
public void init()
{
resize(300,200);
setLayout(null);
resize(498,204);

panel1=new Panel();
panel1.setLayout(null);
add(panel1);
panel1.reshape(7,8,476,142);

Sound1=new Button("Sound 1");
Sound1.setFont(new Font("Dialog",Font.BOLD,12));
panel1.add(Sound1);
Sound1.reshape(35,59,91,30);

Sound2=new Button("Sound 2");
Sound2.setFont(new Font("Dialog",Font.BOLD,12));
panel1.add(Sound2);
Sound2.reshape(189,59,91,30);

Sound3=new Button("Sound 3");
Sound3.setFont(new Font("Dialog",Font.BOLD,12));
panel1.add(Sound3);
Sound3.reshape(336,59,91,30);

label1=new Label("Click a Button To Play a Sound");
label1.setFont(new Font("Helvetica",Font.BOLD,16));
panel1.add(label1);
label1.resize(label1.preferredSize());
label1.move(112,23);

// Loading Sound Files
S1=getAudioClip(getCodeBase(),"Chirp1.au");
S2=getAudioClip(getCodeBase(),"Computer.au");
S3=getAudioClip(getCodeBase(),"Drip.au");
CurrentSound=getAudioClip(getCodeBase(),"Crirp1.au");
CurrentSound.play();
}
public boolean handleEvent(Event event) 
{
if (event.id == Event.ACTION_EVENT && event.target
== Sound3) {
CurrentSound.stop();
clickedButton3();
return true;
}
else
if (event.id == Event.ACTION_EVENT && event.target
== Sound2) {
CurrentSound.stop();
clickedButton2();
return true;
}
else
if (event.id == Event.ACTION_EVENT && event.target
== Sound1) {
CurrentSound.stop();
clickedButton1();
return true;
}
return super.handleEvent(event);
}
public void clickedButton1() 
{
 CurrentSound=S1;
 CurrentSound.play();
}
public void clickedButton2() 
 {
 CurrentSound=S2;
 CurrentSound.play();
 }
public void clickedButton3()
 {
 CurrentSound=S3;
 CurrentSound.play();
 }
public void paint(Graphics g) { }

}

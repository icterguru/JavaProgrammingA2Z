/* J20_04.java	*/
/* Demonstrating UDP Connection.  */
import java.net.* ;
public class J20_04
{
public static void main (String args[ ]) throws Exception  
 {
  InetAddress    IPAddress ;
  DatagramPacket dgPacket ;
  DatagramSocket dgSocket ;
  byte Msg[ ] = new byte [100] ;
  dgSocket  = new DatagramSocket() ;
  IPAddress = InetAddress.getByName ("www.du.bangla.net") ;
  dgPacket = new DatagramPacket (Msg,Msg.length,IPAddress,13);
		// 13 is the daytime port number
  dgSocket.send(dgPacket) ;
  dgPacket = new DatagramPacket (Msg, Msg.length) ;
  dgSocket.receive(dgPacket) ;
  String T = new String (dgPacket.getData()) ;
  System.out.println ("Current Date and Time is: \n" + T) ;
  dgSocket.close() ;
 }
}

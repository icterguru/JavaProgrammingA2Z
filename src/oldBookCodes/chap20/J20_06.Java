/* J20_01.java  */
/* Loading and Playing Sound  */
import java.net.*;

class J20_01 
{
  public static void main(String args[]) throws UnknownHostException {
    InetAddress Address = InetAddress.getLocalHost();
    System.out.println(Address);
    Address = InetAddress.getByName("yahoo.com");
    System.out.println(Address);
    InetAddress SW[] = InetAddress.getAllByName("www.du.bangla.net");
    for (int i=0; i<SW.length; i++)
      System.out.println(SW[i]);
  }
}

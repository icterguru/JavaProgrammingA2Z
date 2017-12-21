/* J20_02.java  */
/* Converting Internet Address to Corresponding IP Address */
import java.net.*;

public class J20_02 
{
  public static void main(String args[]) throws UnknownHostException {
    InetAddress Address = InetAddress.getLocalHost();
    System.out.print("\nLocal Host : \n" + Address);
    InetAddress SW[] = InetAddress.getAllByName("www.du.bangla.net");
    System.out.print("\nRemote Host : \n");
    for (int i=0; i<SW.length; i++)
      System.out.println(SW[i]);

  }
}

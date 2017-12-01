package chapter15;
/* J15_12.java */
/* Implementing Array of Object using Vector */
import java.io.*;
 public class J15_12
{
public static void main(String args[]) throws IOException
 {
  RandomAccessFile rf = new RandomAccessFile("c:\\randfile.txt", "rw");
  rf.writeInt(101);
  rf.writeDouble(75.50);
  rf.writeChar('A');
  rf.seek(0); // Move file pointer to location 0
  System.out.println("Accessing Random File: ");
  System.out.println("Roll : " + rf.readInt());
  System.out.println("Marks: " + rf.readDouble());
  System.out.println("Grade: " + rf.readChar());
  rf.seek(0); // Move file pointer to location 0
  rf.close();
 }
}

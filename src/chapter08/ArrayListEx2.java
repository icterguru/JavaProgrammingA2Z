package chapter08;
//ArrayListEx2.java

import java.util.*;

public class ArrayListEx2 {
   public static void main(String args[]) {
      // create an array list
      ArrayList<String> al = new ArrayList<String>();
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      al.add("Mahdi");
      al.add("Munim");
      al.add("Myesha");
      al.add("Myeda");
      al.add("Mithila");
      al.add("Mitul");
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al);
      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
   }
}

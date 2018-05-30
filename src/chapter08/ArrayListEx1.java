package chapter08;
// ArrayListEx1.java
// http://www.tutorialspoint.com/java/java_arraylist_class.htm

import java.util.*;

public class ArrayListEx1 {
   public static void main(String args[]) {
      // create an array list
	   
      ArrayList al = new ArrayList();
      
      System.out.println("Initial size of al: " + al.size());

      // add elements to the array list
      
      al.add("Mahdi");
      al.add("Munim");
      al.add("Myesha");
      al.add("Myeda");
      al.add("Mithila");
      al.add("Mitul");
      //al.add(1, "A2");
      al.add(5, "Mokter" + " " + "Hossain");
      
      System.out.println("Size of al after additions: " + al.size());

      // display the array list
      System.out.println("Contents of al: " + al );
      // Remove elements from the array list
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " + al.size());
      System.out.println("Contents of al: " + al);
   }
}

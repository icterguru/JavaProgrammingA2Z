package chapter08;
//VectorEx1.java

import java.util.*;

public class VectorEx1 {
   public static void main(String args[]) {
      // create a vector
	  Vector<String> vector = new Vector<String>();
      
      System.out.println("Initial size of al: " + vector.size());
      
      // add elements to the vector
      vector.add("Mahdi");
      vector.add("Munim");
      vector.add("Myesha");
      vector.add("Myeda");
      vector.add("Mithila");
      vector.add("Mitul");
      vector.add(1, "A2");
      System.out.println("Size of al after additions: " + vector.size());

      // display the array list
      System.out.println("Contents of al: " + vector);
      // Remove elements from the vector
      vector.remove("F");
      vector.remove(2);
      System.out.println("Size of al after deletions: " + vector.size());
      System.out.println("Contents of al: " + vector);
   }
}

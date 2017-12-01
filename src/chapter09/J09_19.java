package chapter09;
/* J09_19.java    */
/* Automatic Initialization of Static Member variable */
class Static {
 static int i;
 void display(){
   System.out.println(" Value of Static Member Variable : " + i);
   }
  }  
 public class J09_19 {
public static void main(String args[]){
 Static S1 = new Static() ; 
 Static S2 = new Static() ; 
 S1.display(); 		// displays 0
 S2.display(); 		// Again displays 0
 }
} 

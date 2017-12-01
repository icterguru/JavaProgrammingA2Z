package chapter09;
/*        J09_20.java   */
/* Auto Initialization of Static Member variable */
class Static {
static int i;
Static(){	// Constructor Function
 ++i; 
 }
void display() {
 System.out.print(" Number of Objects Created : " + i);
 }
}

 public class J09_20 {
public static void main(String args[]){
Static S1 = new Static() ; 
Static S2 = new Static() ; 
Static S3 = new Static() ; 
Static S4 = new Static() ; 
Static S5 = new Static() ; 
S5.display();
 }
} 

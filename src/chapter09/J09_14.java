package chapter09;
/* J09_14.java    */
/* Example of Argumented Method */
class Student {
  public int  Roll;	
  protected String Name;
  private float Mark;	

 void setData(int R, String N, float M) {
   this.Roll = R ;
   this.Name = N; 
   this.Mark =M ;
   }
 void display(){
   System.out.println("Roll is : " + Roll);                 
   System.out.println("Name is : " + Name);                 
   System.out.println("Mark is : " + Mark) ;
   }
  }  

 public class J09_14 {
 public static void main(String args[]){
  Student S = new Student();	// Creating object
 S.setData(101, "Ritu", 85);  // Calling Argumented Method
 S.display();
 }
} 

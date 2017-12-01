package chapter11;
/* AbstractClassEx01.java */
/* Inheriting Abstract Base class/ Abstract Member */
abstract class Mammal{
  abstract  public void move();
  public void nonAbstractMethod()
  {
	  System.out.println("Mammal::nonAbstractMethod()");
	  // ...
  }
}

class Human extends Mammal{
	public void move(){
      System.out.println("Human can't fly but can walk and run");
   }

   public void talk(){
      System.out.println("Human can talk");
   }

   @Override
   public void nonAbstractMethod()
   {
 	  System.out.println("Human::nonAbstractMethod()");
   }
}

class Bird extends Mammal{

	@Override
	public void move(){
      System.out.println("Birds can walk, fly, and run");
   }
	public void fly(){
      System.out.println("Birds can fly");
   }

	  @Override
	   public void nonAbstractMethod()
	   {
	 	  System.out.println("Bird::nonAbstractMethod()");
	 	  // ...
	   }
}

public class AbstractClassEx01{

   public static void main(String args[]){

	   Human h0 = new Human();   // Human reference and Human object
	   // Here h0 is a Human object that references to a Human type

	   Human h1 = h0;   // Human reference and Human object
	   // Here h1 and h0 both reference to a Human type

	   Mammal h2 = new Human(); // Mammal reference and Mammal object
	   // Here h2 is a Human object that references to a Mammal type

	   Bird b1 = new Bird(); // Birds reference and Birds object
	   // Here b1 is a Bird object that references to a Birds type

	   Mammal b2 = new Bird(); // Mammals reference and Birds object
	   // Here h2 is a Bird object that is a reference to a Mammal type

      b1.move();
      b1.fly();
      b1.nonAbstractMethod();


      h1.move();
      h1.talk();
      h1.nonAbstractMethod();
      h2.move();
      // h2.talk();  //  Not allowed
      h2.nonAbstractMethod();
      b2.move();
      // b2.fly(); //  Not allowed
   }
}

package chapter09;
// http://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
/*	CallByValueEx01.java   */
/*   Example of Call by Value Process  */

class ADog {
	String name;

	public String getName() {  // getter method
		return  name;
	}

	public  ADog(String name){
		this.name = name;
	}
}

public class CallByValueEx01
{
	public static void main( String[] args ){
		ADog aDog = new ADog("Max");
		foo(aDog); // Here aDog is ADog Object that is also a reference of ADog type
		if (aDog.getName().equals("Max")) { //true
			System.out.println( "Java passes arguments by (object) value." );

		} else if (aDog.getName().equals("Fifi")) {
			System.out.println( "Java passes arguments by (object) reference." );
		}
	}

	public static void foo(ADog d)
	  // Here d is a reference of ADog type but not an object of ADog
	{
		d.getName().equals("Max"); // true

		d = new ADog("Fifi");
		d.getName().equals("Fifi"); // true
	}

}

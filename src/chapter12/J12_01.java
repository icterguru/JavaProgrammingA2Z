package chapter12;
/*		J12_01.java	 */	
/*  	Program to Double a Number using Function Overloading  */

class DoubleValue {
int Double (int Number){
int D;
D = Number * 2 ;
System.out.println("Double of the integer " + Number +" is " + D);
return 0;
}

long Double (long Number){
long D;
D = Number * 2 ;
System.out.println("Double of the long " + Number +" is " + D);
return 0;
}

float Double(float Number){
float D;
D = Number * 2 ;
System.out.println("Double of the float " + Number +" is " + D);
return 0;
}

float  Double(double Number){
double  D;
D = Number * 2 ;
System.out.println("Double of the double " + Number +" is " + D);
return 0;
}

}
 public class J12_01{
public static void main(String Args[]){
DoubleValue Obj = new DoubleValue();
Obj.Double(2);
Obj.Double(65575);
Obj.Double(655.75);
Obj.Double(3.4E45);
}
}

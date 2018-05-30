/* C:\JavaCode\Chap12\Pack08\Class08.java */
/*  A Package with Multiple Classes  */
package  Pack08;
class Class07   // friendly (default) class
{
public void Display()
 {
  System.out.println("Display() in Class Class07 of Pack08");
 }
}
public class Class08   // public class 
{
public void Display()
 {
   System.out.println("Display() in Class Class08 of Pack08");
  Class07 Obj07 = new Class07();
  Obj07.Display();
 }
}

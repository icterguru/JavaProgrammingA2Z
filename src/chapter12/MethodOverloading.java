package chapter12;

 class Overloading
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    
    void demo (float x)
    {
       System.out.println ("float x: " + x);
    }
   
    
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    
    void demo (String name)
    {
       System.out.println ("name: " + name);
    }
    
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}

 public class MethodOverloading
{
    public static void main (String args [])
    {
       Overloading Obj = new Overloading();
        double result;
        
        Obj .demo("Mokter Hossain");
        
        Obj .demo(10, 20);

        Obj .demo(1000);
        Obj .demo(10.00f);
        
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}

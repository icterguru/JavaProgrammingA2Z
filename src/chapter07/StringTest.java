package chapter07;
/* StringTest.java */
/* A Simple Program using String Object */

public class StringTest
{
    private static String a = "hello world";
    private static String b = "hello world";
    private static String c = "hello " + "world";
    private static String d = new String("hello world");

    private static Object o1 = new Object();
    private static Object o2 = new Object();

    public static void main(String[] args)
    {
    	// TODO Auto-generated method stub


    	System.out.println("a==b:"+(a == b));
    	System.out.println("a==c:"+(a == c));

    	System.out.println("a==d:"+(a == d));
    	System.out.println("a.equals(d):"+(a.equals(d)));



    	System.out.println("o1==o2:"+(o1 == o2));

    	passString(a);
    	passString(d);

    }

    public static void passString(String s)
    {
    	System.out.println("passString:"+(a == s));
    }

}

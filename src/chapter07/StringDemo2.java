package chapter07;
// StringDemo2.java
public class StringDemo2 {

  public static void main (String args[]) {
    String str1 = "Hello";
    String str2 = "Hello";
    System.out.println("str1 and str2 are created by using string literal.");
    System.out.println("Hashcode of str1 " + str1.hashCode() );
    System.out.println("Hashcode of str2 " + str2.hashCode() );

    System.out.println("    str1 == str2 is " + (str1 == str2));
    System.out.println("    str1.equals(str2) is " + str1.equals(str2));


    String str3 = new String("Hello");
    String str4 = new String("Hello");
    System.out.println("str3 and str4 are created by using new operator.");

    System.out.println("Hashcode of str3 " + str3.hashCode() );
    System.out.println("Hashcode of str4 " + str4.hashCode() );

    System.out.println("    str3 == str4 is " + (str3 == str4));
    System.out.println("    str3.equals(str4) is " + str3.equals(str4));

    String str5 = "Hel"+ "lo";
    String str6 = "He" + "llo";
    System.out.println("str5 and str6 are created by using string constant expression.");

    System.out.println("Hashcode of str5 " + str5.hashCode() );
    System.out.println("Hashcode of str6 " + str6.hashCode() );

    System.out.println("    str5 == str6 is " + (str5 == str6));
    System.out.println("    str5.equals(str6) is " + str5.equals(str6));

    String s = "lo";
    String str7 = "Hel"+ s;
    String str8 = "He" + "llo";
    System.out.println("str7 is computed at runtime.");
    System.out.println("str8 is created by using string constant expression.");

    System.out.println("Hashcode of str7 " + str7.hashCode() );
    System.out.println("Hashcode of str8 " + str8.hashCode() );

    System.out.println("    str7 == str8 is " + (str7 == str8));
    System.out.println("    str7.equals(str8) is " + str7.equals(str8));

  }
}

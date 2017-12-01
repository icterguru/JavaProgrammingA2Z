package chapter07;
/* J07_06_Alt.java */
/* Array of String Objects */

public class J07_06_Alt
{
    String[] Menu ={"File","Edit","View","Window","Help"};

    // Method to display Menu items
    public void display()
    {
for (String m: Menu){
            System.out.print(m + "\t");
        }    }

    public static void main(String[] args)
    {
    	J07_06_Alt sa1 = new J07_06_Alt();
    	sa1.display();
    }
}

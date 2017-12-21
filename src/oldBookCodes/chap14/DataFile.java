import java.io.*;
import java.util.*;

public class DataFileTest
{  
	static void writeData(Employee[] e, PrintWriter out) 
      throws IOException
   {  
   	  out.println(e.length);
      int i;
      for (i = 0; i < e.length; i++)
         e[i].writeData(out);
   }
   
   static Employee[] readData(BufferedReader in) 
      throws IOException
   {  
   	  int n = Integer.parseInt(in.readLine());
      Employee[] e = new Employee[n];
      int i;
      for (i = 0; i < n; i++)
      {  
      	 e[i] = new Employee();
         e[i].readData(in);
      }
      return e;
   }
         

   public static void main(String[] args)
   {  
   	  Employee[] staff = new Employee[3];

      staff[0] = new Employee("Mahbubul Alam", 35500, 
         new Day(1989,10,1));
      staff[1] = new Employee("Mariam Jamila", 75000, 
         new Day(1987,12,15));
      staff[2] = new Employee("Nishat Naila", 38000, 
         new Day(1990,3,15));
      int i;
      for (i = 0; i < staff.length; i++)
         staff[i].raiseSalary(5.25);
      
      try
      {  
      	 PrintWriter out = new PrintWriter(new 
            FileWriter("employee.dat"));
         writeData(staff, out);
         out.close();
      }
      catch(IOException e)
      {  
      	 System.out.print("Error: " + e);
         System.exit(1);
      }
      
      try
      {  
      	 BufferedReader in = new BufferedReader(new 
            FileReader("employee.dat"));   
         Employee[] e = readData(in);
         for (i = 0; i < e.length; i++) e[i].print();
         in.close();
      }
      
      catch(IOException e)
      {  
      	 System.out.print("Error: " + e);
         System.exit(1);
      }
   }
}


class Employee
{  
   public Employee(String n, double s, Day d)
   {  
   	  name = n;
      salary = s;
      hireDay = d;
   }
   
   public Employee() {}
   
   public void print()
   {  
   	  System.out.println(name + " " + salary 
         + " " + hireYear());
   }
   
   public void raiseSalary(double byPercent)
   {  
   	 salary *= 1 + byPercent / 100;
   }
   
   public int hireYear()
   {  
   	 return hireDay.getYear();
   }
   
   public void writeData(PrintWriter out) throws IOException
   {  
   	 out.println(name + "|" 
         + salary + "|" 
         + hireDay.getYear() + "|"
         + hireDay.getMonth() + "|"
         + hireDay.getDay());
   }

   public void readData(BufferedReader in) throws IOException
   {  
   	  String s = in.readLine();
      StringTokenizer t = new StringTokenizer(s, "|");
      name = t.nextToken();
      salary = Double.parseDouble(t.nextToken());
      int y = Integer.parseInt(t.nextToken());
      int m = Integer.parseInt(t.nextToken());
      int d = Integer.parseInt(t.nextToken());
      hireDay = new Day(y, m, d);
   }

   private String name;
   private double salary;
   private Day hireDay;
}


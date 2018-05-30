class Employee

{  
   public Employee(String n, double s, Day d)
   {  
   	  name = n;
      salary = s;
      hireDay = d;
   }

   public void print()
   {  
   	  System.out.println(name + " " + salary + " " 
         + hireYear());
   }

   public void raiseSalary(double byPercent)
   {  
   	  salary *= 1 + byPercent / 100;
   }

   public int hireYear()
   {  
   	  return hireDay.getYear();
   }

   private String name;
   private double salary;
   private Day hireDay;
}

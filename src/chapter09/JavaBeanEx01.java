package chapter09;
/*	JavaBeanEx01.java  */
/* Use of JavaBean */ 

import java.io.Serializable;

class Employee implements Serializable{
	private int id;
	private String name;

	public Employee(){
		// Empty
	}

	public void setId(int id){
		this.id=id;
		}

	public int getId(){
		return id;
		}

	public void setName(String name){
		this.name=name;
		}

	public String getName(){
		return name;
		}
}

public class JavaBeanEx01 {
	public static void main(String args[]){

		Employee e=new Employee();//object is created

		e.setName("Mahdi Munim");//setting value to the object

		System.out.println(e.getName());

	}
}

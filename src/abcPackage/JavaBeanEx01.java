package abcPackage;

import java.io.Serializable;

class Employee implements Serializable{
	
	private int id;
	private String name;

	public Employee(){
		// Empty
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class JavaBeanEx01 {
	public static void main(String args[]){

		Employee e = new Employee();//object is created

		e.setName("Mahdi Munim");//setting value to the object

		System.out.println(e.getName());

		e.setId(1001);//setting value to the object
		System.out.println(e.getId());
	}
}

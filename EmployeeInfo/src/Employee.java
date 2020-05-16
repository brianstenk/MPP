//import java.util.*;
public class Employee extends Person {
	 private String hireDate;
	 private double salary;
	 
	 public Employee(String name, int age, String hireDate, double salary) {
		super(name, age);
		this.hireDate = hireDate;
		this.salary =  salary;
		// TODO Auto-generated constructor stub
	}

	 public static void main(String[] args) {
		Employee emp = new Employee("Brian", 46, "2019-09-09", 10000.0);
		emp.setName("Emile");
		System.out.println(emp.getName() +" earns "+emp.salary);
		System.out.println("The Employee was hired on "+emp.getHiredate());
	}
	
	public static String  getHiredate(){
		return hireDate;
	}
	 
}

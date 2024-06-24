//Employee class to represent an employee with name and salary
class Employee {
	private String name;// Private attribute to store employee name
	private double salary; // Private attribute to store employee salary

	// Getter for employee name
	public String getName() {
		return name;
	}

	// Setter for employee name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for employee salary
	public double getSalary() {
		return salary;
	}

	// Setter for employee salary
	public void setSalary(double salary) {
		this.salary = salary;
	}

}

//Main class EmployeeAccessModifiers to demonstrate Employee class functionality
public class EmployeeAcessModifiers {

	public static void main(String[] args) {
		// Creating instances of Employee and setting attributes
		Employee employee1 = new Employee();
		employee1.setName("Harsha");
		employee1.setSalary(40000);

		Employee employee2 = new Employee();
		employee2.setName("Max");
		employee2.setSalary(50000);

		// Displaying employee details
		System.out.println("Employee details");
		System.out.println(employee1.getName() + "'s salary is " + employee1.getSalary());
		System.out.println(employee2.getName() + "'s salary is " + employee2.getSalary());
	}

}

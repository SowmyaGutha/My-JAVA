package MyPackage;

class Employee
{
	int age;
	String name;
	String designation;
	double salary;
	
	public Employee (String eName)
	{
		this.name = eName;
	}
	public void setAge(int eAge)
	{
		this.age=eAge;
	}
	public void setDesignation(String eDesignation)
	{
		this.designation=eDesignation;
	}
	public void setSalary(double eSalary)
	{
		this.salary=eSalary;
	}
	public void printEmployeeDetails()
	{
		System.out.println("Employee Name : " + name);
		System.out.println("Employee Age : " + age);
		System.out.println("Employee Designation : " + designation);
		System.out.println("Employee Salary : " + salary);
	}
}

public class EmployeeTest {
public static void main(String[] args) {
	Employee e = new Employee("Sowmya");
	e.setAge(26);
	e.setDesignation("Tester");
	e.setSalary(30000);
	e.printEmployeeDetails();
	System.out.println();
	Employee e1 = new Employee("Ramya");
	e1.setAge(24);
	e1.setDesignation("\"House maker\"");
	e1.setSalary(3000);
	e1.printEmployeeDetails();
}
}

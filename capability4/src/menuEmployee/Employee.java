package menuEmployee;

public class Employee {
	int empID;
	String name;
	String department;
	double salary;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee ID : "+getEmpID());
		System.out.println("Employee Name : "+getName());
		System.out.println("Employee Department : "+getDepartment());
		System.out.println("Employee Salary"+getSalary());
	}
}

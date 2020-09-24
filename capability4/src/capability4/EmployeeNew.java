package capability4;
import java.util.*;
public class EmployeeNew {

	static Scanner scanner = new Scanner(System.in);
	public int empID;
	public String empName,empDesig,empDept;
	
	EmployeeNew()
	{
		empID=0;
		empName=""; empDesig="" ; empDept="";
	}
	
	EmployeeNew(int empid, String empname, String empdesig, String empdept)
	{
		this.empID=empid;
		this.empName=empname;
		this.empDesig=empdesig;
		this.empDept=empdept;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		
		System.out.println("Enter the number of employees : ");
		n=scanner.nextInt();
		EmployeeNew[] emp = new EmployeeNew[n];
		for(i=0;i<n;i++)
		{
			emp[i] = new EmployeeNew();
			System.out.println("Enter the details of employee "+(i+1));
			System.out.println("Enter Employee ID : ");
			int empid= scanner.nextInt(); 
			emp[i].setempID(empid);
			System.out.println("Enter Employee Name : "); scanner.nextLine();
			String name = scanner.nextLine();
			emp[i].setEmpName(name);
			
			System.out.println("Enter Employee Designation : ");
			String desig = scanner.nextLine();
			emp[i].setDesig(desig);
			
			System.out.println("Enter Employee Dept : ");
			String dept = scanner.nextLine();
			emp[i].setDept(dept);		
		}
		
		System.out.print("Employee details : ");
		for(i=0;i<n;i++)
		{
			System.out.println("employee "+i+1);
			System.out.println("Employee ID : "+emp[i].getEmpID());
			System.out.println("Employee Name : "+emp[i].getName());
			System.out.println("Employee Designation : "+emp[i].getDesignation());
			System.out.println("Employee Dept : "+emp[i].getDept());
		}
		
	}

	private String getDept() {
		
		return this.empDept;
	}

	private String getDesignation() {
		return this.empDesig;
	}

	private String getName() {
		return this.empName;
	}

	private void setempID(int empID2) {
		this.empID=empID2;
		
	}

	private int getEmpID() {
		
		return this.empID;
	}

	private void setDept(String empDept2) {
		String check2=empDept2.toLowerCase();
		if((check2.equals("tth")) || (check2.equals("rcm")) || (check2.equals("digital")) || (check2.equals("devops")))
			this.empDept=empDept2;
		else
			System.out.print("Invalid Department.");
	}

	private void setDesig(String empDesig2) {
		
		String check=empDesig2.toLowerCase();
		if((check.equals("developer")) || (check.equals("tester")) || (check.equals("lead")) || (check.equals("manager")))
			this.empDesig=empDesig2;
		else
			System.out.print("Invalid Designation.");
	}

	private void setEmpName(String empName2) {
		// TODO Auto-generated method stub
		int k = empName2.length();
		if(k>0)
			this.empName = empName2;
		else
			System.out.print("Null occured.");
	}

}

package menuEmployee;
import java.util.*;

import capability4.EmployeeNew;
public class menuApp {
	static Scanner scanner = new Scanner(System.in); 
	static int i,j;
	public static void main(String[] args) {
		
		System.out.println("Enter no. of employees : ");
		int n=scanner.nextInt();
		Employee[] emp = new Employee[n]; char ch;
		do {
		System.out.print("Menu : \n"
				+ "1. Add Employee Details\n"
				+ "2. Display Employee Names in sorted order based on branch (alphabetical order)\n"
				+ "3. Display Employee ID in ascending order\n"
				+ "4. Display Employee details who has salary > 50000\n"
				+ "5. Exit");
		System.out.println("Enter your choice : ");
		int choice = scanner.nextInt();
		
		
		switch(choice) {
		case 1: addEmpDetails(emp,n);break;
		case 2: SortNames(emp,n); 
				System.out.println("Names based on Branch : ");
				dispNames(emp);
				break;
		case 3: SortID(emp,n);
				System.out.println("IDs in ascending order : ");
				dispID(emp);
				break;
		case 4:System.out.println("Employee details having salary >50000 : ");
				Salary50k(emp);
				break;
		case 5:System.out.println("Exited Successfully"); System.exit(0); break;
		default:System.out.println("Enter valid choice.");
		}
		System.out.println("Do you want to continue ? Press y/Y to continue or any other key to discontinue.");
		ch=scanner.next().charAt(0);
		if(!(ch=='y'||ch=='Y'))
			System.out.println("Thank you !!!");
		}while(ch=='y'||ch=='Y');
		
	}
	
	private static void Salary50k(Employee[] emp) {
		
		for(i=0;i<emp.length;i++)
			if(emp[i].getSalary()>50000)
			{
				showDetails(emp[i]);
			}
				
	}
	private static void showDetails(Employee employee) {
		System.out.println("Employee ID : "+employee.getEmpID());
		
		System.out.println("Employee Name : "+employee.getName()); 
		
		System.out.println("Employee Department : "+employee.getDepartment());
		
		System.out.println("Employee Salary : "+employee.getSalary());
		
	}

	private static void dispID(Employee[] emp2) {
		for(i=0;i<emp2.length;i++)
			System.out.println(emp2[i].empID+" ");
		
	}
	private static void SortID(Employee[] emp, int n) {
		Employee temp = new Employee();
		for(i=0;i<n;i++)
			for(j=0;j<n-i-1;j++)
				if(emp[j].getEmpID()>emp[j+1].getEmpID())
				{
					temp=emp[j];
					emp[j]=emp[j+1];
					emp[j+1]=temp;		
				}
	//	return emp;
	}
	private static void dispNames(Employee[] emp) {
		for(i=0;i<emp.length;i++)
			System.out.println(emp[i].getName()+" ");
		
	}
	private static void SortNames(Employee[] emp, int n) {
		
		Employee temp = new Employee();
		for(i=0;i<n;i++)
			for(j=0;j<n-i-1;j++)
				if((emp[j].getDepartment().compareTo(emp[j+1].getDepartment())>0))
				{
					temp=emp[j];
					emp[j]=emp[j+1];
					emp[j+1]=temp;
				}
		
	//	return emp;
	}
	
	private static void addEmpDetails(Employee[] E, int n) {
	//	Employee[] emp1 = new Employee[n];
		for(i=0;i<n;i++)
		{
			E[i] = new Employee();
			System.out.println("Enter the details of employee "+(i+1));
			System.out.println("Enter Employee ID : ");
			int empid= scanner.nextInt(); 
			E[i].setEmpID(empid);
			System.out.println("Enter Employee Name : "); scanner.nextLine();
			String name = scanner.nextLine();
			E[i].setName(name);;
			
			System.out.println("Enter Employee Department : ");
			String dept = scanner.nextLine();
			E[i].setDepartment(dept);
			
			System.out.println("Enter Employee Salary : ");
			double salary = scanner.nextDouble();
			E[i].setSalary(salary);		
			
		}
	//	return emp1;
	}
}

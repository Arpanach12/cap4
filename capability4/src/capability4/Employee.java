package capability4;
import java.util.*;
public class Employee {

	static Scanner scanner = new Scanner(System.in);
	private int empID;
	private String empName,empDesig,empDept;
	
	Employee()
	{
		empID=0;
		empName=""; empDesig="" ; empDept="";
	}
	
	Employee(int empid, String empname, String empdesig, String empdept)
	{
		empID = empid;
		if(isEmpName(empname)>0)
		{
		empName =empname;
		 if(isempDesig(empdesig)==true)
		  {
			 empDesig = empdesig;
			 if(isempDept(empdept)==true)
			  empDept=empdept;
			 else
				 System.out.print("invalid department"); 
		  }
		 else
			 System.out.print("invalid designation");
		}
		else
			System.out.print("Null Occured");
	}
	
	void getDetails()
	{
		int count=0,count2=0,count3=0;
		System.out.println("Enter employee Details ");
		System.out.println("Enter Employee ID : ");
		empID = scanner.nextInt();
		System.out.println("Enter Employee Name : "); scanner.nextLine();
		empName = scanner.nextLine();
		do
		{
		if(isEmpName(empName)>0 && count<1)
		{
		count=count+1; 
		System.out.println("Enter Employee Designation : ");
		empDesig = scanner.nextLine();
			 do
			 {
		     if(isempDesig(empDesig)==true && count2<1)
		     {
		    	count2=count2+1; 
			    System.out.println("Enter Employee Dept : ");
		        empDept = scanner.nextLine();
		        do
		        {   
		        if(isempDept(empDept)==true && count3<1)
		         count3=count3+1; 
		        else
		        {
		        	System.out.println("Invalid Dept. Try Again");
			    	 System.out.println("Enter Employee Dept : ");
				     empDept = scanner.nextLine();
		        }
		        	
		        }while(count3<1);
		     }
		     else
		     {
		    	 System.out.println("Invalid Designation. Try Again");
		    	 System.out.println("Enter Employee Designation : ");
		 		empDesig = scanner.nextLine();
		     }
			 }while(count2<1);
		}
		else
			{
			System.out.println("Null encountered. Try Again");
			System.out.println("Enter Employee Name : ");
			empName = scanner.nextLine();
			}

	}while(count<1);
	}
	
	private boolean isempDept(String empDept2) {
		// TODO Auto-generated method stub
		String check2=empDept2.toLowerCase();
		if((check2.equals("tth")) || (check2.equals("rcm")) || (check2.equals("digital")) || (check2.equals("devops")))
			return true;
			else
				return false;
		
	}

	private boolean isempDesig(String empDesig2) {
		// TODO Auto-generated method stub
		String check=empDesig2.toLowerCase();
		if((check.equals("developer")) || (check.equals("tester")) || (check.equals("lead")) || (check.equals("manager")))
		return true;
		else
			return false;
	}

	private int isEmpName(String empName2) {
		// TODO Auto-generated method stub
		int i=empName2.length()-1;
		if(i>0)
		return 1;
		else
			return 0;
	}

	void setDetails()
	{
		System.out.println();
		System.out.println("Employee ID : "+empID);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Designation : "+empDesig);
		System.out.println("Employee Dept : "+empDept);
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.setDetails();
		Employee emp2 = new Employee(101,"Joseph","designer","Sales");
		emp2.setDetails();
		Employee emp3=new Employee();
		emp1.getDetails();
		emp1.setDetails();
	}

}

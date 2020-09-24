package xyzbank;
import java.util.*;

public class xyzmain {

	public static void main(String[] args) {
	
		bank customer1 = new bank(1001,"Kumar","Rajajinagar,Bangalore-10");
		bank customer2 = new bank(1002,"Raja");
		bank customer3 = new bank(1003,"Shanti","jayanagar,Bangalore-20","SB",1500);
		
		System.out.println("Customer 1 ID : "+customer1.custID);
		System.out.println("Customer 1 Name : "+customer1.custName);
		System.out.println("Customer 1 Address : "+customer1.custAddress);
		
		System.out.println("Customer 2 ID : "+customer2.custID);
		System.out.println("Customer 2 Name : "+customer1.custName);
		
		System.out.println("Customer 3 ID : "+customer3.custID);
		System.out.println("Customer 3 Name : "+customer3.custName);
		System.out.println("Customer 3 Address : "+customer3.custAddress);
		System.out.println("Customer 3 ID : "+customer3.accType);
		System.out.println("Customer 3 Name : "+customer3.custBalance);
	}

}

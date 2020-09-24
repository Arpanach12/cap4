package CoffeShop;
import java.util.*;
public class customerApp {
static Scanner scanner= new Scanner(System.in); 
static int i;
	public static void main(String[] args) {
		System.out.println("Enter number of customers : ");
		int n = scanner.nextInt();
		Customer[] customer = new Customer[n];
		
		customer=setCustomer(customer,n);
		
		getCustomer(customer);
		
		System.out.println("Average Feedback Rating is : "+(float)avgFeedbackRating(customer,n));
		
		Customer max = new Customer();
		Customer min = new Customer();
		max = maxRating(customer,n);  
		
		System.out.println("Max Rating Customer Details : ");
		disp(max);
		
		min = minRating(customer,n);  
		System.out.println("Min Rating Customer Details : ");
		disp(min);
		
		
		
	}
	
		private static void disp(Customer max) {
			System.out.println("Maximum rating :  "+max.getFeedbackRating());
			System.out.println("Customer details : ");
			System.out.println("Customer's Name : "+max.getName());
			System.out.println("Customer's Mobile no. : "+max.getMobileNo());

		
	}

		private static void getCustomer(Customer[] customer) {
			for(i=0;i<customer.length;i++)
			{
				System.out.println("Cutomer "+(i+1)+" details : ");
				System.out.println("Customer's Name : "+customer[i].getName());
				System.out.println("Customer's Mobile no. : "+customer[i].getMobileNo());
				System.out.println("Customer's Feedback Rating out of 5: "+customer[i].getFeedbackRating());
			}
			
		
	}

		private static Customer[] setCustomer(Customer[] customer,int n) {
			for(i=0;i<n;i++)
			{
				customer[i]=new Customer();
				System.out.println("Enter cutomer "+(i+1)+" details : "); 
				System.out.println("Enter Customer's Name : ");scanner.nextLine();
				String name = scanner.nextLine(); customer[i].setName(name);
				System.out.println("Enter Customer's Mobile no. : ");
				String mobile = scanner.nextLine(); customer[i].setMobileNo(mobile);
				System.out.println("Enter Customer's Feedback Rating out of 5 : ");
				double rating = scanner.nextDouble(); customer[i].setFeedbackRating(rating);
			}
			return customer;
	}

		private static Customer minRating(Customer[] customer, int n) {
		
		Customer min = new Customer();
		min=customer[n-1];
		for(i=0;i<n;i++)
			if(min.getFeedbackRating()>customer[i].getFeedbackRating())
				min=customer[i];
		return min;
		}
		
	private static Customer maxRating(Customer[] customer, int n) {
		
		Customer max = new Customer();
		max=customer[0];
		for(i=0;i<n;i++)
			if(max.getFeedbackRating()<customer[i].getFeedbackRating())
				max=customer[i];
		return max;
		
	}
	private static double avgFeedbackRating(Customer[] customer, int n) {
	
		double sum=0;
		for(i=0;i<n;i++)
			sum=sum+customer[i].getFeedbackRating();
		return sum/n;
	}

}

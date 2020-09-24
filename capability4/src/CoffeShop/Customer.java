package CoffeShop;
import java.util.*;
public class Customer {
	static Scanner  scanner =new Scanner(System.in);
	String name;
	String MobileNo;
	double feedbackRating;
	public String getName() {
		return name;
	}
	Customer() {
		
	}
	
	Customer(String name,String MobileNo,double feedbackRating) {
		this.name=name;
		this.MobileNo=MobileNo;
		this.feedbackRating=feedbackRating;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public double getFeedbackRating() {
		return feedbackRating;
	}
	public void setFeedbackRating(double feedbackRating) {
		this.feedbackRating = feedbackRating;
	}
}
